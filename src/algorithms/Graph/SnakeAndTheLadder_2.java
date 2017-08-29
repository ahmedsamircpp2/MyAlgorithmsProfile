package algorithms.Graph;
/**
 * Created by Ahmed Samir on 2/2/17.
 */

import java.util.*;

public class SnakeAndTheLadder_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(), max = 101, roll = 6, res = 1000000000;
        for (int i = 0; i < t; i++) {
            int l = in.nextInt();
            int la[] = new int[max], sa[] = new int[max];
            Arrays.fill(la, -1);
            for (int j = 0; j < l; j++) {
                la[in.nextInt()] = in.nextInt();
            }
            int s = in.nextInt();
            Arrays.fill(sa, -1);
            for (int j = 0; j < s; j++) {
                sa[in.nextInt()] = in.nextInt();
            }
            Queue<Map.Entry<Integer, Integer>> q = new ArrayDeque<>();
            q.add(new AbstractMap.SimpleEntry<Integer, Integer>(1, 0));
            boolean vis[] = new boolean[max];
            while (!q.isEmpty()) {
                Map.Entry<Integer, Integer> me = q.poll();
                int cell = me.getKey();
                if (!vis[cell]) {
                    vis[cell] = true;
                    if (la[cell] > -1)
                        cell = la[cell];
                    else if (sa[cell] > -1)
                        cell = sa[cell];
                    if (cell == 100) {
                        //                    System.out.println(me.getValue());
                        res = Math.min(res, me.getValue());
                    }
                    for (int k = 1; k <= roll; k++) {
                        int newCell = cell + k;
                        if (newCell <= 100)
                            q.add(new AbstractMap.SimpleEntry<Integer, Integer>(newCell, me.getValue() + 1));
                    }
                }
            }
            if (res == 1000000000) System.out.println(-1);
            else
                System.out.println(res);
        }

    }

}
