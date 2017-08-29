package DataStructure.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by rambo on 2/5/17.
 */
public class CastleOnTheGrid_T0 {
    public static void main(String[] args) {

        int[] DI = {1, 0, -1, 0};
        int[] DJ = {0, 1, 0, -1};
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char mat[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            mat[i] = in.next().toCharArray();
        }
        int sI = in.nextInt();
        int sJ = in.nextInt();
        int dI = in.nextInt();
        int dJ = in.nextInt();

        boolean vis[][] = new boolean[n][n];
        Queue<Node> q = new ArrayDeque<>();
        q.add(new Node(sI, sJ, 1));
        int min = Integer.MAX_VALUE;
        while (!q.isEmpty()) {
            Node nono = q.poll();
            if (nono.i == dI && nono.j == dJ) {
                min = Math.min(min, nono.steps);
                continue;
            }

            if (!vis[nono.i][nono.j]) {
                vis[nono.i][nono.j] = true;
                for (int i = 0; i < 4; i++) {
                    int nextI = nono.i + DI[i];
                    int nextJ = nono.j + DJ[i];

                    if (nextI >= n || nextI < 0 || nextJ >= n || nextJ < 0)
                        continue;
                    if (mat[nextI][nextJ] == 'X') continue;

                    if (!vis[nextI][nextJ]) {
                        int steto = 0;
                        if (nono.oldPoint != null) {
                            Node old = nono.oldPoint;
                            int diffI_Old = nono.i - old.i;
                            int diffJ_old = nono.j - old.j;
                            int diffI_ = nextI - nono.i;
                            int diffJ_ = nextJ - nono.j;

                            if (diffI_ == diffI_Old && diffJ_ == diffJ_old) steto = 0;
                            else {
                                if (nextI != nono.i)
                                    steto = 1;
                                else
                                    steto = 0;
                            }

//                            System.out.println("Old :  ("+nono.oldPoint.toString()+")" +" ("+ nono.toString()  +")  | I " +  nextI +"| J "+nextJ  +" ==> "+steto);
                        }
                        Node e = new Node(nextI, nextJ, nono.steps + steto);
                        e.oldPoint = nono;
                        q.add(e);

                    }
                }
            }
        }
        System.out.println(min);
    }

    static class Node {
        public int i;
        public int j;
        public int steps;
        public Node oldPoint;
        public boolean isTurn;


        public Node(int i, int j, int steps) {
            this.i = i;
            this.j = j;
            this.steps = steps;
            oldPoint = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "i=" + i +
                    ", j=" + j +
                    '}';
        }
    }
}
