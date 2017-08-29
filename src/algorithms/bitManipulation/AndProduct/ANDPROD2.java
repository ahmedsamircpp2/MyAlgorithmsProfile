package algorithms.bitManipulation.AndProduct;/**
 * Created by Ahmed Samir on 5/11/17.
 */

import java.util.Scanner;

public class ANDPROD2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            long l = in.nextLong();
            long l2 = in.nextLong();
            long diff = l ^ l2;
            diff |= diff >> 1;
            diff |= diff >> 2;
            diff |= diff >> 4;
            diff |= diff >> 8;
            diff |= diff >> 16;
            diff |= diff >> 32;
            System.out.println(l & ~diff);
        }
    }
    //360448
    //364011 366022
    //44379234 46222945
    //41943040
}