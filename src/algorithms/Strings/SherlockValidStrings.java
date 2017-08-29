package algorithms.Strings;/**
 * Created by Ahmed Samir on 2/23/17.
 */

import java.util.*;

public class SherlockValidStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int[] val = new int[26];
        for (int i = 0; i < s.length(); i++)
            val[(int) s.charAt(i) - 'a']++;

        Queue<Integer> min = new PriorityQueue<Integer>();
        for (int i = 0; i < 26; i++)
            if (val[i] > 0)
                min.add(val[i]);

        if (!min.isEmpty() && min.size() > 1) {
            int v1 = min.poll(), po = min.poll();
            boolean v2 = v1 != po;
            while (!min.isEmpty())
                if (po != min.poll())
                    if (min.isEmpty() && !v2) {
                        System.out.println("NO");
                        return;
                    }
        }
        System.out.println("YES");
    }
}