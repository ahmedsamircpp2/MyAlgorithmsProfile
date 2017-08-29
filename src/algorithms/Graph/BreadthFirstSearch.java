package algorithms.Graph;/**
 * Created by Ahmed Samir on 4/26/17.
 */

import java.util.*;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int e = in.nextInt();
            Map<Integer, List<Integer>> ll = new HashMap<>();
            int[] cost = new int[n + 1];
            for (int j = 0; j < n + 1; j++) {
                cost[j] = -1;
            }
            Set<Integer> vis = new HashSet<>();
            for (int j = 0; j < e; j++) {
                int v1 = in.nextInt(), v2 = in.nextInt();
                ll.putIfAbsent(Integer.valueOf(v1), new ArrayList<>());
                ll.putIfAbsent(Integer.valueOf(v2), new ArrayList<>());
                ll.get(v2).add(v1);
                ll.get(v1).add(v2);

            }
            Queue<Integer> q = new ArrayDeque<>();
            int starter = in.nextInt();
            cost[starter] = 0;
            cost[0] = 0;
            q.add(starter);
            while (!q.isEmpty()) {
                int node = q.remove();
                if (!vis.contains(node)) {
                    if (ll.get(node) != null)
                        for (int val : ll.get(node)) {
                            if (!vis.contains(val)) {
                                if (cost[val] == -1) {
                                    cost[val] = cost[node] + 6;
                                    q.add(val);
                                } else {
                                    cost[val] = Math.min(cost[node] + 6, cost[val]);
                                }
                            }
                        }
                }
            }
            for (int j = 0; j < cost.length; j++) {
                if (cost[j] != 0)
                    System.out.print(cost[j] + " ");
            }
            System.out.println();
        }
    }

}
