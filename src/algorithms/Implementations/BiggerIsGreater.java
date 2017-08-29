package algorithms.Implementations;/**
 * Created by Ahmed Samir on 1/24/17.
 */

import java.util.Scanner;

public class BiggerIsGreater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long time = 0L;
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            time = System.currentTimeMillis();
            char[] str = in.next().toCharArray();
            if (i > 0)
                System.out.println();
            char[] perm = nextPerm(str.clone());
            if (perm != null) {
                String v = String.valueOf(perm);
                String v2 = String.valueOf(str);
                if (!v.equals(v2)) {
                    System.out.print(v);
                } else {
                    System.out.print("no answer");
                }
            } else {
                System.out.print("no answer");
            }

        }
    }

    private static boolean isGreater(char[] perm, char[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] < perm[i])
                return true;
        }
        return false;
    }

    public static char[] nextPerm(char[] str) {
        int index = -1;
        for (int i = str.length - 1; i > 0; i--) {
            if (str[i - 1] < str[i]) {
                index = i - 1;
                break;
            }
        }
        if (index > -1) {
            for (int i = str.length - 1; i > index; i--) {
                if (str[i] > str[index]) {
                    char tmp = str[index];
                    str[index] = str[i];
                    str[i] = tmp;
                    for (int k = str.length - 1, l = index + 1; k > index && l < k; k--, l++) {
                        char tmp2 = str[k];
                        str[k] = str[l];
                        str[l] = tmp2;
                    }
                    break;
                }
            }
            return str;
        }
        return null;
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
