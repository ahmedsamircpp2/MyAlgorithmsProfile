package DataStructure.Trees;/**
 * Created by Ahmed Samir on 5/23/17.
 */

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;

public class SwapNodes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Node> q = new ArrayDeque<>();
        Node root = new Node(1);
        root.depth = 1;
        root.parent = null;
        q.add(root);
        int n = in.nextInt();
        boolean left = true;
        int maxDepth = 0;
        for (int i = 0; i < n; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            if (!q.isEmpty()) {
                Node node = q.poll();
                if (l > -1) {
                    Node lNode = new Node(l);
                    lNode.depth = node.depth + 1;
                    node.left = lNode;
                    q.add(node.left);
                    maxDepth = Math.max(maxDepth, lNode.depth);
                }
                if (r > -1) {
                    Node rNode = new Node(r);
                    rNode.depth = node.depth + 1;
                    node.right = rNode;
                    q.add(node.right);
                    maxDepth = Math.max(maxDepth, rNode.depth);
                }
            }
        }
        int k = in.nextInt();
        for (int i = 0; i < k; i++) {
            int swap = in.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for (int j = 1; swap * j <= maxDepth; j++) {
                set.add(j * swap);
            }
            swap(root, set);
            inorder(root);
            System.out.println();
        }
    }

    private static void swap(Node root, HashSet<Integer> s) {
        if (root != null) {
            if (s.contains(root.depth)) {
                Node tmp = root.right;
                root.right = root.left;
                root.left = tmp;
            }
            swap(root.right, s);
            swap(root.left, s);
        }
    }

    private static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    static class Node {
        int val, depth;
        Node left, right, parent;

        public Node(int val) {
            this.val = val;
        }
    }

}
