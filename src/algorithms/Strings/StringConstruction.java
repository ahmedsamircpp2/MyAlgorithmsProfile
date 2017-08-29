package algorithms.Strings;/**
 * Created by Ahmed Samir on 1/28/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class StringConstruction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), cost = 0;
        for (int i = 0; i < n; i++) {
            String s = in.next();
            cost = 0;
            boolean vis[] = new boolean[128];
            Arrays.fill(vis, false);
            for (int j = 0; j < s.length(); j++) {
                if (!vis[s.charAt(j)]) {
                    cost++;
                    vis[s.charAt(j)] = true;
                }
            }
            System.out.println(cost);
        }
    }

}
