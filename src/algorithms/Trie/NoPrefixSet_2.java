package algorithms.Trie;/**
 * Created by Ahmed Samir on 2/8/17.
 */

import java.util.Scanner;

public class NoPrefixSet_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        trie root = new trie(' ');
        for (int i = 0; i < n; i++) {
            String word = in.next();
            addChar(root, word, 0);
        }
        System.out.println("GOOD SET");
    }

    private static void addChar(trie root, String word, int i) {
        if (root == null) return;
        if (i >= word.length()) return;
        boolean endOfWord = false;
        if (i == word.length() - 1) {
            endOfWord = true;
        }
        trie t = root.add(word.charAt(i), word, endOfWord);
        addChar(t, word, i + 1);
    }

    static class trie {
        public trie[] edges;
        public char val;
        public boolean endOfWord = false;

        public trie(char val) {
            edges = new trie[10];
            this.val = val;
        }

        public trie add(char c, String fullString, boolean eof) {
            trie t = edges[c - 'a'];
            if (t != null) {
                t.endOfWord |= eof;
                if (t.endOfWord || eof) {
                    System.out.println("BAD SET");
                    System.out.println(fullString);
                    System.exit(0);
                }
                return t;
            } else {
                edges[c - 'a'] = new trie(c);
                edges[c - 'a'].endOfWord |= eof;
                return edges[c - 'a'];
            }
        }
    }

}
