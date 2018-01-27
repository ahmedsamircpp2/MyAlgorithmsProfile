package CrackingTheCodeInterviewRevision;

import java.util.HashSet;
import java.util.Set;

public class DetectLoopInLinkedList {

    static class Node {
        int value ;
        Node nextNode;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node nextNode) {
            this.value = value;
            this.nextNode = nextNode;
        }
    }
    public static void main(String[] args) {

        Node one = new Node(1), two = new Node(2), three = new Node(3);
        Node four = new Node(4), five = new Node(5), six = new Node(6);
        Node seven  = new Node(7), eight = new Node(8), nine = new Node(9);
        one.nextNode=two;
        two.nextNode=three;
        three.nextNode=four;
        four.nextNode=five;
        five.nextNode=six;
        six.nextNode=two;
        seven.nextNode=eight;
        eight.nextNode=nine;

        System.out.println(isCyclic(one));
        System.out.println(isCyclic2(one));




    }
// a b c d e f g c
    private static boolean isCyclic(Node one) {
        if(one ==null) return false;

        one = one.nextNode;
        Node fast =one.nextNode.nextNode;
        while(one!=null && fast!=null){
            if(fast==one){
                return true;
            }
            one=one.nextNode;
            fast=fast.nextNode.nextNode;
        }
        return false;
    }

    private static boolean isCyclic2(Node one) {
        Set<Node>  memo= new HashSet<>();
        while (one!=null ){
            if(memo.contains(one))
                return true;
            memo.add(one);
            one = one.nextNode;
        }
        return false;
    }


}
