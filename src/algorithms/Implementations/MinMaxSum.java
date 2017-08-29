package algorithms.Implementations;

import java.util.Scanner;

/**
 * Created by Ahmed Samir on 1/20/17.
 */
public class MinMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 0;
        long max = -1;
        long min = 10000000000000L;
        int v = 0, i = 0;
        while (i++ < 5) {
            v = in.nextInt();
            sum += v;
            if (max < v)
                max = v;
            if (min > v)
                min = v;
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}
