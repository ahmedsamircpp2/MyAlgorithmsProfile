package CrackingTheCode;/**
 * Created by Ahmed Samir on 4/13/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class RecursionDavisStaircase2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int k = 0; k < t; k++) {
            int n = in.nextInt();
            int fib[] = new int[37];
            fib[0] = 0;
            fib[1] = 1;
            fib[2] = 2;
            fib[3] = 4;
            if (n <= 3) System.out.println(fib[n]);
            else {
                for (int i = 4; i <= n; i++) {
                    fib[i] = fib[i - 1] + fib[i - 2] + fib[i - 3];
                }
                System.out.println(fib[n]);
            }
        }
    }

}
