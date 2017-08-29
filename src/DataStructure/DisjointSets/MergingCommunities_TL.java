package DataStructure.DisjointSets;/**
 * Created by rambo on 4/15/17.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MergingCommunities_TL {

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

    private static void printSize(int b, int[] parent, int max) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int qParent = getParent(b, parent);
        for (int i = 0; i < max; i++) {
            count.put(i, 0);
        }
        for (int i = 0; i < max; i++) {
            int val = getParent(parent[i], parent);
            count.put(val, count.get(val) + 1);
        }
        System.out.println(count.get(qParent));
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str[] = bf.readLine().split("\\s");
        int MAX = Integer.valueOf(str[0]) + 1;
        int q = Integer.valueOf(str[1]);
        int parent[] = new int[MAX];
        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < MAX; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < q; i++) {
            str = bf.readLine().split("\\s");
            char a = Character.valueOf(str[0].charAt(0));
            int b = Integer.valueOf(str[1]);
            if (a == 'Q') {
                printSize(b, parent, MAX);
            } else {
                int c = Integer.valueOf(str[2]);
                setParent(b, c, parent);
            }
        }
    }
}
