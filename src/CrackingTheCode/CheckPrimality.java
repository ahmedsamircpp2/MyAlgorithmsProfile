package CrackingTheCode;/**
 * Created by Ahmed Samir on 4/13/17.
 */

import java.util.Scanner;

public class CheckPrimality {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int kk = 0; kk < t; kk++) {
            boolean done = false;
            int n = in.nextInt();
            if (n == 2) {
                System.out.println("Prime");
                continue;
            }
            if (n == 1 || n % 2 == 0) {
                System.out.println("Not prime");
                continue;
            }
            for (int i = 3; i * i <= n; i += 2) {
                if (n % i == 0 && i != n) {
                    System.out.println("Not prime");
                    done = true;
                    break;
                }
            }
            if (!done)
                System.out.println("Prime");
        }
    }

}
