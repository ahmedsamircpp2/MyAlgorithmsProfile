package algorithms.Strings;/**
 * Created by Ahmed Samir on 1/28/17.
 */

import java.util.Scanner;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int exp = s.length() / 3, count = 0;
        for (int i = 0; i < s.length() - 2; i += 3) {
            if (s.charAt(i) != 'S') {
                count++;
            }
            if (s.charAt(i + 1) != 'O') {
                count++;
            }
            if (s.charAt(i + 2) != 'S') {
                count++;
            }
        }
        System.out.println(count);
    }
}
