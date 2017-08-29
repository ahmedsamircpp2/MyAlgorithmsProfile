package algorithms.bitManipulation;

import java.util.Scanner;

/**
 * Created by rambo on 1/29/17.
 */
public class LonelyInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), res = in.nextInt();
        for (int i = 1; i < n; i++)
            res ^= in.nextInt();
        System.out.println(res);
    }
}
