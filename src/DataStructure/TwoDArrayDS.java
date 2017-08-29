package DataStructure;/**
 * Created by Ahmed Samir on 2/2/17.
 */

import java.util.Scanner;

public class TwoDArrayDS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int max = -100;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                max = Math.max(max,
                        arr[i][j] + arr[i - 1][j]
                                + arr[i - 1][j - 1] +
                                arr[i + 1][j] + arr[i + 1][j + 1]
                                + arr[i - 1][j + 1] + arr[i + 1][j - 1]);
            }
        }
        System.out.println(max);
    }
}
