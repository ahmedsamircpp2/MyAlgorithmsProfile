package DataStructure.Trie;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by rambo on 2/7/17.
 */
public class TrieContacts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        trie root = new trie(' ');
        for (int i = 0; i < t; i++) {
            String command = in.next();
            String val = in.next();
            if (command.equals("add")) {
                insertToTheTrie(root, val, 0);
            } else {
//                System.out.println(root);
                System.out.println(find(root, val, 0));
            }
        }
    }

    private static int find(trie root, String val, int i) {
        if (root == null || i >= val.length())
            return -1;
        if (root.childs.get(val.charAt(i)) == null && i < val.length()) return 0;
        else return Math.max(find(root.childs.get(val.charAt(i)), val, i + 1), root.count);
    }

    private static void insertToTheTrie(trie root, String val, int i) {
        if (i >= val.length()) return;
        insertToTheTrie(root.addChild(val.charAt(i)), val, i + 1);
    }


    static class trie {
        public Map<Character, trie> childs;
        public int count = 0;
        public char val;
        public boolean isRoot;

        public trie(char val) {
            this.val = val;
            childs = new HashMap<>();
            isRoot = false;
        }

        public trie addChild(char val) {
            if (childs.get(val) != null) {
                trie t = childs.get(val);
                t.count++;
                return t;
            } else {
                trie t = new trie(val);
                childs.put(val, t);
                t.count++;
                return t;
            }
        }

        @Override
        public String toString() {
            return "trie{" +
                    "childs=" + childs +
                    ", count=" + count +
                    ", val=" + val +
                    ", isRoot=" + isRoot +
                    '}';
        }
    }
}
