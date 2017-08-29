package algorithms.Graph.floyed;/**
 * Created by Ahmed Samir on 4/27/17.
 */

import java.util.*;

public class FloydTheCityofBlindingLights {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), r = in.nextInt();
        Map<Integer, Map<Integer, Integer>> m = new HashMap<>();
        for (int j = 0; j < r; j++) {
            int c1 = in.nextInt();
            m.putIfAbsent(c1, new HashMap<>());
            int c2 = in.nextInt();
            int w = in.nextInt();
            if (m.get(c1).get(c2) == null || m.get(c1).get(c2) > w)
                m.get(c1).put(c2, w);
        }
        int q = in.nextInt();
        StringBuilder st = new StringBuilder();
        for (int j = 0; j < q; j++) {
            int s = in.nextInt(), e = in.nextInt();
            int dis[] = new int[n + 1];
            Arrays.fill(dis, Integer.MAX_VALUE);
            Queue<Map.Entry<Integer, Integer>> queue = new ArrayDeque<>();
            queue.add(new AbstractMap.SimpleEntry<>(s, 0));
            Set<Integer> vis = new HashSet<>();
            while (!queue.isEmpty()) {
                Map.Entry<Integer, Integer> entry = queue.poll();
                dis[entry.getKey()] = Math.min(dis[entry.getKey()], entry.getValue());
                //if(entry.getKey()==e)break;
                vis.add(entry.getKey());
                if (m.get(entry.getKey()) != null)
                    for (Integer node : m.get(entry.getKey()).keySet()) {
                        if (!vis.contains(node)) {
                            queue.add(new AbstractMap.SimpleEntry<>(node, entry.getValue() + m.get(entry.getKey()).get(node)));
                        }
                    }
            }
            if (dis[e] == Integer.MAX_VALUE)
                st.append(-1).append("\n");
            else
                st.append(dis[e]).append("\n");
        }
        System.out.println(st.toString());
    }
}