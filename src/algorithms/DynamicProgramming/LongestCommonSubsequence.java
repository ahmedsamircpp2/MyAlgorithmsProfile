package algorithms.DynamicProgramming;
/**
 * Created by Ahmed Samir on 2/1/17.
 */

import java.util.Scanner;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int an[] = new int[n + 1];
        int am[] = new int[m + 1];
        an[0] = am[0] = 0;
        for (int i = 1; i <= n; i++) {
            an[i] = in.nextInt();
        }
        for (int i = 1; i <= m; i++) {
            am[i] = in.nextInt();
        }
        int[][] map = new int[n + 1][m + 1];
    }
}