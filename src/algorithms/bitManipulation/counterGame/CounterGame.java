package algorithms.bitManipulation.counterGame;/**
 * Created by Ahmed Samir on 5/9/17.
 */

import java.util.Scanner;

public class CounterGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String winners[] = {"Louise", "Richard"};
        int pNum = 0;
        for (int i = 0; i < n; i++) {
            long x = in.nextLong();
            while (x != 0 & x != 1) {
                if (((x - 1) & 1) == 1) {
                    x >>= 2;
                } else {
                    x = (Long.highestOneBit(x) >> 1);
                }
                pNum ^= pNum;
                System.out.println(x);
            }
        }
        System.out.println(winners[pNum]);
    }
}