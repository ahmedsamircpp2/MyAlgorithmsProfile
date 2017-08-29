package algorithms.Graph;/**
 * Created by Ahmed Samir on 2/2/17.
 */

import java.util.*;

public class SnakeAndTheLadder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int max = 101;
        int roll = 6;
        for (int i = 0; i < t; i++) {
            int l = in.nextInt();
            int la[] = new int[max];
            Arrays.fill(la, -1);
            for (int j = 0; j < l; j++) {
                la[in.nextInt()] = in.nextInt();
            }
            int s = in.nextInt();
            int sa[] = new int[max];
            Arrays.fill(sa, -1);
            for (int j = 0; j < s; j++) {
                sa[in.nextInt()] = in.nextInt();
            }
            int mat[][] = new int[10][10];
            Map.Entry<Integer, Integer> e[] = new AbstractMap.SimpleEntry[max];
            for (int j = 0, ll = 1; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    e[ll] = new AbstractMap.SimpleEntry<Integer, Integer>(j, k);
                    mat[j][k] = ll++;

                }
            }
            Queue<Map.Entry<Map.Entry<Integer, Integer>, Integer>> q = new ArrayDeque<>();
            q.add(new AbstractMap.SimpleEntry<Map.Entry<Integer, Integer>, Integer>(new AbstractMap.SimpleEntry<Integer, Integer>(0, 0), 0));
            int maxValue = -1000;
            boolean vis[][] = new boolean[10][10];
            while (!q.isEmpty()) {
                Map.Entry<Map.Entry<Integer, Integer>, Integer> entry = q.poll();
                int cell = mat[entry.getKey().getKey()][entry.getKey().getValue()];
                if (cell == max - 1) {
                    maxValue = Math.max(maxValue, entry.getValue());
                    continue;
                }
                if (!vis[entry.getKey().getKey()][entry.getKey().getValue()]) {
                    vis[entry.getKey().getKey()][entry.getKey().getValue()] = true;
                    for (int j = 1; j <= roll; j++) {
                        if (la[cell + j] > -1) {
                            cell = la[cell + j];
                        } else if (sa[cell + j] > -1) {
                            cell = sa[cell + j];
                        }

                        int ii = e[cell].getKey();
                        int jj = e[cell].getValue();
                        AbstractMap.SimpleEntry<Integer, Integer> index = new AbstractMap.SimpleEntry<>(ii, jj);

                        AbstractMap.SimpleEntry<Map.Entry<Integer, Integer>, Integer> position = new AbstractMap.SimpleEntry<>(index, entry.getValue() + 1);
                        q.add(position);
                    }
                }
            }
            if (maxValue < 0)
                System.out.println(-1);
            else
                System.out.println(maxValue);

        }
    }

}
