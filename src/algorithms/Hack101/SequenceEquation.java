package algorithms.Hack101;/**
 * Created by Ahmed Samir on 2/13/17.
 */

import java.util.Scanner;

public class SequenceEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int val = in.nextInt();
            p[val] = i;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(p[p[i]]);
        }
    }

}
