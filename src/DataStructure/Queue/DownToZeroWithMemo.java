package DataStructure.Queue;
/**
 * Created by Ahmed Samir on 2/22/17.
 */

import java.util.*;

public class DownToZeroWithMemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Queue<cell> q = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int vv = in.nextInt();
            min = Integer.MAX_VALUE;
            q.add(new cell(vv, 0));
            boolean vis[] = new boolean[vv + 1];
            while (!q.isEmpty()) {
                cell m = q.poll();
                if (!vis[m.key]) {
                    vis[m.key] = true;
                    if (m.key == 0) {
                        if (m.val < min)
                            min = m.val;
                    } else {
                        for (int j = (int) Math.sqrt(m.key) + 1; j > 1; j--) {
                            if (m.key % j == 0 && m.val + 1 < min) {
                                q.add(new cell(Math.max(j, m.key / j), m.val + 1));
                            }
                        }
                        if (m.val + 1 < min)
                            q.add(new cell(m.key - 1, m.val + 1));
                    }
                }
            }
            System.out.println(min);
        }
    }

    static class cell {
        int key;
        int val;

        public cell(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

}
