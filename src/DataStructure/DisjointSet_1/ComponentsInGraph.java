package DataStructure.DisjointSet_1;/**
 * Created by Ahmed Samir on 4/17/17.
 */

import java.util.*;

public class ComponentsInGraph {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt(), b = in.nextInt();
            if (map.get(a) == null) map.put(a, new ArrayList<>());
            if (map.get(b) == null) map.put(b, new ArrayList<>());
            map.get(a).add(b);
            map.get(b).add(a);
        }
        Queue<Integer> q = new ArrayDeque<>();
        HashSet<Integer> hd = new HashSet<>();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, count;
        for (int k : map.keySet()) {
            count = 0;
            q.add(k);
            while (!q.isEmpty()) {
                int val = q.poll();
                if (!hd.contains(val)) {
                    count++;
                    hd.add(val);
                    for (int vv : map.get(val))
                        if (!hd.contains(vv))
                            q.add(vv);
                }
            }
            max = Math.max(max, count);
            if (count > 1) min = Math.min(min, count);
            q.clear();
        }
        System.out.println(min + " " + max);
    }
}