package algorithms.statistics.day1;/**
 * Created by Ahmed Samir on 2/24/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Quartiles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        if (arr.length % 2 == 0) {
            System.out.println(calcMedian(Arrays.copyOfRange(arr, 0, arr.length / 2)));
            System.out.println(calcMedian(arr));
            System.out.println(calcMedian(Arrays.copyOfRange(arr, arr.length / 2, arr.length)));
        } else {
            System.out.println(calcMedian(Arrays.copyOfRange(arr, 0, (arr.length / 2))));
            System.out.println(calcMedian(arr));
            System.out.println(calcMedian(Arrays.copyOfRange(arr, (arr.length / 2) + 1, arr.length)));
        }

    }

    public static int calcMedian(int arr[]) {
        int len = arr.length;
        if (len % 2 == 0) {
            return (arr[len / 2] + arr[(len / 2) - 1]) / 2;
        } else {
            return arr[len / 2];
        }
    }
}
