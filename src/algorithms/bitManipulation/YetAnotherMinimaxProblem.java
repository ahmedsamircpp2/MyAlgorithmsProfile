package algorithms.bitManipulation;
/**
 * Created by Ahmed Samir on 5/12/17.
 */

import java.util.Scanner;

public class YetAnotherMinimaxProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long m = 0, mx = 0;
        for (int i = 0; i < n; i++) {
            long mn = in.nextLong();
            long val = mn ^ m;
            m = mn;
            mx = Math.max(val, mx);
        }
        System.out.println(mx);
    }

}
