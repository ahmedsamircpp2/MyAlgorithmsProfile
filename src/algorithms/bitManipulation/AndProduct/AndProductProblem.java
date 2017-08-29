package algorithms.bitManipulation.AndProduct;/**
 * Created by Ahmed Samir on 5/11/17.
 */

import java.util.Scanner;

public class AndProductProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            long l = Long.parseUnsignedLong(in.next());
            long l2 = Long.parseUnsignedLong(in.next());
            int bitCount = Long.toBinaryString(l2).length();
            System.out.println(bitCount + " : " + Long.toBinaryString(l2));
            for (int k = 0; k < bitCount; k++) {
                if (Long.compareUnsigned(l2 & 1L << k, 0L) != 0 & ((l2 ^ (1L << k)) >= l)) {
                    l2 ^= (1L << k);
                    System.out.println(Long.toBinaryString(l2));
                }
            }
            System.out.println(l2);
        }
    }
    //360448
//    364011 366022

//    44379234 46222945
    //41943040
}
