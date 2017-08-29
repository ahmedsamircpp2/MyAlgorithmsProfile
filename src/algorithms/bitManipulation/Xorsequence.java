package algorithms.bitManipulation;

import java.util.Scanner;

/**
 * Created by Ahmed Samir on 5/10/17.
 */


public class Xorsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        long x = 0;
        for (long a0 = 0; a0 < Q; a0++) {
            long L = in.nextLong();
            long R = in.nextLong();
            System.out.println(calc(R) ^ calc(L - 1));
        }
    }

    static long calc(long a) {
        long res[] = {a, a, 2, 2, a + 2, a + 2, 0, 0};
        return res[(int) (a % 8L)];
    }

}