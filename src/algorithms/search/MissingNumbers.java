package algorithms.search;/**
 * Created by Ahmed Samir on 4/13/17.
 */

import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[1000011];
        for (int i = 0; i < n; i++) {
            arr[in.nextInt()]++;
        }
        int m = in.nextInt();
        int arr2[] = new int[1000011];
        for (int i = 0; i < m; i++) {
            arr2[in.nextInt()]++;
        }
        for (int i = 0; i < 1000011; i++) {
            if (arr[i] != arr2[i])
                System.out.print(i + " ");
        }

    }

}
