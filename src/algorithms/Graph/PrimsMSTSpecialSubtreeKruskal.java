package algorithms.Graph;/**
 * Created by Ahmed Samir on 4/26/17.
 */

import java.util.*;

public class PrimsMSTSpecialSubtreeKruskal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Map<Integer, List<Edge>> ll = new HashMap<>();
        Set<Integer> vis = new HashSet<>();
        int startNode = -1;
        for (int i = 0; i < m; i++) {
            int s = in.nextInt();
            if (startNode == -1)
                startNode = s;
            int e = in.nextInt();
            int w = in.nextInt();
            ll.putIfAbsent(s, new ArrayList<>());
            ll.putIfAbsent(e, new ArrayList<>());
            ll.get(s).add(new Edge(e, w));
            ll.get(e).add(new Edge(s, w));
        }
        Queue<Edge> edges = new PriorityQueue<>(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return Integer.valueOf(o1.w).compareTo(o2.w);
            }
        });
        int cost = 0;
        Queue<Integer> start = new ArrayDeque<>();
        start.add(startNode);
        while (!start.isEmpty()) {
            int nn = start.poll();
            vis.add(nn);
            if (ll.get(nn) != null)
                for (Edge e : ll.get(nn)) {
                    if (!vis.contains(e.e)) {
                        edges.add(e);
                    }
                }
            while (!edges.isEmpty())
                if (vis.contains(edges.peek().e))
                    edges.poll();
                else
                    break;
            if (!edges.isEmpty()) {
                Edge ee = edges.poll();
                cost += ee.w;
                start.add(ee.e);
            }
//            System.out.println(cost);
        }
        System.out.println(cost);
    }

    static class Edge {
        int e, w;

        public Edge(int e, int w) {
            this.e = e;
            this.w = w;
        }
    }

}
