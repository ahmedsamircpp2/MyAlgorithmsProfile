package DataStructure.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by rambo on 2/28/17.
 */
public class AlgorithmicCrush {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        long arr[] = new long[n];
        List<Pair> p = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            p.add(new Pair(in.nextInt(), in.nextInt(), in.nextInt()));
        }
        Collections.sort(p);
        System.out.println(p);
        long max = 0L;
        for (int i = 0; i < p.size(); i++) {
            max = Math.max(getAlgorithmicCrush(p, i, null), max);
        }
        System.out.println(max);
    }

    private static long getAlgorithmicCrush(List<Pair> p, int i, Pair prev) {
        if (i >= p.size())
            return 0;
        if (prev == null) {
            return p.get(i).val + getAlgorithmicCrush(p, i + 1, p.get(i));
        } else {
            if (p.get(i).l >= prev.l && p.get(i).l <= prev.r) {
                prev.l = Math.max(p.get(i).l, prev.l);
                prev.r = Math.min(p.get(i).r, prev.r);
                return p.get(i).val + getAlgorithmicCrush(p, i + 1, prev);
            } else {
                return 0;
            }
        }

    }

    static class Pair implements Comparable<Pair> {

        int l, r, val;

        public Pair(int l, int r, int val) {
            this.r = r;
            this.l = l;
            this.val = val;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.valueOf(this.l).compareTo(o.l);
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "l=" + l +
                    ", r=" + r +
                    ", val=" + val +
                    '}' + '\n';
        }
    }
}