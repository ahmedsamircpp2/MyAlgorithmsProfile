package algorithms.Implementations;/**
 * Created by Ahmed Samir on 1/26/17.
 */

import java.util.*;

public class EqualizeArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), value = -1;
        int vis[] = new int[101];
        for (int i = 0, val = in.nextInt(); i < n; i++, val = in.nextInt()) {
            vis[val] += 1;
            if (vis[val] > value) {
                value = vis[val];
            }
        }
        System.out.println(n - value);
    }

}
