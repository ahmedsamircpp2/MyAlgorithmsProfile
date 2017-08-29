package algorithms.DynamicProgramming;/**
 * Created by Ahmed on 6/2/17.
 */

import java.util.Scanner;

public class Cnd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int cost = 1;
        int dp[] = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                dp[i] += dp[i - 1];
            } else if (arr[i] == arr[i + 1]) {
                dp[i] = 1;
            } else {
                cost += 2;
            }
        }
    }
}