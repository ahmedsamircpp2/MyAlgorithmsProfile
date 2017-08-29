package algorithms.Graph.Dijkstra2;/**
 * Created by Ahmed Samir on 5/4/17.
 */

import java.util.*;

public class DijkstraShortestReach2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int INF = Integer.MAX_VALUE;
        Queue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) -> o1.getValue().compareTo(o2.getValue()));

        for (int i = 0; i < t; i++) {
            int n = in.nextInt() + 1;
            int m = in.nextInt();
            int g[][] = new int[n][n];
            int dist[] = new int[n];
            boolean vis[] = new boolean[n];
            Arrays.fill(dist, INF);

            for (int j = 0; j < m; j++) {
                int s = in.nextInt(), e = in.nextInt(), w = in.nextInt();
                g[s][e] = Math.min(g[s][e], w);
                g[e][s] = Math.min(g[e][s], w);
            }
            int start = in.nextInt();
            dist[start] = 0;
            q.clear();
            q.add(new AbstractMap.SimpleEntry<>(start, dist[start]));
            while (!q.isEmpty()) {
                Map.Entry<Integer, Integer> head = q.poll();
                vis[head.getKey()] = true;
                for (int j = 1; j < n; j++) {
                    if (!vis[j] && g[head.getKey()][j] > 0 && dist[head.getKey()] != INF) {
                        dist[j] = Math.min(dist[j], dist[head.getKey()] + g[head.getKey()][j]);
                        q.add(new AbstractMap.SimpleEntry<>(j, dist[j]));
                    }
                }
            }
            for (int j = 1; j < n; j++) {
                if (j != start)
                    if (dist[j] == INF)
                        System.out.print(-1 + " ");
                    else
                        System.out.print(dist[j] + " ");
            }
            System.out.println();
        }
    }
//20 25 25 68 86 39 22 70 36 53 91 35 88 27 30 43 54 74 41
//20 48 25 68 86 64 22 95 43 53 116 35 88 52 54 43 66 74 66

    /*
1
20 54
1 7 45
2 14 15
3 7 29
4 1 48
5 1 66
6 7 17
7 14 15
8 14 43
9 1 27
10 1 33
11 14 64
12 14 27
13 7 66
14 7 54
15 14 56
16 7 21
17 1 20
18 1 34
19 7 52
20 14 14
9 14 9
15 1 39
12 1 24
9 1 16
1 2 33
18 1 46
9 1 28
15 14 3
12 1 27
1 2 5
15 1 34
1 2 28
9 7 16
3 7 23
9 7 21
9 14 19
3 1 20
3 1 5
12 14 19
3 14 2
12 1 46
3 14 5
9 14 44
6 14 26
9 14 16
9 14 34
6 7 42
3 14 27
1 7 9
1 7 41
15 14 19
12 7 13
3 7 10
1 7 2
17
     */
}
