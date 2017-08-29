package algorithms.Implementations;

import java.util.Scanner;

/**
 * Created by rambo on 2/7/17.
 */
public class StrangeCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long val = in.nextLong();
        long mul = Math.round(Math.cbrt(val));
        System.out.println(mul);
        long intervalStart = 3 * (long) Math.pow(2, mul - 1);

    }
}
