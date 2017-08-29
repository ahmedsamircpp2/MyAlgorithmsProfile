package algorithms.bitManipulation.AndProduct;/**
 * Created by Ahmed Samir on 5/11/17.
 */

import java.util.Scanner;

public class AndProduct3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            long l = Long.parseUnsignedLong(in.next());
            long l2 = Long.parseUnsignedLong(in.next());
            System.out.println(Long.toBinaryString(l2));
            long most = Long.highestOneBit(l2);
            System.out.println(Long.toBinaryString(most));
            System.out.println(most);
            System.out.println("===========");
            int bitLong = Long.toBinaryString(most).length();
            boolean done = false;
            int index = bitLong - 2;
            while (!done) {
                for (int j = 0; j < bitLong; j++) {
                    if (most > l && most < l2) {
                        done = true;
                        System.out.println("test1");
                        break;
                    }
                    long val = 1L << j;
                    long afterSetting = (most ^ val);
                    if ((most & val) == 0L && (afterSetting > l && afterSetting < l2)) {
                        most ^= val;
                        done = true;
                        System.out.println("test");
                        break;
                    }
                }
                if (!done) {
                    most ^= (1L << index);
                    index--;
                }
            }
            System.out.println(most);
        }
    }
}
