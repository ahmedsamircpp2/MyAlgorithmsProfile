package algorithms.bitManipulation;

import java.util.Scanner;

/**
 * Created by rambo on 1/30/17.
 */
public class SumVsXor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(), count = 0;
        for (long i = 0; i <= (n / 5) * 3; i++) {
            if ((n ^ i) == (n + i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
