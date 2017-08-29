package algorithms.DynamicProgramming;/**
 * Created by Ahmed Samir on 1/28/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumInSubArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int m[] = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = in.nextInt();
            }
            int con = 0, disCon = 0;
            con = m[0];
            int max = m[0];
            for (int j = 1; j < n; j++) {
                con = Math.max(m[j], con + m[j]);
                max = Math.max(max, con);
            }
            System.out.print(max + " ");
            Arrays.sort(m);
            disCon = m[n - 1];
            max = m[n - 1];
//          System.out.println(Arrays.toString(m));
            for (int j = n - 2; j >= 0; j--) {
                disCon = Math.max(disCon, disCon + m[j]);
            }
            System.out.println(disCon);
        }
    }

}
