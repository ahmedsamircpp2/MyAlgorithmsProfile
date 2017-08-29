package algorithms.Strings.Sherlock;/**
 * Created by Ahmed on 6/21/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndAnagram2 {
    static boolean vis[][];
    static int count = 0;

    public static void parse(String s, int i, int j) {
        if (i >= j || vis[i][j]) return;
        vis[i][j] = true;
        if (s.charAt(i) == s.charAt(j))
            count++;
        int r = i, c = j;
        while (++r < j && --c > i) {
            int memo[] = new int[26];

            for (int k = r; k < j + 1; k++) {
                memo[s.charAt(k) - 'a']++;
            }


            boolean con = false;
            System.out.println("==> " + Arrays.toString(memo) + " | " + s.subSequence(i, c + 1));
            for (int k = i; k < c + 1; k++) {
                if (memo[s.charAt(k) - 'a']-- < 0) {
                    con = true;
                    break;
                }

            }
            if (!con)
                count++;
        }
        parse(s, i + 1, j);
        parse(s, i, j - 1);
        parse(s, i + 1, j - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0, k = 0; i < n; i++, count = 0) {
            String s = in.next();
            vis = new boolean[s.length()][s.length()];
            parse(s, 0, s.length() - 1);
            System.out.println(count);
        }
    }

    long hash(int[] word) {
        long ret = 0, t = 1;
        for (int i = 0; i < 26; i++) {
            ret += (word[i] * t);
            t = t * 1000003;
        }
        return ret;
    }

}
