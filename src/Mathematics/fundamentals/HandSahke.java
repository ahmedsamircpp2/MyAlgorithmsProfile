package Mathematics.fundamentals;/**
 * Created by Ahmed Samir on 5/25/17.
 */

import java.util.Scanner;

public class HandSahke {
    /**
     * ==> x + f(x-1)
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int s = in.nextInt();
            System.out.println(fact(s));
        }
    }

    static int fact(int val) {
        if (val <= 1) return val;
        return val + fact(val - 1);
    }

}
