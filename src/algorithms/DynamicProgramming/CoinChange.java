package algorithms.DynamicProgramming;

import java.util.Scanner;

/**
 * Created by rambo on 1/29/17.
 */
public class CoinChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = in.nextInt();
        int m[] = new int[count];
        for (int i = 0; i < count; i++) {
            m[i] = in.nextInt();
        }
        long memo[] = new long[n + 1];
        memo[0] = 1;
        for (int j = 0; j < count; j++) {
            for (int i = 1; i <= n; i++) {
                if (i - m[j] >= 0)
                    memo[i] += (memo[i - m[j]]);
            }
        }
        System.out.println(memo[n]);
    }
}
