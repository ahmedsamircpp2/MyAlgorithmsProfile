package algorithms.Strings;/**
 * Created by Ahmed on 6/21/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndAnagram {
    static boolean vis[][];
    static int count = 0;

    public static void parse(String s, int i, int j) {
        if (i >= j || vis[i][j]) return;
        vis[i][j] = true;
        if (s.charAt(i) == s.charAt(j))
            count++;
        int r = i, c = j;
        while (++r < j && --c > i) {
            char[] a = s.substring(r, j + 1).toCharArray(), b = s.substring(i, c + 1).toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if (Arrays.equals(a, b))
                count++;
        }
        parse(s, i + 1, j);
        parse(s, i, j - 1);
        parse(s, i + 1, j - 1);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++, count = 0) {
            String s = in.next();
            vis = new boolean[s.length()][s.length()];
            parse(s, 0, s.length() - 1);
            System.out.println(count);
        }
    }

}
