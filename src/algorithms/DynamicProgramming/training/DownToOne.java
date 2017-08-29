package algorithms.DynamicProgramming.training;/**
 * Created by Ahmed on 6/1/17.
 */

import java.util.Scanner;

public class DownToOne {
    static int[] memo;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        memo = new int[n + 1];
        memo[0] = Integer.MAX_VALUE;
        memo[1] = 1;
        memo[2] = 1;
        memo[3] = 1;
        for (int i = 4; i <= n; i++) {
            memo[i] = Math.min(memo[(i % 3 == 0) ? i / 3 : 0], Math.min(memo[i - 1], memo[(i % 2 == 0) ? i / 2 : 0]));
        }
        System.out.println(memo[n]);
    }


}
