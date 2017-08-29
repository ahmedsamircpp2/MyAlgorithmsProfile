package algorithms.DynamicProgramming;/**
 * Created by Ahmed Samir on 5/22/17.
 */

import java.util.Scanner;

public class RowOfNumbers {
    static int arr[] = {2, 3, 5, 1, 4};
    static int memo[][] = new int[5][5];

    public static void main(String[] args) {
        System.out.println(calcMx(0, 4, 1));
    }

    public static int calcMx(int i, int j, int tn) {
        if (i > j) return 0;
        if (memo[i][j] > 0) {
            return memo[i][j];
        }
        int left = calcMx(i + 1, j, tn + 1);
        int right = calcMx(i, j - 1, tn + 1);
        return memo[i][j] = Math.max(arr[i] * tn + left, arr[j] * tn + right);
    }

    public static void calcMxIt() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
            }
        }
    }
}