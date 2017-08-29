package algorithms.Implementations;/**
 * Created by Ahmed Samir on 1/23/17.
 */

import java.util.Scanner;

public class SavePrisoner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            long n = in.nextLong();
            long m = in.nextLong();
            long s = in.nextLong();
            long res = ((s + m - 1)) % n == 0 ? n : (s + m - 1) % n;
            System.out.println(res);
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

    public static int reverse(int x) {
        if (x < 10) return x;
        int tmp = 0;
        while (x > 0) {
            if (tmp > 0)
                tmp *= 10;
            tmp += (x % 10);
            x = x / 10;
        }
        return tmp;
    }

}
