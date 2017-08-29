package CrackingTheCode;/**
 * Created by Ahmed Samir on 4/14/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortCountingInversions {
    static long inversion = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int m = in.nextInt();
            long arr[] = new long[m];
            for (int j = 0; j < m; j++) {
                arr[j] = in.nextLong();
            }
            inversion = 0;
            mergeSort(arr);
            System.out.println(inversion);
        }
    }

    private static long[] mergeSort(long[] arr) {
        int len = arr.length;
        if (len == 1) return arr;
        else if (len == 2) {
            if (arr[0] > arr[1]) {
                arr[0] ^= arr[1];
                arr[1] ^= arr[0];
                arr[0] ^= arr[1];
                inversion++;
            }
            return arr;
        } else {
            int half = len / 2;
            int otherHalf = len - half;
            long h1[] = new long[half];
            long h2[] = new long[otherHalf];
            for (int i = 0; i < half; i++) {
                h1[i] = arr[i];
            }
            for (int i = half, k = 0; i < len; ) {
                h2[k++] = arr[i++];
            }
            h1 = mergeSort(h1);
            h2 = mergeSort(h2);
            long mergedArr[] = new long[len];
            int ll = 0, i = 0, j = 0;
            for (; i < h1.length && j < h2.length; ) {
                if (h1[i] == h2[j]) {
                    mergedArr[ll++] = h1[i++];
                } else if (h1[i] < h2[j]) {
                    mergedArr[ll++] = h1[i++];
                } else {
                    mergedArr[ll++] = h2[j++];
                    inversion += (h1.length - i);
                }
            }
            while (i < h1.length) {
                mergedArr[ll++] = h1[i++];
            }
            while (j < h2.length) {
                mergedArr[ll++] = h2[j++];

            }
            return mergedArr;
        }
    }
}