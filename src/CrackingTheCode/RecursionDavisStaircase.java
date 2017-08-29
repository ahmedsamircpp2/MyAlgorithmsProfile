package CrackingTheCode;/**
 * Created by Ahmed Samir on 4/13/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class RecursionDavisStaircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int k = 0; k < t; k++) {
            int n = in.nextInt();
            int res[] = new int[n + 1];
            res[0] = 1;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j <= n; j++) {
                    if (j >= arr[i]) {
                        res[j] += res[j - arr[i]];
                    }
                }
            }
            System.out.println(Arrays.toString(res));
            System.out.println(res[n]);
        }
    }

}
