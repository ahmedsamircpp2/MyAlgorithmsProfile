package DataStructure.DisjointSets;/**
 * Created by rambo on 4/15/17.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MergingCommunities {

    static HashMap<Integer, Integer> count = new HashMap<>();

    public static int getParent(int a, int parent[]) {
        if (parent[a] == a) {
            return a;
        } else return parent[a] = getParent(parent[a], parent);
    }

    public static void setParent(int b, int a, int[] parent) {
        int p = getParent(a, parent);
        int gp = getParent(b, parent);
        if (p == gp) return;

        parent[gp] = p;
        count.put(p, count.get(p) + (count.get(gp)));

    }

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str[] = bf.readLine().split("\\s");
        int MAX = Integer.valueOf(str[0]) + 1;
        int q = Integer.valueOf(str[1]);
        int parent[] = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            count.put(i, 1);
        }
        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < MAX; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < q; i++) {
            str = bf.readLine().split("\\s");
            char a = Character.valueOf(str[0].charAt(0));
            int b = Integer.valueOf(str[1]);
            if (a == 'Q') {
                int qParent = getParent(b, parent);
                System.out.println(count.get(qParent));
            } else {
                int c = Integer.valueOf(str[2]);
                setParent(b, c, parent);
//                System.out.println(count);
//                System.out.println(Arrays.toString(parent));
            }
        }
    }
}
