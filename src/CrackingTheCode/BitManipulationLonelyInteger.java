package CrackingTheCode;/**
 * Created by Ahmed Samir on 4/13/17.
 */

import java.util.Scanner;

public class BitManipulationLonelyInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), res = in.nextInt();
        for (int i = 1; i < n; i++) {
            res ^= in.nextInt();
        }
        System.out.println(res);
    }
}