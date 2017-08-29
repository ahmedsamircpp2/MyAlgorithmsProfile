package algorithms.bitManipulation;

import java.util.Scanner;

/**
 * Created by rambo on 1/29/17.
 */
public class MaximizingXor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), n2 = in.nextInt(), res = 0;
        for (int i = n; i <= n2; i++) {
            for (int j = n; j < n2; j++) {
                res = Math.max(res, i ^ j);
            }
        }
        System.out.println(res);
    }
}
