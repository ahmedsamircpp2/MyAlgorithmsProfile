package algorithms.bitManipulation.flippingBitsArea;/**
 * Created by Ahmed Samir on 1/31/17.
 */

import java.util.Scanner;

public class FlippingBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int k = in.nextInt();
            String bits = Integer.toBinaryString(k);
            int bitsCopy = 0;
            for (int j = bits.length() - 1; j >= 0; j--) {
                bitsCopy |= ('0');
            }
//            System.out.println(bi);
            System.out.println(Integer.getInteger(""));
        }
    }

}
