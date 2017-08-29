package algorithms.Hack101;/**
 * Created by Ahmed Samir on 2/14/17.
 */

import java.util.*;

public class MarcCupCake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Queue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        long res = 0L;

        for (int i = 0; i < n; i++) {
            q.add(in.nextInt());
        }

        int i = 0;
        while (!q.isEmpty()) {
            res += (q.poll() * Math.pow(2, i++));
        }
        System.out.println(res);
    }

}
