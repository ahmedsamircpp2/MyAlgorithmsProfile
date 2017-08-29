package algorithms.Implementations;/**
 * Created by Ahmed Samir on 1/27/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class SpaceStation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int dis[] = new int[n];
        Arrays.fill(dis, Integer.MAX_VALUE);
        int max = -1;
        for (int i = 0; i < m; i++) {
            int s = in.nextInt();
            for (int j = 0; j < n; j++)
                dis[j] = Math.min(Math.abs(j - s), dis[j]);
        }
        for (int i = 0; i < n; i++)
            max = Math.max(max, dis[i]);
        System.out.println(max);
    }
}
