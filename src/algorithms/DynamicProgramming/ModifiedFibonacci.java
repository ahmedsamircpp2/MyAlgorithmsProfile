package algorithms.DynamicProgramming;/**
 * Created by Ahmed Samir on 1/28/17.
 */

import java.math.BigInteger;
import java.util.Scanner;

public class ModifiedFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger t1 = new BigInteger(in.nextInt() + "");
        BigInteger t2 = new BigInteger(in.nextInt() + "");
        int n = in.nextInt();

        for (int i = 2; i < n; i++) {
            BigInteger v = new BigInteger(t1.add(t2.pow(2)) + "");
            t1 = t2;
            t2 = v;
        }
        System.out.println(t2);
    }

}
