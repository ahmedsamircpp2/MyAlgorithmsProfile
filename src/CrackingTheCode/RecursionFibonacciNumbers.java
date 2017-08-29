package CrackingTheCode;/**
 * Created by Ahmed Samir on 4/13/17.
 */

import java.util.Scanner;

public class RecursionFibonacciNumbers {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        long [] fib= new long [n+1];
//        fib[0]=0;
//        fib[1]=1;
//        for (int i = 2; i <= n; i++) {
//            fib[i]=fib[i-1]+fib[i-2];
//        }
//        System.out.println(fib[n]);
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] fib = new long[n + 1];
        int a = 0;
        int b = 1;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = a + b;
            a = b;
            b = res;
        }
        System.out.println(res);
    }
}
