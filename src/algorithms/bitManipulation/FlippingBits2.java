package algorithms.bitManipulation;/**
 * Created by Ahmed Samir on 5/9/17.
 */

import java.util.Scanner;

public class FlippingBits2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long val = in.nextLong();
            long mask = (1L << 32) - 1;
            for (int j = 0; j < 32; j++) {
                val ^= 1L << j;
            }
            System.out.println(val);
        }
    }

}
