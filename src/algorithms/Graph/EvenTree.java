package algorithms.Graph;/**
 * Created by Ahmed Samir on 1/27/17.
 */

import java.util.*;

public class EvenTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), child = -1, parent = -1;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        boolean leaf[] = new boolean[n];
        Arrays.fill(leaf, true);

        int hierarchy[] = new int[n], counts[] = new int[n];
        for (int i = 0; i < n; i++) {
            hierarchy[i] = i;
            counts[i] = 1;
        }
        for (int i = 0; i < m; i++) {
            child = in.nextInt();
            parent = in.nextInt();

            if (graph.get(parent) == null)
                graph.put(parent, new ArrayList<>());
            graph.get(parent).add(child);
            hierarchy[child - 1] = parent - 1;
        }

        for (int i = 0; i < n; i++)
            fillArray(i, hierarchy, counts, 1);

        int cut = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        while (!queue.isEmpty()) {
            int val = queue.poll();
            if (graph.get(val) != null) {
                List<Integer> nElement = graph.get(val);
                for (int i = 0; i < nElement.size(); i++) {
                    queue.add(nElement.get(i));
                }
                if (val != 1 && counts[val - 1] % 2 == 0) cut++;
            }
        }

        System.out.println(cut);
    }

    private static void fillArray(int i, int[] parent, int[] parentsChild, int val) {
        if (parent[i] == i)
            return;
        parentsChild[parent[i]] += val;
        fillArray(parent[i], parent, parentsChild, val);
    }
}
