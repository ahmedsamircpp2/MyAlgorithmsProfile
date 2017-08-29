package algorithms.search;/**
 * Created by Ahmed Samir on 4/13/17.
 */

import java.util.Scanner;

public class SherlockAndArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            boolean done = false;
            int n = in.nextInt();
            int arr[] = new int[n];
            int f[] = new int[n];
            int b[] = new int[n];


            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
                b[j] = arr[j];
                f[j] = arr[j];
            }
            if (n == 1) {
                System.out.println("YES");
                continue;
            }

            for (int j = 1; j < n; j++) {
                f[j] += f[j - 1];
            }
            for (int j = n - 2; j >= 0; j--) {
                b[j] += b[j + 1];
            }
            for (int j = 0; j < n; j++) {
                if (j > 0 && j < n - 1) {
                    if (f[j - 1] == b[j + 1]) {
                        System.out.println("YES");
//                        System.out.println(f[j-1 ]+ " | "+ b[j+1]);
                        done = true;
                        break;
                    }
                }

            }
            if (!done) {
                System.out.println("NO");
                continue;
            }
        }

    }

}
