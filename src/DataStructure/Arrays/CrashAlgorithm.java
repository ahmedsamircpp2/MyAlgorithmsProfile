package DataStructure.Arrays;

import java.util.Scanner;

/**
 * Created by rambo on 2/6/17.
 */

public class CrashAlgorithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long arr[] = new long[n + 2];
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            long c = in.nextLong();
            arr[a] += c;
            arr[b + 1] -= c;
        }
//        System.out.println(" ===> "+Arrays.toString(arr));
        long maxSoFar = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
            maxSoFar = Math.max(maxSoFar, arr[i]);
        }
        System.out.println(maxSoFar);
    }
    //882
}
