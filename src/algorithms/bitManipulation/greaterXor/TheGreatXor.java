package algorithms.bitManipulation.greaterXor;/**
 * Created by Ahmed Samir on 5/9/17.
 */

import java.util.Scanner;

public class TheGreatXor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long x = in.nextLong();
            long zeros = 0;
            String str = Long.toBinaryString(x);
            System.out.println(str);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '0')
                    zeros++;
            }
            System.out.println("Zeros:" + zeros);
            System.out.println((1L << zeros) - 1);
        }
    }
}