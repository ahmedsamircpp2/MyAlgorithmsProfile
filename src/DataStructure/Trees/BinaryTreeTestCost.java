package DataStructure.Trees;/**
 * Created by Ahmed Samir on 4/17/17.
 */

import java.util.Scanner;

public class BinaryTreeTestCost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

    }

    public int getCost(Node root) {
        if (root == null) return 0;
        int left = getCost(root.left);
        int right = getCost(root.right);
        int val = Math.max(left, right) + root.val;
        if (val < 0) return 0;
        else {
            return val;
        }
    }

    static class Node {
        Node left, right;
        int val;

    }

}
