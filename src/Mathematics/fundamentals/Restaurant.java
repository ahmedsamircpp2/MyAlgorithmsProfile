package Mathematics.fundamentals;/**
 * Created by Ahmed Samir on 5/25/17.
 */

import java.util.Scanner;


public class Restaurant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int gcd = gcd(a, b);
            System.out.println((a * b) / (gcd * gcd));
        }
    }

    public static int gcd(int a, int b) {
        int r = 0;
        while ((r = a % b) > 0) {
            a = b;
            b = r;
        }
        return b;
    }

}
