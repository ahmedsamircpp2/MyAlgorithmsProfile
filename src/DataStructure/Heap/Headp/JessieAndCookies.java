package DataStructure.Heap.Headp;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by rambo on 2/5/17.
 */
public class JessieAndCookies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        Queue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            q.add(in.nextInt());
        }
        int op = 0;
        while (!q.isEmpty()) {
            if (q.peek() < s && q.size() > 1) {
                int fe = q.poll();
                int se = q.poll();
                int fi = 1 * fe + 2 * se;
                q.add(fi);
                op++;
            } else {
                break;
            }
        }
        if (!q.isEmpty() && q.peek() >= s)
            System.out.println(op);
        else System.out.println(-1);

    }
}
