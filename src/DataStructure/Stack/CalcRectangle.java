package DataStructure.Stack;/**
 * Created by Ahmed Samir on 2/13/17.
 */

import java.util.Scanner;

public class CalcRectangle {
    /**
     * Wrong Method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        long vis[][] = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vis[i][j] = -1;
            }
        }
        System.out.println(getRecArea(arr, 0, n - 1, Integer.MAX_VALUE, 0, vis));

    }

    private static long getRecArea(int[] arr, int start, int end, int min, int l, long vis[][]) {
        if (start == end) {
            return vis[start][end] = min * l;
        }
        if (start > end) return 0L;
        long ignoreBoth = 0L;

        //ignore
        if (start + 1 <= end && end - 1 >= start) {
            ignoreBoth = getRecArea(arr, start + 1, end - 1, Integer.MAX_VALUE, 0, vis);
        }
        long takeBoth = 0L;
        //take Both
        if (start + 1 <= end && end - 1 >= start) {
            takeBoth = getRecArea(arr, start + 1, end - 1, Math.min(min, Math.min(arr[start + 1], arr[end - 1])), l + 2, vis);
        }

        long leaveLeft = 0L;
        if (start + 1 <= end) {
            leaveLeft = getRecArea(arr, start + 1, end, Integer.MAX_VALUE, 0, vis);
        }

        long takeLeft = 0L;
        if (start + 1 <= end) {
            takeLeft = getRecArea(arr, start + 1, end, Math.min(min, arr[start + 1]), l + 1, vis);
        }

        long leaveRight = 0L;
        if (end - 1 >= start) {
            leaveRight = getRecArea(arr, start, end - 1, Integer.MAX_VALUE, 0, vis);
        }
        long takeRight = 0L;
        if (end - 1 >= start) {
            takeRight = getRecArea(arr, start, end - 1, Math.min(min, arr[end - 1]), l + 1, vis);
        }


        return vis[start][end] = Math.max(Math.max(takeRight, takeLeft), Math.max(Math.max(ignoreBoth, takeBoth), Math.max(leaveRight, leaveLeft)));
    }

}
