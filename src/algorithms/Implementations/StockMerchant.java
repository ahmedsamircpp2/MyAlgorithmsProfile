package algorithms.Implementations;/**
 * Created by Ahmed Samir on 1/23/17.
 */

import java.util.Scanner;

public class StockMerchant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        int x[] = new int[101];
        int total = 0;
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
            x[c[c_i]]++;
            if (x[c[c_i]] % 2 == 0) {
                x[c[c_i]] = 0;
                total++;
            }
        }
        System.out.println(total);
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
