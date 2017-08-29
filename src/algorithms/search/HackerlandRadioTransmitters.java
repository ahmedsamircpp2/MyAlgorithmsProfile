package algorithms.search;/**
 * Created by Ahmed Samir on 4/5/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class HackerlandRadioTransmitters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int count = 0, s = 0;

        while (s < n) {
            count++;
            int loc = arr[s] + m;
            while (s < n && arr[s] <= loc) s++;
            loc = arr[--s] + m;
            while (s < n && arr[s] <= loc) s++;
        }
        System.out.println(count);

    }
}