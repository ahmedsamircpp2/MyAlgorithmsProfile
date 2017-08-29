package DataStructure.Queue;/**
 * Created by Ahmed Samir on 2/22/17.
 */

import java.util.*;

public class TruckTour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<truck> ll = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ll.add(new truck(in.nextInt(), in.nextInt()));
        }
        int res = -1;
        for (int i = 0; i < ll.size(); i++) {
            Queue<truck> q = new ArrayDeque<>();
            truck teto = ll.get(i);
            teto.index = i;
            q.add(teto);
            while (!q.isEmpty()) {
                truck t = q.poll();
                if (t.passed == n) {
                    res = t.index;
                    break;
                }
                if (t.p >= t.d) {
                    truck next = ll.get((t.index + 1) % ll.size());
                    truck e = new truck((t.p - t.d) + next.p, next.d);
                    e.passed = t.passed + 1;
                    e.index = (t.index + 1) % ll.size();
                    q.add(e);
                } else {
                    break;
                }
            }
            if (res > -1) {
                System.out.println(res);
                break;
            }
        }
    }

    static class truck {
        public int p;
        public int d;
        public int passed = 0;
        public int index = 0;

        public truck(int p, int d) {
            this.p = p;
            this.d = d;
        }
    }

}
