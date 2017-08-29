package algorithms.warmup;

import java.util.Scanner;

/**
 * Created by Ahmed Samir on 1/19/17.
 */
public class SimpleArraySUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        long time = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < num; ++i) {
            sum += scan.nextInt();
        }
        System.out.println("Time : " + (System.currentTimeMillis() - time) + " ms");
        System.out.println(sum);

    }
}
