package algorithms.warmup;

import java.util.Scanner;

/**
 * Created by Ahmed Samir on 1/19/17.
 */
public class DiagonalDifference2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //Time : 572702 ns
        long time = System.nanoTime();
        int a[][] = new int[n][n];
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
            }
        }
        int d1 = 0, d2 = 0;
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                if (a_i == a_j) {
                    d1 += a[a_i][a_j];
                    d2 += a[a_i][n - a_j - 1];
                }
            }
        }
        System.out.println("Time : " + (System.nanoTime() - time) + " ns ");
        System.out.println(Math.abs(d1 - d2));
    }
}
