package CrackingTheCode;/**
 * Created by Ahmed Samir on 4/14/17.
 */

import java.util.HashSet;
import java.util.Scanner;

public class DFSConnectedCellInAGrid {
    static int r = 0;
    static int c = 0;
    static int dI[] = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int dJ[] = {-1, 0, 1, -1, 1, -1, 0, 1};
    static int matrix[][];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        c = in.nextInt();
        matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        HashSet<Cell> vis = new HashSet<>();
        int max = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 1 && !vis.contains(new Cell(i, j))) {
                    vis.add(new Cell(i, j));
                    max = Math.max(dfs(i, j, vis) + 1, max);
                }
            }
        }
        System.out.println(max);
    }

    private static int dfs(int i, int j, HashSet<Cell> vis) {
        int val = 0;
        for (int k = 0; k < 8; k++) {
            int nI = i + dI[k];
            int nJ = j + dJ[k];
            if (nI >= r || nI < 0 || nJ >= c || nJ < 0) continue;
            Cell o = new Cell(nI, nJ);
            if (!vis.contains(o)) {
                vis.add(o);
                if (matrix[nI][nJ] == 1) {
                    val += dfs(nI, nJ, vis) + 1;
                }
            }
        }
        return val;
    }

    static class Cell {
        int i, j;

        public Cell(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Cell cell = (Cell) o;

            if (i != cell.i) return false;
            return j == cell.j;

        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }

        @Override
        public String toString() {
            return "Cell{" +
                    "i=" + i +
                    ", j=" + j +
                    '}';
        }
    }
}