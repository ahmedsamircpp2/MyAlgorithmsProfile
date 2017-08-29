package Mathematics.fundamentals;/**
 * Created by Ahmed Samir on 5/25/17.
 */

import java.util.Scanner;

public class ConnectingTowns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            long res = 1;
            for (int k = 0; k < m - 1; k++) {
                res *= in.nextLong();
                res %= 1234567;
            }
            System.out.println(res);
        }
    }

}
