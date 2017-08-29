package algorithms.Implementations;

import java.util.Scanner;

/**
 * Created by Ahmed Samir on 1/20/17.
 */
public class MinMaxSum_stupidSol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long max = Math.max(b + c + d + e, Math.max(a + c + d + e, Math.max(a + b + d + e, Math.max(a + b + c + e, a + b + c + d))));

        long min = Math.min(b + c + d + e, Math.min(a + c + d + e, Math.min(a + b + d + e, Math.min(a + b + c + e, a + b + c + d))));
        System.out.println(min + " " + max);
    }
}
