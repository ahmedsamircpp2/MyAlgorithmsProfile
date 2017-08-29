package DataStructure;/**
 * Created by Ahmed Samir on 2/4/17.
 */

import java.util.*;

public class AlgorithmicCrush_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long index[] = new long[n];
        long w[] = new long[n];
        long max = 0;

        List<Cell> cell = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            cell.add(new Cell(a, b, c));

        }
        for (int i = 0; i < m; i++) {
            long val = cell.get(i).cost;
            for (int j = 0; j < m; j++) {
                if (j == i) continue;
                if (cell.get(i).b >= cell.get(j).a && cell.get(j).a >= cell.get(i).a) {
                    val += cell.get(j).cost;
                }
            }
            max = Math.max(val, max);
        }
        System.out.println(max);
    }

    static class Cell {
        public long a;
        public long b;
        public long cost;

        public Cell(long a, long b, long cost) {
            this.a = a;
            this.b = b;
            this.cost = cost;
        }
    }
}
