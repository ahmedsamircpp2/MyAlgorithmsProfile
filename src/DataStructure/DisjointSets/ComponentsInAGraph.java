package DataStructure.DisjointSets;
/**
 * Created by rambo on 4/15/17.
 */


import java.util.*;

public class ComponentsInAGraph {
    private static final int MAX = 15001 * 2;

    public static int getParent(int a, int parent[]) {
        if (parent[a] == a) {
            return a;
        } else return getParent(parent[a], parent);
    }

    public static void setParent(int b, int a, int[] parent) {
        if (getParent(b, parent) == b) {
            parent[b] = getParent(a, parent);
        } else {
            parent[getParent(b, parent)] = getParent(a, parent);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int parent[] = new int[MAX];
        List<Integer> ll = new ArrayList<>();
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
        Queue<Integer> higher = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
        });
        Queue<Integer> lower = new PriorityQueue<>();
        for (int i = 0; i <= max; i++) {
            higher.add(count.get(i));
            if (count.get(i) > 1)
                lower.add(count.get(i));
        }
        System.out.println(lower.peek() + " " + higher.peek());
    }
}