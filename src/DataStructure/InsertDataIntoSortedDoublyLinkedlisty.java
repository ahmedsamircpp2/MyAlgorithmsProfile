package DataStructure;

import java.util.Scanner;

/**
 * Created by rambo on 2/5/17.
 */
public class InsertDataIntoSortedDoublyLinkedlisty {
    static Node Reverse(Node head) {
        if (head == null || head.next == null) return head;
        Node root = Reverse(head.next);
        Node tmp = head.next.next;
        head.next.next = head;
        head.next = tmp;

        return root;
    }

    static Node SortedInsert(Node head, int data) {
        if (head == null) {
            Node n = new Node();
            n.data = data;
            n.next = null;
            n.prev = null;
            head = n;
        } else if (head.data >= data) {
            Node n = new Node();
            n.data = data;
            n.next = head;
            if (head.prev != null) {
                n.prev = head.prev;
                head.prev.next = n;
            }
            head = n;
        } else
            head.next = SortedInsert(head.next, data);
        return head;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int arr[] = new int[n];
            Node root = null;
            for (int j = 0; j < n; j++) {
                root = SortedInsert(root, in.nextInt());
            }


//            Node nn =root;
//            while(root!=null) {
//                System.out.print(root.data + " ");
//                root =root.next;
//            }
//            System.out.println();

            Node res = Reverse(root);
//            root=nn;
            while (res != null) {
                System.out.print(res.data + " ");
                res = res.next;
            }
            System.out.println();


        }
    }

    static class Node {
        int data;
        Node next;
        Node prev;
    }
}
