package algorithms.Graph;/**
 * Created by Ahmed Samir on 4/26/17.
 */

import java.util.*;

public class BreadthFirstSearchDummy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int e = in.nextInt();
            Map<Integer, List<Integer>> ll = new HashMap<>();
            Map<Integer, Integer> cost = new HashMap<>();
            for (int j = 0; j < n; j++) {
                cost.put(j + 1, -1);
            }
            Set<Integer> vis = new HashSet<>();
            for (int j = 0; j < e; j++) {
                int start = in.nextInt();
                int end = in.nextInt();
                ll.putIfAbsent(Integer.valueOf(start), new ArrayList<>());
                ll.get(start).add(end);
            }
            Queue<Map.Entry<Integer, Integer>> q = new ArrayDeque<>();
            int sVal = in.nextInt();
            q.add(new AbstractMap.SimpleEntry<>(sVal, 0));
            while (!q.isEmpty()) {
                Map.Entry<Integer, Integer> en = q.poll();
                cost.put(en.getKey(), en.getValue());
                if (!vis.contains(en.getKey())) {
                    vis.add(en.getKey());
                    if (ll.get(en.getKey()) != null) {
                        List<Integer> li = ll.get(en.getKey());
                        for (int k = 0; k < li.size(); k++) {
                            if (cost.get(li.get(k)) == -1)
                                q.add(new AbstractMap.SimpleEntry<>(li.get(k), en.getValue() + 6));
                        }
                    }
                }

            }
            for (int k :
                    cost.keySet()) {
                if (k != sVal)
                    if (cost.get(k) == 2147483647)
                        System.out.print(-1);
                    else System.out.print(cost.get(k) + " ");
            }
            System.out.println();
        }
    }

}
