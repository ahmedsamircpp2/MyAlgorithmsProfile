package algorithms;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by rambo on 2/5/17.
 */
public class Trees {
    public static void main(String[] args) {
    }

    void LevelOrder(Node root) {
        Queue<Node> q = new ArrayDeque();
        q.add(root);
        while (!q.isEmpty()) {
            Node n = q.poll();
            if (n == null) continue;
            System.out.print(n.data + " ");
            if (n.left != null)
                q.add(n.left);
            if (n.right != null)
                q.add(n.right);
        }
    }

    static class Node {
        int data;
        Node left;
        Node right;
    }
}
