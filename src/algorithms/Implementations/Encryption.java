package algorithms.Implementations;/**
 * Created by Ahmed Samir on 1/25/17.
 */

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int len = str.length(), row = (int) Math.floor(Math.sqrt(len)), col = (int) Math.ceil(Math.sqrt(len));
        for (int i = 0; i < col; i++) {
            if (i > 0) System.out.print(" ");
            for (int j = i; j < len; j += col) {
                System.out.print(str.charAt(j));
            }
        }
    }
}
