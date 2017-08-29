package DataStructure.Heap.Headp;

import java.util.*;

/**
 * Created by rambo on 2/5/17.
 */
public class QHEAP1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Queue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < t; i++) {
            int option = in.nextInt();
            if (option == 1) {
                heap.add(in.nextInt());
            } else if (option == 2) {
                heap.remove(in.nextInt());
            } else {
                System.out.println(heap.peek());
            }
        }
    }
}