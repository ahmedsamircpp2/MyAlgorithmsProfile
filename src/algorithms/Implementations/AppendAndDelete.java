package algorithms.Implementations;/**
 * Created by Ahmed Samir on 1/26/17.
 */

import java.util.Scanner;

public class AppendAndDelete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int index = -1, index2 = 0;
        int slen = s.length();
        int tlen = t.length();
        for (int i = 0; i < Math.min(slen, tlen); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                index = i;
                break;
            }
        }
        int min = Math.min(slen, tlen);
        int max = Math.max(slen, tlen);
        int diff = max - min;

        if (index == -1) {
            System.out.println((diff == 0) || (min + max <= k) || (k % 2 == Math.ceil(max - min) % 2) ? "Yes" : "No");
        } else {
            int count = (slen + tlen) - 2 * index;
            System.out.println(count == k || (count <= k && (k - count > 1)) ? "Yes" : "No");
        }
    }
}