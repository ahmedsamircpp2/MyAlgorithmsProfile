package CrackingTheCode;/**
 * Created by Ahmed Samir on 4/13/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class DPCoinChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = in.nextInt();
        }
        long cost[] = new long[n + 1];
        cost[0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= n; j++) {
                if (j >= arr[i])
                    cost[j] += cost[j - arr[i]];
            }
        }
        System.out.println(cost[n]);

    }

}
