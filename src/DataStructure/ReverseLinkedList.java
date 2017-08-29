package DataStructure;/**
 * Created by Ahmed Samir on 2/4/17.
 */

import java.util.Scanner;

public class ReverseLinkedList {
    static Node Reverse(Node head) {
        if (head == null || head.next == null) return head;
        Node res = Reverse(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }

    static Node InsertNth(Node head, int data, int position) {
        Node i = new Node();
        i.data = data;
        if (position == 0) {
            if (head == null) {
                head = i;
                head.next = null;
            } else {
                i.next = head;
                return i;
            }
        } else
            head.next = InsertNth(head.next, data, position - 1);
        return head;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            root = InsertNth(root, a, b);
        }


        root = Reverse(root);
        System.out.println(root);


        while (root != null) {
            System.out.print(root.data);
            root = root.next;
        }


    }

    static class Node {
        public int data;
        public Node next;
    }

}
