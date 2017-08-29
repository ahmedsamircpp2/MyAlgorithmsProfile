package algorithms.Graph.subsetTest;
/**
 * Created by Ahmed Samir on 5/8/17.
 */

import java.util.HashMap;
import java.util.Scanner;

public class SubsetComponent_test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        final int SZ = 64;
        long total = SZ;
        long arr[] = new long[SZ];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseUnsignedLong(in.next());
        }
        for (int i = 1; i < Math.pow(2, n); i++) {
            long res = 0L;
            long comp = 0;
            for (int j = 0; j < n; j++) {
                int pow = (int) Math.pow(2, j);
                if ((i & pow) > 0) {
                    int bit = Long.bitCount(arr[j]);

                    if (bit > 1) {
                        if ((res & arr[j]) == 0)
                            comp++;
                        res |= arr[j];
                    }
                }
            }
            int bit = Long.bitCount(res);
            if (bit > 1) {
                total += (SZ - bit);
                total += comp;
            } else
                total += SZ;
        }

        System.out.println(total);
    }
}
