package algorithms.bitManipulation;/**
 * Created by Ahmed Samir on 5/10/17.
 */

import java.util.Scanner;

public class SansaAndXOR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            if (n % 2 == 0)
                System.out.println(0);
            else {
                int res = 0;
                for (int j = 0; j < n; j += 2) {
//                    if(arr[j]%2!=0)
                    res ^= arr[j];
                }
                System.out.println(res);
            }
        }
    }
}