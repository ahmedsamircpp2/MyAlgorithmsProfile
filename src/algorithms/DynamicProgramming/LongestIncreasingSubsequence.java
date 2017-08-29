package algorithms.DynamicProgramming;
/**
 * Created by Ahmed on 6/1/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    static int arr[];
    static int maxTillNow[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr = new int[n];
        maxTillNow = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            max = Math.max(arr[i], max);
            maxTillNow[i] = max;
        }
        System.out.println(lis());
    }


    static long lis() {
        int dp[] = new int[arr.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    if (arr[j] == maxTillNow[j]) {
                        break;
                    }
                }
            }
        }
        long max = 0;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(dp[i], max);
        }
        return max;
    }
}