package DataStructure.DisjointSet_1;/**
 * Created by Ahmed Samir on 4/17/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class KunduAndTree {

    private static int getParent(int a, int parent[]) {
        if (parent[a] == a) {
            System.out.println(a + " --- ");
            return a;
        } else {
            System.out.println(a + " --- ");
            return parent[a] = getParent(parent[a], parent);
        }
    }

    private static void join(int a, int b, int parent[]) {
        int pa = getParent(a, parent);
        int pb = getParent(b, parent);
        if (pa == pb) return;
        else parent[pb] = pa;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n++;

        int parent[] = new int[n];
        char color[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < n - 2; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            parent[b] = a;
            char c = in.next().charAt(0);
            color[a][b] = color[b][a] = c;
        }
        System.out.println(Arrays.toString(parent));
    }

}
