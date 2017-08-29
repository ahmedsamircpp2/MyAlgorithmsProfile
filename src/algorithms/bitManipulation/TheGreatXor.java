package algorithms.bitManipulation;/**
 * Created by Ahmed Samir on 5/9/17.
 */

import java.util.Scanner;

public class TheGreatXor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long x = in.nextLong();
            System.out.println(Long.toBinaryString(x));
            long count = 0L;
            long k = 0L;
            while (x > 0) {
                if ((x & 1L) == 0L) {
                    count += (1L << k);
                }
                x >>= 1L;
                k++;
            }
            System.out.println(count);
        }
    }
}