package algorithms.Graph;
/**
 * Created by Ahmed Samir on 4/27/17.
 */

import java.util.*;

public class FloydTheCityofBlindingLights {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() + 1, r = in.nextInt();
        int g[][] = new int[n][n];
        int INF = (int) 1e5; // 1e9
        for (int i = 0; i < n; i++) {
            Arrays.fill(g[i], INF);
            g[i][i] = 0;
        }
        for (int i = 0; i < r; i++) {
            int row = in.nextInt(), col = in.nextInt(), w = in.nextInt();
            g[row][col] = w;
        }
        for (int k = 1; k < n; k++) {
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    if (g[i][k] != INF && g[k][j] != INF)
                        if (g[i][j] > (g[i][k] + g[k][j])) {
                            g[i][j] = g[i][k] + g[k][j];
                        }
                }
            }
        }
        int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {
            int val = g[in.nextInt()][in.nextInt()];
            if (val < INF)
                System.out.println(val);
            else
                System.out.println(-1);
        }
    }
}