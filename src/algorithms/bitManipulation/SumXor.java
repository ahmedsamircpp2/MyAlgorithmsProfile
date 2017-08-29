package algorithms.bitManipulation;/**
 * Created by Ahmed Samir on 1/31/17.
 */

import java.util.Scanner;

public class SumXor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(), count = 0;
        if (n == 0) System.out.println(1);
        else {
            int num = Long.toBinaryString(n).length() - Long.bitCount(n);
            System.out.println(Long.valueOf(2L << num - 1));
        }
    }
}