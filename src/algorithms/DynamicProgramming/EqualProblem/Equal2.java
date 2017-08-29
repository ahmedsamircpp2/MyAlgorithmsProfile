package algorithms.DynamicProgramming.EqualProblem;/**
 * Created by rambo on 4/19/17.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Equal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int d[] = {5, 2, 1};
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }

            int steps = 0;
            while (true) {
                int index = 0, max = 0x80000000, min = 0x7fffffff;
                HashSet<Integer> checkIFOne = new HashSet<>();
                for (int j = 0; j < n; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                        index = j;
                    }
                    if (arr[j] < min) {
                        min = arr[j];
                    }
                    checkIFOne.add(arr[j]);
                }
                if (checkIFOne.size() == 1) break;
                int val = max - min;
                int addition = 0;
                for (int k = 0; k < d.length; k++) {
                    int div = val / d[k];
                    if (div >= 1) {
                        steps += div;
                        addition += div * d[k];
                        val = val % d[k];
                    }
                }
                System.out.println(Arrays.toString(arr) + " ==> " + addition);
                for (int j = 0; j < n; j++) {
                    if (j != index) {
                        arr[j] += addition;
                    }
                }
            }
            System.out.println(steps);
        }
    }
}