package algorithms.DynamicProgramming;/**
 * Created by Ahmed Samir on 4/20/17.
 */

import java.util.Scanner;

public class SherlockAndCost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            int arr[] = new int[m];
            for (int j = 0; j < m; j++) {
                arr[j] = in.nextInt();
            }
            int cost = 0;
            for (int j = 1; j < m; j++) {
                int h1 = Math.abs(arr[j] - arr[j - 1]);
                int h2 = Math.abs(arr[j] - 1);
                int h3 = Math.abs(1 - arr[j - 1]);
//                  System.out.println(abs);
                cost += Math.max(h1, Math.max(h2, h3));
            }
            System.out.println(cost);
        }
    }
}