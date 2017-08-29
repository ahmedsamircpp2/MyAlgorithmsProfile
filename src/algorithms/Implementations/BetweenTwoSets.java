package algorithms.Implementations;

import java.util.Scanner;

/**
 * Created by Ahmed Samir on 1/20/17.
 */
public class BetweenTwoSets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int max = -1;
        int min = 100000;
        int count = 0;


        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
            max = Math.max(max, a[a_i]);
        }

        int[] b = new int[m];

        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
            min = Math.min(min, b[b_i]);
        }

        for (int i = max; i <= min; i++) {
            boolean valid = true;
            for (int j = 0; j < a.length; j++) {
                if (i % a[j] != 0)
                    valid = false;
            }
            if (valid)
                for (int k = 0; k < b.length; k++) {
                    if (b[k] % i != 0)
                        valid = false;
                }
            if (valid) {
                count++;
            }
        }
        System.out.println(count);

    }
}
