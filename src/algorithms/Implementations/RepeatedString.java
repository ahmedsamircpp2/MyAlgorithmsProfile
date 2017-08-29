package algorithms.Implementations;/**
 * Created by Ahmed Samir on 1/26/17.
 */

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        int numOfA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') numOfA++;
        }
        long full = n / s.length();
        full *= numOfA;
        long rem = n % s.length();
        for (int i = 0; i < rem; i++) {
            if (s.charAt(i) == 'a')
                full++;
        }
        System.out.println(full);

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
