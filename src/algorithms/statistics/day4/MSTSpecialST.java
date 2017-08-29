package algorithms.statistics.day4; /**
 * Created by Ahmed Samir on 3/1/17.
 */

import java.util.*;

public class MSTSpecialST {


    static int parent[];

    public static int getParent(int i) {
        if (parent[i] == i) return i;
        else return getParent(parent[i]);
    }

    public static void setParent(int k, int i) {
        parent[k] = getParent(i);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Map<Integer, List<Edge>> edges = new HashMap<>();
        for (int i = 0; i <= n; edges.put(i, new LinkedList<>()), i++) ;

        boolean vis[] = new boolean[n + 1];
        Arrays.fill(vis, false);
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int s = in.nextInt();
            int d = in.nextInt();
            int val = in.nextInt();
            edges.get(s).add(new Edge(s, d, val));
            edges.get(d).add(new Edge(d, s, val));
        }
        int start = in.nextInt();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        int val = 0;
        while (!q.isEmpty()) {
            int v = q.poll();
            if (!vis[v]) {
                vis[v] = true;
                if (edges.get(v) != null) {
                    for (Edge e : edges.get(v)) {
                        if (getParent(e.s) != start) {
                            setParent(e.s, start);
                            val += e.w;
                        }
                        q.add(e.s);
                    }
                }
            }
        }
    }

    static class Edge {
        int s, e, w;

        public Edge(int s, int e, int w) {
            this.s = s;
            this.e = e;
            this.w = w;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "s=" + s +
                    ", e=" + e +
                    ", w=" + w +
                    '}' + '\n';
        }
    }
}



