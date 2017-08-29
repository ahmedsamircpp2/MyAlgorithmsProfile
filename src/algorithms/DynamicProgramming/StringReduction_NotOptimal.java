package algorithms.DynamicProgramming;/**
 * Created by Ahmed Samir on 5/18/17.
 */

import java.util.HashMap;
import java.util.Scanner;

public class StringReduction_NotOptimal {
    static int y = 'b' ^ 'a' ^ 'c';
    static HashMap<String, Integer> vis = new HashMap<>();
    static int min = 100;

    static int reduce(String st) {
        if (min == 1) return 1;
        min = st.length();
        if (vis.get(st) != null) return vis.get(st);
        StringBuilder str = new StringBuilder(st);
        for (int i = 1; i < str.length(); i++) {
            if ((str.charAt(i) ^ str.charAt(i - 1)) > 0) {
                char cc = (char) (y ^ str.charAt(i) ^ str.charAt(i - 1));
                str.setCharAt(i, cc);
                str.deleteCharAt(i - 1);
                i--;
                min = Math.min(min, reduce(str.toString()));
            }
        }
        vis.put(st, min);
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            StringBuilder b = new StringBuilder();
            for (int k = s.length() - 1; k >= 0; k--) {
                b.append(s.charAt(k));
            }
            min = 100;
            int val = reduce(b.toString());
            if (val > 2) {
                System.out.println(Math.min(val, reduce(s)));
            } else
                System.out.println(val);
        }
    }
}