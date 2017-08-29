package DataStructure.Arrays;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by rambo on 2/6/17.
 */
public class CrashAlgorithm2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BigInteger arr[] = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new BigInteger("0");
        }
        BigInteger max = new BigInteger("0");
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            for (int j = a - 1; j < b; j++) {
                arr[j] = arr[j].add(new BigInteger(c + ""));
                max = arr[j].max(max);
            }
        }
        System.out.println(max.toString());
    }
}
