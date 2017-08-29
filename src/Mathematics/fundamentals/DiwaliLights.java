package Mathematics.fundamentals;/**
 * Created by Ahmed Samir on 5/25/17.
 */

import java.util.Scanner;

public class DiwaliLights {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long val = in.nextLong();
            long res = 1;
            for (int j = 0; j < val; j++) {
                res *= 2;
                res %= 100000;
            }
            System.out.println(res - 1);
        }
    }

}
