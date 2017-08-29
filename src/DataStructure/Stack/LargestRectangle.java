package DataStructure.Stack;

import java.util.*;

/**
 * Created by rambo on 2/12/17.
 */

/**
 * Wrong
 */
public class LargestRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Queue<Integer> q = new PriorityQueue<>();
        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            q.add(val);
            ll.add(val);
        }
        long max = -1;
        int i = 0;
        while (!q.isEmpty() && !ll.isEmpty()) {
            int num = q.peek();
            long res = num * q.size();
            max = Math.max(res, max);
            System.out.println("==> " + ll.get(i));
            q.remove(ll.get(i++));
        }
        System.out.println(max);
    }
    //26152
}
