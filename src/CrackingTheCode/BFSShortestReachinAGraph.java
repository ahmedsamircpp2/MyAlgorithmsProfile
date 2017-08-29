package CrackingTheCode;/**
 * Created by Ahmed Samir on 4/13/17.
 */

import java.util.*;

public class BFSShortestReachinAGraph {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int nodes = in.nextInt();
            int noEdges = in.nextInt();
            Map<Integer, List<Integer>> edges = new HashMap<>();
            HashSet<Integer> vis = new HashSet<>();
            Map<Integer, Integer> result = new TreeMap<>();
            for (int j = 0; j < noEdges; j++) {
                int s = in.nextInt();
                int e = in.nextInt();
                if (edges.get(s) == null) {
                    edges.put(s, new ArrayList<>());
                }
                if (edges.get(e) == null) {
                    edges.put(e, new ArrayList<>());
                }
                edges.get(s).add(e);
                edges.get(e).add(s);
            }
            Queue<Cell> q = new ArrayDeque<>();
            int startPoint = in.nextInt();
            q.add(new Cell(startPoint));
            while (!q.isEmpty()) {
                Cell c = q.remove();
                if (c.id != startPoint) {
                    if (result.get(c.id) != null) {
                        result.put(c.id, Math.min(result.get(c.id), c.cost));
                    } else {
                        result.put(c.id, c.cost);
                    }
                }
                if (!vis.contains(c.id)) {
                    vis.add(c.id);
                    if (edges.get(c.id) == null) {
                        if (c.id != startPoint)
                            result.put(c.id, -1);

                    } else {
                        for (int j = 0; j < edges.get(c.id).size(); j++) {
                            Cell c2 = new Cell(edges.get(c.id).get(j));
                            c2.cost = c.cost + 6;
                            q.add(c2);
                        }
                    }
                }
            }
            for (int j = 0; j < nodes; j++) {
                if (!vis.contains(j + 1) && (j + 1) != startPoint) {
                    result.put(j + 1, -1);
                }
            }

            for (Integer kk :
                    result.keySet()) {
                System.out.print(result.get(kk) + " ");
            }
            System.out.println();
        }

    }

    static class Cell {
        int id, cost = 0;

        public Cell(int id) {
            this.id = id;
        }
    }
}
//6 -1 -1 -1 -1 -1 12 -1 12