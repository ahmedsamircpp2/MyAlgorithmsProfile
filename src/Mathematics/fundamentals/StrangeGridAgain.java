package Mathematics.fundamentals;/**
 * Created by Ahmed on 5/30/17.
 */

import java.util.Scanner;

public class StrangeGridAgain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt() - 1;
        int b = in.nextInt() - 1;
        if (a % 2 == 0) {
            long val = (a - 2) * 10;
            System.out.println(val + (b * 2));
        } else {
            if (a > 2) {
                long val = ((a - 3) * 10) + 1;
                System.out.println(val + (b * 2));
            } else {
                long val = (a == 1 ? 1 : 0);
                System.out.println(val + (b * 2));
            }
        }
    }

}
