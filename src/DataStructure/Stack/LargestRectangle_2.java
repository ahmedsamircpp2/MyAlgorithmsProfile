package DataStructure.Stack;

import java.util.*;

/**
 * Created by rambo on 2/12/17.
 */

/**
 * Wrong
 */
public class LargestRectangle_2 {
    public static long[][] vis;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        vis = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vis[i][j] = -1;
            }
        }
        System.out.println(getRecArea(arr, 0, n - 1, Integer.MAX_VALUE, 0));

    }

    private static long getRecArea(int[] arr, int start, int end, int min, int l) {
        if (start == end) {
//            System.out.println("Min : " + min +" Height : " +l );
            return vis[start][end] = min * l;
        }
        if (start > end) return vis[start][end] = 0L;

        long both = 0L;
        if (start + 1 <= end && end - 1 >= start) {
            both = getRecArea(arr, start + 1, end - 1, Math.min(arr[start + 1], arr[end - 1]), 2);
        }
        long left = 0L;
        if (start + 1 <= end) {
            left = getRecArea(arr, start + 1, end, Math.min(min, arr[start + 1]), l + 1);
        }
        long right = 0L;
        if (end - 1 >= start) {
            right = getRecArea(arr, start, end - 1, Math.min(min, arr[end - 1]), l + 1);
        }
        return vis[start][end] = Math.max(both, Math.max(right, left));
        //18060
    }
}
