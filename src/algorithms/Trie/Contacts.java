package algorithms.Trie;/**
 * Created by Ahmed Samir on 2/7/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Contacts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        trie t = new trie(' ');
        for (int i = 0; i < n; i++) {
            String co = in.next();
            if (co.equals("add")) {
                String str = in.next();
                insert(t, str, 0);
                System.out.println(t);
            } else {
                String str = in.next();
                System.out.println(find(t, str, 0));
            }
        }
    }

    private static int find(trie t, String str, int i) {
        if (t == null || i >= str.length())
            return 0;
        if (i == str.length() - 1)
            return t.count;

        return find(t.childs[str.charAt(i) - 'a'], str, i + 1);
    }

    private static void insert(trie t, String word, int i) {
        if (i >= word.length()) return;
        insert(t.addChild(word.charAt(i)), word, i + 1);
    }

    static class trie {
        public trie childs[];
        public int count = 1;
        public char val;

        public trie(char val) {
            this.val = val;
            childs = new trie[26];
        }

        public trie addChild(char val) {
            count += 1;
            childs[val - 'a'] = new trie(val);
            return childs[val - 'a'];
        }

        @Override
        public String toString() {
            return "trie{" +
                    "childs=" + Arrays.toString(childs) +
                    ", count=" + count +
                    ", val=" + val +
                    '}';
        }
    }

}
