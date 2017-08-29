package algorithms.Graph.Dijkstra2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Dijkstra2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int INF = Integer.MAX_VALUE;
        for (int i = 0; i < t; i++) {
            int n = in.nextInt() + 1;
            int m = in.nextInt();
            int g[][] = new int[n][n];
            for (int j = 0; j < n; j++) {
                Arrays.fill(g[j], -1);
                g[j][j] = 0;
            }
            int dist[] = new int[n];
            boolean vis[] = new boolean[n];
            Arrays.fill(vis, false);
            Arrays.fill(dist, INF);

            for (int j = 0; j < m; j++) {
                int s = in.nextInt(), e = in.nextInt(), w = in.nextInt();
                if (g[s][e] > -1)
                    g[s][e] = Math.min(g[s][e], w);
                else
                    g[s][e] = w;

                if (g[e][s] > -1)
                    g[e][s] = Math.min(g[e][s], w);
                else
                    g[e][s] = w;

            }
            int start = in.nextInt();
            dist[start] = 0;
            Queue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });
            q.add(new AbstractMap.SimpleEntry<>(start, dist[start]));
            while (!q.isEmpty()) {
                Map.Entry<Integer, Integer> head = q.poll();
                if (vis[head.getKey()]) continue;
                vis[head.getKey()] = true;
                for (int j = 1; j < n; j++) {
                    if (!vis[j] && g[head.getKey()][j] > -1 && dist[head.getKey()] != INF) {
                        dist[j] = Math.min(dist[j], dist[head.getKey()] + g[head.getKey()][j]);
                        q.add(new AbstractMap.SimpleEntry<>(j, dist[j]));
                    }
                }
            }

            for (int j = 1; j < n; j++) {
                if (j != start)
                    if (dist[j] == INF) System.out.print(-1 + " ");
                    else System.out.print(dist[j] + " ");
            }
            System.out.println();
        }
    }
}
