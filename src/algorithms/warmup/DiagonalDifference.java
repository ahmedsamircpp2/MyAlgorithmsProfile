package algorithms.warmup;

import java.util.Scanner;

/**
 * Created by Ahmed Samir on 1/19/17.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        long time = System.nanoTime();
        int sz = s * s, a = 0, b = 0;
        int mat[] = new int[sz];

        for (int i = 0; i < sz; i++) {
            mat[i] = scan.nextInt();
        }

        for (int i = 0, j = s - 1; i < sz; i += (s + 1), j += (s - 1)) {
            a += mat[i];
            b += mat[j];
        }
        System.out.println("Time : " + (System.nanoTime() - time) + " ns ");
        System.out.println(Math.abs(a - b));


    }
}
