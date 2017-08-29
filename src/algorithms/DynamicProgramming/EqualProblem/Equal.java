package algorithms.DynamicProgramming.EqualProblem;/**
 * Created by Ahmed Samir on 4/19/17.
 */

import java.util.HashSet;
import java.util.Scanner;

public class Equal {
    static int[] method = {1, 2, 5};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int s = in.nextInt();
            int arr[] = new int[s], copy[] = new int[s];
            HashSet<Integer> vis = new HashSet<>();
            for (int j = 0; j < s; j++) {
                arr[j] = in.nextInt();
                copy[j] = arr[j];
                vis.add(arr[j]);
            }
            int minLen = vis.size();
            int mat[][] = new int[s][s];
            int ll = 0;
            for (int j = 0; j < s; j++) {
                for (int k = 0; k < s; k++) {
                    mat[j][k] = 1;
                }
                mat[j][ll++] = 0;
            }
            int transition = 0;
            boolean exit = false;
            while (true) {
                exit = false;
                for (int j = 0; j < method.length; j++) {
                    vis = new HashSet<>();
                    int chosen = -1;
                    for (int k = 0; k < s; k++) {
                        HashSet<Integer> tmp = new HashSet<>();
                        for (int l = 0; l < s; l++) {
                            if (mat[k][l] > 0) {
                                tmp.add(copy[k] + method[j]);
                            }
                        }
                        System.out.println(tmp);
                        if (minLen > tmp.size()) {
                            chosen = k;
                            minLen = tmp.size();
                        }
                    }
                    if (chosen > 0) {
                        System.out.println("here");
                        transition++;
                        for (int l = 0; l < s; l++) {
                            if (mat[chosen][l] > 0) {
                                copy[l] += method[j];
                                vis.add(copy[l]);
                            }
                        }
                        if (vis.size() == 1) {
                            exit = true;
                            break;
                        }
                    }
                }
                if (exit) break;

            }
            System.out.println(transition);
        }
    }
}