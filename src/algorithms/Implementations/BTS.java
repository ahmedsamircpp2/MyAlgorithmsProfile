package algorithms.Implementations;/**
 * Created by Ahmed Samir on 1/23/17.
 */

import java.util.Scanner;

public class BTS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int max = -1;
        int min = 100000;
        int count = 0;


        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
            max = Math.max(max, a[a_i]);
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
            min = Math.min(min, b[b_i]);
        }


    }

    public static int gcd_arr(int a[]) {
        int res = 1;
        for (int i = 0; i < a.length; i++) {
            res = gcd(res, a[i]);
        }
        return res;
    }

    public static int lcm_arr(int a[]) {
        int res = 1;
        for (int i = 0; i < a.length; i++) {
            res = lcm(res, a[i]);
        }
        return res;
    }

    public static int gcd(int a, int b) {
        int r = 0;
        while ((r = a % b) > 0) {
            a = b;
            b = r;
        }
        return b;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

}
