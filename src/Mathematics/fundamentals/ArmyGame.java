package Mathematics.fundamentals;/**
 * Created by Ahmed Samir on 5/25/17.
 */

import java.util.Scanner;

public class ArmyGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int max = Math.max(m, n);
        int min = Math.min(m, n);
        System.out.println((max / 2 + max % 2) * (min / 2 + min % 2));
    }

}
