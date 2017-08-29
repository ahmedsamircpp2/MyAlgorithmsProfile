package Mathematics.fundamentals;/**
 * Created by Ahmed Samir on 5/25/17.
 */

import java.util.Scanner;

public class FindThePoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int w = in.nextInt();
            System.out.println((z * 2 - x) + " " + (w * 2 - y));
        }
        in.close();
    }

}
