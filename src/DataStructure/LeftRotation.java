package DataStructure;/**
 * Created by Ahmed Samir on 2/4/17.
 */

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[Math.abs(i + m) % n] + " ");
        }
    }

}
