package DataStructure.Stack;/**
 * Created by Ahmed Samir on 2/13/17.
 */

import java.util.Scanner;

// Passed
public class LargestRectangle4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        long maxSoFar = Long.MIN_VALUE, max = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int len = 1, j = i, k = i, min = arr[i];
            max = len * arr[i];
            while (j + 1 < n) {
                int valMin = Math.min(min, arr[j + 1]);
                long val = valMin * (len + 1);
                if (val > max) {
                    min = valMin;
                    max = val;
                    len++;
                    j++;
                } else
                    break;
            }
            while (k - 1 >= 0) {
                int valMin = Math.min(min, arr[k - 1]);
                long val = valMin * (len + 1);
                if (val > max) {
                    min = valMin;
                    max = val;
                    k--;
                    len++;
                } else
                    break;
            }
            maxSoFar = Math.max(max, maxSoFar);
        }
        System.out.println(maxSoFar);
    }
}
