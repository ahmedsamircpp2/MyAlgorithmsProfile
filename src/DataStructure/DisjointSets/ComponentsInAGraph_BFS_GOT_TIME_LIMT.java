package DataStructure.DisjointSets;/**
 * Created by rambo on 4/15/17.
 */

import java.io.*;
import java.util.*;

public class ComponentsInAGraph_BFS_GOT_TIME_LIMT {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bf.readLine());
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String xx[] = bf.readLine().split("\\s+");
            int a = Integer.valueOf(xx[0]);
            int b = Integer.valueOf(xx[1]);
            if (map.get(a) == null)
                map.put(a, new ArrayList<>());
            if (map.get(b) == null)
                map.put(b, new ArrayList<>());
            map.get(a).add(b);
            map.get(b).add(a);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Queue<Integer> q = new ArrayDeque<>();
        HashSet<Integer> hd = new HashSet<>();
        for (int k : map.keySet()) {
            q.clear();
            hd.clear();
            int count = 0;
            q.add(k);
            while (!q.isEmpty()) {
                int val = q.remove();
                if (!hd.contains(val)) {
                    count++;
                    hd.add(val);
                    for (int vv : map.get(val)) {
                        if (!hd.contains(vv)) {
                            q.add(vv);
                        }
                    }
                }
            }
            max = Math.max(max, count);
            if (count > 1)
                min = Math.min(min, count);
        }
        System.out.println(min + " " + max);
    }
}