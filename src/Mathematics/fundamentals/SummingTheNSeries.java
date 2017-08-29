package Mathematics.fundamentals;/**
 * Created by Ahmed Samir on 5/25/17.
 */

import java.util.Scanner;

public class SummingTheNSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long val = in.nextLong();
            System.out.println(((val % (1000000000 + 7)) * (val % (1000000000 + 7))) % (1000000000 + 7));
        }
    }

}

/**
 * 218194447
 * 788019571
 * 43914042
 * 559130432
 * 685508198
 * 299528290
 * 950527499
 * 211497519
 * 425277675
 * 142106856
 */