package algorithms.Trie;/**
 * Created by Ahmed Samir on 2/8/17.
 */

import java.util.Scanner;

public class NoPrefixSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        trie root = new trie(' ');
        boolean good = true;
        for (int i = 0; i < n; i++) {
            String word = in.next();
            if (find(root, word, 0)) {
                System.out.println("BAD SET");
                System.out.println(word);
                good = false;
                break;
            }
            addChar(root, word, 0);
        }
        if (good)
            System.out.println("GOOD SET");

    }

    private static boolean find(trie root, String word, int i) {
        if (root == null) return true;
        if (i >= word.length()) return true;
        trie t = root.edges[word.charAt(i) - 'a'];
        return t != null && find(t, word, i + 1);
    }


    private static void addChar(trie root, String word, int i) {
        if (root == null) return;
        if (i >= word.length()) return;
        trie t = root.add(word.charAt(i), word);
        if (i == word.length() - 1) {
            t.endOfWord = true;
        }
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

        public trie add(char c, String fullString) {
            trie t = edges[c - 'a'];
            if (t != null) {
                if (t.endOfWord) {
                    System.out.println("BAD SET");
                    System.out.println(fullString);
                    System.exit(0);
                }
                return t;
            } else {
                edges[c - 'a'] = new trie(c);
                return edges[c - 'a'];
            }
        }
    }

}
