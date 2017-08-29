package algorithms.bitManipulation;/**
 * Created by Ahmed Samir on 5/9/17.
 */

import java.util.Scanner;

// Dipti
public class CounterGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String players[] = {"Louise", "Richard"};
        for (int i = 0; i < t; i++) {
            long n = Long.parseUnsignedLong(in.next());
            int pFirst = 1;
            while (Long.compareUnsigned(n, 1L) != 0) {
                if ((n & (n - 1L)) == 0L) {
                    n >>>= 1L;
                } else {
                    n ^= Long.highestOneBit(n);
                }
                pFirst ^= 1;
            }
            System.out.println(players[pFirst]);
        }
    }
    //1001
}