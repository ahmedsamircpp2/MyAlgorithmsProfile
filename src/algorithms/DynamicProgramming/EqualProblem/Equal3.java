package algorithms.DynamicProgramming.EqualProblem;/**
 * Created by rambo on 4/19/17.
 */


import java.util.Scanner;

public class Equal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int d[] = {5, 2, 1};
        for (int i = 0; i < t; i++) {
            int steps = 0;
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }

            for (int j = 0; j < d.length; j++) {
                for (int k = 0; k < n; k++) {

                }
            }
            System.out.println(steps);
        }
    }
}
