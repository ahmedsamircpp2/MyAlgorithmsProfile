package algorithms.DynamicProgramming;/**
 * Created by Ahmed on 8/21/17.
 */

import java.util.Scanner;

public class Knapsack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int w = in.nextInt();
            int arr[] = new int[a];
            int memo[] = new int[w];
            for (int j = 0; j < a; j++) {
                for (int k = 0; k <= w; k++) {
                    if (memo[j] + arr[j] <= k)
                        memo[j] += arr[j];
                }
            }
        }
    }

}
