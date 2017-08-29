package algorithms.bitManipulation.AndProduct;/**
 * Created by Ahmed Samir on 5/11/17.
 */

import java.util.Scanner;

public class ANDPROD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            long l = in.nextLong();
            long l2 = in.nextLong();
            long res = l;
            int k = 0;
            for (long j = l; j <= l2; ) {
                res &= j;
                j += (1 << k++);
            }
            System.out.println(res);
        }
    }
    //360448
    //364011 366022
    //44379234 46222945
    //41943040
}