package algorithms.Implementations;/**
 * Created by Ahmed Samir on 1/25/17.
 */

import java.util.Scanner;

public class AbsolutePermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            if (i > 0) System.out.println();
            int v = in.nextInt();
            int k = in.nextInt();

            int arr[] = new int[v];
            for (int j = 0; j < v; arr[j] = j + 1, j++) ;

            int copy[] = arr.clone();
            for (int j = v - 1; j >= 0; j--) {
                if (copy[j] - k > 0) {

                }
            }

            boolean exit = false;
            while (copy != null && !exit) {
                int count = 0;

                for (int j = 0; j < v; j++) {
                    if (Math.abs(arr[j] - copy[j]) == k) {
                        if (j == v - 1) {
                            for (int jj = 0; jj < v; jj++) {
                                if (jj > 0)
                                    System.out.print(" ");
                                System.out.print(copy[jj]);
                            }
                            exit = true;
                        }
                        continue;
                    }
                    break;
                }
                copy = nextPermutation(copy, arr, k);
            }
            if (!exit)
                System.out.print(-1);
        }

    }

    public static int[] nextPermutation(int[] val, int[] arr, int k) {
        int pivot = -1;
        boolean getNext = false;
        for (int i = val.length - 1; i > 0; --i) {
            if (val[i - 1] < val[i]) {
                pivot = i - 1;
                break;
            }
        }
        if (pivot > -1) {
            for (int i = val.length - 1; i > pivot; i--) {
                if (val[i] > val[pivot]) {
                    val[i] ^= val[pivot];
                    val[pivot] ^= val[i];
                    val[i] ^= val[pivot];
                    if (val[pivot] - arr[pivot] != k) {
                        getNext = true;
                    }
                    break;
                }
            }
            if (!getNext) {
                for (int i = val.length - 1, j = pivot + 1; i > j; i--, j++) {
                    val[i] ^= val[j];
                    val[j] ^= val[i];
                    val[i] ^= val[j];
                }
                return val;
            } else {
                return nextPermutation(val, arr, k);
            }
        }
        return null;
    }
}
