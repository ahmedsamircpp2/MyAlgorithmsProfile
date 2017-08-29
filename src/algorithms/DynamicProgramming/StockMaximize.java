package algorithms.DynamicProgramming;/**
 * Created by Ahmed Samir on 5/17/17.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StockMaximize {
    static long arr[];
    static int len;
    static Map<Integer, Map<Integer, Integer>> vis;

    static long maxStock(int index) {
        if (index >= len) return 0L;
        long max = 0;
        int ii = -1;
        for (int i = index; i < len; i++) {
            if (arr[i] >= max) {
                ii = i;
                max = arr[i];
            }
        }
        long buy = 0, profit = 0;
        if (ii > -1) {
            long count = 0;
            for (int i = index; i < ii; i++) {
                buy += arr[i];
                count++;
            }
            profit = (count * arr[ii]) - buy;
        }
        return profit + maxStock(ii + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            len = in.nextInt();
            arr = new long[len];
            for (int j = 0; j < len; j++) {
                arr[j] = in.nextLong();
            }
            System.out.println(maxStock(0));
        }
    }
}
