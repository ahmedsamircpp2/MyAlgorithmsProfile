package algorithms.warmup;

import java.util.Scanner;

/**
 * Created by Ahmed Samir on 1/19/17.
 */
public class AliceAndBob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = {scan.nextInt(), scan.nextInt(), scan.nextInt()};
        int alice = 0, bob = 0;
        int v = 0, i = 0;
        long time = System.nanoTime();

        for (i = 0; i < 3; i++) {
            v = scan.nextInt();
            if (a[i] > v)
                alice++;
            else if (a[i] < v)
                bob++;
        }
        System.out.println("Time : " + (System.nanoTime() - time) + " ns");
        System.out.println(alice + " " + bob);
    }
}
