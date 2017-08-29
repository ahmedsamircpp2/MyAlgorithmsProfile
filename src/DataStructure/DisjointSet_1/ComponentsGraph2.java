package DataStructure.DisjointSet_1;/**
 * Created by Ahmed Samir on 4/17/17.
 */

import java.util.*;

import java.util.Scanner;

public class ComponentsGraph2 {
    private static final int MAX = 15001 * 2;

    public static int getParent(int a, int parent[]) {
        return (parent[a] == a) ? a : (parent[a] = getParent(parent[a], parent));
    }

    public static void setParent(int b, int a, int[] parent) {
        int bb = getParent(b, parent);
        int ba = getParent(a, parent);
        if (bb != ba)
            parent[bb] = ba;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int parent[] = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            parent[i] = i;
        }
        int n = in.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            setParent(b, a, parent);
            max = Math.max(max, Math.max(a, b));
        }
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i <= max; i++) {
            count.put(i, 0);
        }
        for (int i = 0; i <= max; i++) {
            int val = getParent(parent[i], parent);
            count.put(val, count.get(val) + 1);
        }
        //get MIN/MAX
    }

}
