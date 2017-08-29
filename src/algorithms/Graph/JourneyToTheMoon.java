package algorithms.Graph;

import java.util.*;


/**
 * InProgress
 */

/**
 * Created by rambo on 2/11/17.
 */
public class JourneyToTheMoon {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int I = in.nextInt();
        Map<Integer, List<Integer>> asto = new HashMap<>();
        for (int i = 0; i < I; i++) {
            Integer a = in.nextInt();
            Integer b = in.nextInt();
            if (asto.get(a) == null) asto.put(a, new ArrayList<Integer>());
            asto.get(a).add(b);
            if (asto.get(b) == null) asto.put(b, new ArrayList<Integer>());
            asto.get(b).add(a);
        }
        boolean vis[] = new boolean[N];
        long combinations = 0;
        List<Integer> sums = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();

        for (Integer key : asto.keySet()) {
            if (!vis[key]) {
                int sum = 0;
                q.add(key);
                while (!q.isEmpty()) {
                    int val = q.poll();
                    if (!vis[val]) {
                        sum++;
                        vis[val] = true;
                        List<Integer> ll = asto.get(val);
                        for (int i = 0; i < ll.size(); i++) {
                            q.add(ll.get(i));
                        }
                    }
                }
                sums.add(sum);
            }
        }
        for (int i = 0; i < N; i++) {
            if (!vis[i])
                sums.add(1);
        }
        long countTillNow = 1;

//        System.out.println(asto);
//        System.out.println(sums);
        long acc = 0;
        long prev = sums.get(0);
        acc += prev;
        for (int i = 1; i < sums.size(); i++) {
            combinations += (acc * sums.get(i));
            acc += sums.get(i);
        }
        System.out.println(combinations);
    }
}
