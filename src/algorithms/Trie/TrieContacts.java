package algorithms.Trie;/**
 * Created by Ahmed Samir on 2/8/17.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrieContacts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Trie root = new Trie();
        for (int i = 0; i < n; i++) {
            String command = in.next();
            String param = in.next();
            if (command.equals("add")) {
                addWord(root, param, 0);
            } else {
                System.out.println(findPrefix(root, param, 0));
            }
        }
    }

    private static int findPrefix(Trie root, String param, int i) {
        if (root == null || i > param.length()) return 0;
        if (i == param.length()) return root.prefexCount;
        Trie t = root.edges.get(param.charAt(i));
        if (t == null) return 0;
        return findPrefix(t, param, i + 1);
    }

    private static Trie addWord(Trie root, String param, int i) {
        if (root == null || i >= param.length()) return null;
        return addWord(root.addEdge(param.charAt(i)), param, i + 1);

    }

    static class Trie {
        public Map<Character, Trie> edges;
        public int prefexCount = 1;
        public char val;

        public Trie() {
            edges = new HashMap<>();
        }

        public Trie addEdge(char x) {
            Trie trie = null;

            if (edges.get(x) != null) {
                trie = edges.get(x);
                trie.prefexCount++;
            } else {
                trie = new Trie();
                trie.val = x;
            }
            edges.put(x, trie);
            return trie;
        }
    }
}