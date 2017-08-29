package DataStructure.BalancedTree;/**
 * Created by Ahmed Samir on 5/3/17.
 */

import java.util.Scanner;

public class InsertInAVL {
    public static int heightMax(Node root) {
        int maxHeight = -1;
        if (root.left != null)
            maxHeight = Math.max(maxHeight, root.left.ht);
        if (root.right != null)
            maxHeight = Math.max(maxHeight, root.right.ht);
        return maxHeight;
    }

    //rotate Left
    public static Node rotateLeft(Node x) {
        Node y = x.right;
        x.right = y.left;
        y.left = x;
        // height
        x.ht = heightMax(x) + 1;
        y.ht = heightMax(y) + 1;
        return y;
    }

    // rotate Right
    public static Node rotateRight(Node x) {
        Node y = x.left;
        x.left = y.right;
        y.right = x;
        // height
        x.ht = heightMax(x) + 1;
        y.ht = heightMax(y) + 1;
        return y;
    }

    // left - right
    public static int bFactor(Node root) {
        int left = -1;
        int right = -1;
        if (root.right != null)
            right = root.right.ht;

        if (root.left != null)
            left = root.left.ht;
        return (left - right);
    }

    static Node insert(Node root, int val) {
        if (root == null) {
            Node newNode = new Node();
            newNode.val = val;
            newNode.ht = 0;
            newNode.left = newNode.right = null;
            return newNode;
        }
        if (val < root.val)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        //check if it's balanced or not
        int bf = bFactor(root);
        if (bf < -1) {
            if (bFactor(root.right) > 0) {
                root.right = rotateRight(root.right);
                return rotateLeft(root);
            } else {
                return rotateLeft(root);
            }
        } else if (bf > 1) {
            if (bFactor(root.left) < 0) {
                root.left = rotateLeft(root.left);
                return rotateRight(root);
            } else {
                return rotateRight(root);
            }
        }

        root.ht = heightMax(root) + 1;
        return root;
    }

    static class Node {
        int val, ht;      //Height
        Node left, right;   //Right child

    }


}
