package algorithms.bitManipulation.SansaAndXor;/**
 * Created by Ahmed Samir on 5/10/17.
 */

import java.util.Scanner;

public class SansaAndXOR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            int memo[] = new int[n];
            int result = 0;
            //n2
            for (int j = 0; j < n; j++) {
                memo[j] = arr[j];
                result ^= memo[j];
                for (int k = j + 1; k < n; k++) {
                    memo[k] = arr[k] ^ memo[k - 1];
                    result ^= memo[k];
                }
            }
            System.out.println(result);
        }
    }
}