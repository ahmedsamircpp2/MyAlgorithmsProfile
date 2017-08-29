package algorithms.Graph;
/**
 * Created by Ahmed Samir on 4/27/17.
 */

import java.util.*;

public class RoadsANdLibraries {
    static long cost[];
    static int min = 0;

    public static int getParent(int val, int parent[]) {
        if (parent[val] == val) return val;
        return parent[val] = getParent(parent[val], parent);
    }

    public static void setParent(int a, int b, int[] parent) {
        int pA = getParent(a, parent);
        int pb = getParent(b, parent);
        if (pA != pb) {
            parent[pA] = pb;
            cost[pb] += cost[pA];
            cost[pA] = 0;
            cost[pb] += min;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int r = in.nextInt();
            cost = new long[n];
            int cLib = in.nextInt();
            int cRoad = in.nextInt();
            min = Math.min(cLib, cRoad);
            int parent[] = new int[n];
            for (int j = 0; j < n; j++) {
                parent[j] = j;
                cost[j] = -1;
            }
            for (int j = 0; j < r; j++) {
                int c1 = in.nextInt() - 1;
                int c2 = in.nextInt() - 1;
                if (cost[c1] < 0)
                    cost[c1] = 0;
                if (cost[c2] < 0)
                    cost[c2] = 0;
                setParent(c1, c2, parent);
            }
            long total = 0;
            for (int j = 0; j < n; j++) {
                if (cost[j] == -1)
                    total += cLib;
                else if (cost[j] > 0) {
                    total += cost[j];
                    total += cLib;
                }
            }
            System.out.println(total);
        }
    }
}