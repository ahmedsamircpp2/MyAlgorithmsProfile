package Mathematics.fundamentals.fibonacci;/**
 * Created by Ahmed on 5/26/17.
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsFibo_Matrix {
    static long arr[] = new long[1000000];

    static long fib(int x) {
        if (arr[x] > 0)
            return arr[x];
        if (x < 2) {
            return x;
        }
        return arr[x] = fib(x - 1) + fib(x - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(100));

    }
}