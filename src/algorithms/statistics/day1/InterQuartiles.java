package algorithms.statistics.day1;/**
 * Created by Ahmed Samir on 2/24/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class InterQuartiles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int tmp[] = new int[n];
        int w[] = new int[n];
        for (int i = 0; i < n; i++) {
            tmp[i] = in.nextInt();
        }
        int s = 0;
        for (int i = 0; i < n; i++) {
            w[i] = in.nextInt();
            s += (w[i]);
        }
        int arr[] = new int[s];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < w[i]; j++) {
                arr[k++] = tmp[i];
            }
        }
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        if (arr.length % 2 == 0) {
            System.out.println(calcMedian(Arrays.copyOfRange(arr, arr.length / 2, arr.length)) - calcMedian(Arrays.copyOfRange(arr, 0, arr.length / 2)));
        } else {
            System.out.println(calcMedian(Arrays.copyOfRange(arr, (arr.length / 2) + 1, arr.length)) - calcMedian(Arrays.copyOfRange(arr, 0, (arr.length / 2))));
        }

    }

    public static double calcMedian(int arr[]) {
        int len = arr.length;
        if (len % 2 == 0) {
            return (arr[len / 2] + arr[(len / 2) - 1]) / 2.0;
        } else {
            return arr[len / 2];
        }
    }

}
