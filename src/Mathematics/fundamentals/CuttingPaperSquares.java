package Mathematics.fundamentals;/**
 * Created by Ahmed Samir on 5/25/17.
 */

import java.util.Scanner;

public class CuttingPaperSquares {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long m = in.nextInt();
        System.out.println((m - 1) + (m * (n - 1)));
    }

}
