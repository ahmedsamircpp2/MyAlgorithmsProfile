package algorithms.bitManipulation.greaterXor;/**
 * Created by Ahmed Samir on 5/9/17.
 */

import java.util.Scanner;

public class TheGreatXor_Accepted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long x = in.nextLong();
            String str = Long.toBinaryString(x);
            long count = 0L;
            for (int j = 0, k = str.length() - 1; j < str.length() && k >= 0; j++, k--) {
                if (str.charAt(j) == '0') {
                    count += (1L << k);
                }
            }
            System.out.println(count);
        }
    }
}

/*

1100
1110
1111
1101
1011


 */
