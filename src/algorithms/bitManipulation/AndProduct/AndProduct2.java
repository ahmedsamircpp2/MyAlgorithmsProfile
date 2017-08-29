package algorithms.bitManipulation.AndProduct;/**
 * Created by Ahmed Samir on 5/11/17.
 */

import java.util.Scanner;

public class AndProduct2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            long l = Long.parseUnsignedLong(in.next());
            long l2 = Long.parseUnsignedLong(in.next());
            int bitCount = Long.toBinaryString(l2).length();
            long most = (1 << bitCount - 1);
            if (most >= l && most <= l2) {
                System.out.println(most);
                continue;
            }
            long valExist = Long.MAX_VALUE;
            for (int j = bitCount - 2; j >= 0; j--) {
                long shift = 1L << j;
                long val = most ^ shift;
                if (val >= l && val <= l2) {
                    valExist = Math.min(valExist, val);
                } else {
                    if (val < l2) {
                        most = val;
                    }
                }
                System.out.println(Long.toBinaryString(most));
            }
        }
    }
    //360448
//    364011 366022
}
