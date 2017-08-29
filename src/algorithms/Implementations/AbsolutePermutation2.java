package algorithms.Implementations;/**
 * Created by Ahmed Samir on 1/25/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class AbsolutePermutation2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            if (i > 0) System.out.println();
            int v = in.nextInt();
            int k = in.nextInt();

            int arr[] = new int[v];
            for (int j = 0; j < v; arr[j] = j + 1, j++) ;

            int copy[] = new int[v];
            Arrays.fill(copy, -1);
            boolean notValid = false;
            for (int j = v - 1; j >= 0; j--) {
                if (copy[j] > -1) {
                    continue;
                }
                if (arr[j] - k == 0) {
                    System.out.print(-1);
                    notValid = true;
                    break;
                }
                if (arr[j] - k > 0) {
                    copy[j] = arr[j] - k;
                    copy[arr[j] - k - 1] = arr[j];
                } else {
                    System.out.print(-1);
                    notValid = true;
                    break;
                }
            }
            if (!notValid)
                for (int jj = 0; jj < v; jj++) {
                    if (jj > 0)
                        System.out.print(" ");
                    System.out.print(copy[jj]);
                }
        }
    }

}
