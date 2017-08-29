package DataStructure.Arrays;

import java.util.*;

/**
 * Created by rambo on 2/6/17.
 */
public class CrashAlgorithm_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long arr[] = new long[n];
        List<Cell> ll = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            ll.add(new Cell(in.nextInt(), in.nextInt(), in.nextInt()));
        }
        Collections.sort(ll);
        ll.stream().forEach(e -> System.out.println(e));
        long maxSoFar = ll.get(0).c;
        long max = ll.get(0).c;
        Cell range = ll.get(0);
        for (int j = 0; j < ll.size(); j++) {
            if (ll.get(j).a <= range.b && ll.get(j).a >= range.a) {
                max = Math.max(ll.get(j).c, max + ll.get(j).c);
            } else {
                max = ll.get(j).c;
            }
            maxSoFar = Math.max(maxSoFar, max);
            System.out.println("==>" + maxSoFar);
            range = ll.get(j);
        }


        System.out.println(maxSoFar);
    }

    static class Cell implements Comparable<Cell> {
        int a;
        int b;
        int c;

        public Cell(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public String toString() {
            return "Cell{" +
                    "a=" + a +
                    ", b=" + b +
                    ", c=" + c +
                    '}';
        }

        @Override
        public int compareTo(Cell o) {
            if (a != o.a)
                return Integer.valueOf(a).compareTo(Integer.valueOf(o.a));
            else
                return Integer.valueOf(b).compareTo(Integer.valueOf(o.b));
        }
    }
}
