package Mathematics.fundamentals;/**
 * Created by Ahmed on 5/31/17.
 */

import java.util.*;

public class DieHard3_NotOptimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int m = in.nextInt();
            boolean vis[][] = new boolean[a + 1][b + 1];

            Queue<Map.Entry<Integer, Integer>> q = new ArrayDeque<>();
            boolean found = false;
            q.add(new AbstractMap.SimpleEntry<>(a, b));
            while (!q.isEmpty()) {
                Map.Entry<Integer, Integer> en = q.poll();
                if (vis[en.getKey()][en.getValue()])
                    continue;
                vis[en.getKey()][en.getValue()] = true;

                if (en.getKey() == m || en.getValue() == m) {
                    System.out.println("YES");
                    found = true;
                    break;
                }

                int sum = en.getKey() + en.getValue();
                int sub = Math.abs(en.getKey() - en.getValue());

                q.add(new AbstractMap.SimpleEntry<>(sum > a ? a : sum, sum > b ? b : sum));
                q.add(new AbstractMap.SimpleEntry<>(sum > a ? a : sum, en.getValue()));
                q.add(new AbstractMap.SimpleEntry<>(sum > a ? a : sum, 0));
                q.add(new AbstractMap.SimpleEntry<>(en.getKey(), sum > b ? b : sum));
                q.add(new AbstractMap.SimpleEntry<>(0, sum > b ? b : sum));

                q.add(new AbstractMap.SimpleEntry<>(sub > a ? a : sub, sub > b ? b : sub));
                q.add(new AbstractMap.SimpleEntry<>(sub > a ? a : sub, 0));
                q.add(new AbstractMap.SimpleEntry<>(0, sub > b ? b : sub));
                q.add(new AbstractMap.SimpleEntry<>(a, sub > b ? b : sub));
                q.add(new AbstractMap.SimpleEntry<>(sub > a ? a : sub, b));
            }
            if (!found)
                System.out.println("NO");
        }

    }

}
