package DataStructure.Trees;

/**
 * Created by rambo on 2/5/17.
 */
public class BinaryTreeInsertio {
    static Node Insert(Node root, int value) {
        if (root == null) {
            Node n = new Node();
            n.data = value;
            n.left = null;
            n.right = null;
            return n;
        }
        if (root.data > value)
            root.right = Insert(root.right, value);
        else
            root.left = Insert(root.left, value);

        return root;

    }

    public static void main(String[] args) {
        Node r = null;
        r = Insert(r, 5);
        r = Insert(r, 5);
        r = Insert(r, 4);
        r = Insert(r, 2);
        r = Insert(r, 7);
        r = Insert(r, 8);


    }

    static class Node {

        int data;
        Node left;
        Node right;
    }
}
