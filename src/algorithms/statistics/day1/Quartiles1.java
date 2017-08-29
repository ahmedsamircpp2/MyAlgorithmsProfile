package algorithms.statistics.day1;/**
 * Created by Ahmed Samir on 2/24/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Quartiles1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        if (n % 2 > 0) {
            int a = arr[n / 2];
            int len = (n / 2);
            int b = (arr[len / 2] + arr[(len / 2) - 1]) / 2;
            int k = (arr[len + (len / 2)] + arr[len + (len / 2) + 1]) / 2;
            System.out.println(b);
            System.out.println(a);
            System.out.println(k);
        } else {
            int a = (arr[n / 2] + arr[(n / 2) - 1]) / 2;
            int len = (n / 2);
            if (len % 2 > 0) {
                System.out.println(arr[len / 2]);
                System.out.println(a);
                System.out.println(arr[len + (len / 2)]);
            } else {
                System.out.println((arr[len / 2] + arr[(len / 2) - 1]) / 2);
                System.out.println(a);
                System.out.println((arr[len + (len / 2)] + arr[len + (len / 2) - 1]) / 2);
            }
        }
    }

}
