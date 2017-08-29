package DataStructure;/**
 * Created by Ahmed Samir on 2/2/17.
 */

import java.util.Scanner;

public class ArrayDS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
