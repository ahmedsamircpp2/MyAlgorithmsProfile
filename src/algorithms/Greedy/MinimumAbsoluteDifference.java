package algorithms.Greedy;/**
 * Created by Ahmed Samir on 4/21/17.
 */

import java.util.*;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
        }
        Arrays.sort(arr);
        long min = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            min = Math.min(min, Math.abs(arr[i] - arr[i - 1]));
        }
        System.out.println(min);
    }
}