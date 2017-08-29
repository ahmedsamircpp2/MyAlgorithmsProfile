package DataStructure.Stack.andXorOr;
/**
 * Created by Ahmed Samir on 4/12/17.
 */

import java.util.*;

public class ANDxorOR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
        }

        long max = -1;
        for (int i = 0; i < n; i++) {
            long mn = arr[i], mx = i + 1 < n ? arr[i + 1] : mn;
            max = Math.max(max, mn ^ mx);
            for (int j = i + 2; j < n; j++) {
                if (arr[j] < mx) {
                    mn = Math.min(mn, mx);
                    max = Math.max(max, mn ^ (mx = arr[j]));
                }
            }
        }
        System.out.println(max);
    }
}