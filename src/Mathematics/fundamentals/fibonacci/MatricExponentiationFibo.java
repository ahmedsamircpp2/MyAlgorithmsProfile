package Mathematics.fundamentals.fibonacci;/**
 * Created by Ahmed on 5/30/17.
 */

import java.util.Scanner;

public class MatricExponentiationFibo {
    static long[] memo = new long[120];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long m = in.nextLong();
            boolean notFound = true;
            for (int j = 100; j >= 1; j--) {
                long val = fibonacciRecursive(j);
                if (val == m) {
                    System.out.println("IsFibo");
                    notFound = false;
                    break;
                }
            }
            if (notFound)
                System.out.println("IsNotFibo");
        }
    }

    static long[][] multMatrix(long[][] m, long[][] n) {
        long a = m[0][0] * n[0][0] + m[0][1] * n[1][0];
        long b = m[0][0] * n[0][1] + m[0][1] * n[1][1];
        long c = m[1][0] * n[0][0] + m[1][1] * n[0][1];
        long d = m[1][0] * n[0][1] + m[1][1] * n[1][1];
        long[][] ret = {{a, b}, {c, d}};
        return ret;
    }

    static long fibonacci(long n) {
        if (n < 2) return n;
        long mat[][] = {{1, 1}, {1, 0}};
        long res[][] = pow(mat, n - 1);
        return res[0][0];
    }

    static long[][] pow(long[][] mat, long l) {
        if (l < 2) return mat;
        if (l % 2 == 1) return multMatrix(mat, pow(mat, l - 1));
        long res[][] = pow(mat, l / 2);
        return multMatrix(res, res);
    }

    static long fibonacciRecursive(int n) {
        if (n < 2) return memo[n] = n;
        if (memo[n] > 0) return memo[n];
        return memo[n] = fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    double fib_fixed(long n) {
        double phi = (Math.sqrt(5) + 1) / 2.0;
        return Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }
}
