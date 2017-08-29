package DataStructure;/**
 * Created by Ahmed Samir on 2/4/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmicCrush {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long arr[] = new long[n];
        Arrays.fill(arr, 0);
        long max = -10;
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            for (int j = a - 1; j < b; j++) {
                arr[j] += c;
                max = Math.max(arr[j], max);
            }
        }
        System.out.println(max);
    }

}
