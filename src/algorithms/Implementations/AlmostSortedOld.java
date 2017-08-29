package algorithms.Implementations;/**
 * Created by Ahmed Samir on 1/25/17.
 */

import java.util.Scanner;

public class AlmostSortedOld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int count = 0;
        int beginIndex = -1;
        int endIndex = -1;
        boolean vis[][] = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (i > 0) {
                for (int j = 0; j <= i && j != i; j++) {
//                        System.out.println(arr[i] +"  "+ arr[j]);
                    if (arr[i] < arr[j] && !vis[i][j]) {
                        vis[i][j] = true;
                        if (beginIndex == -1)
                            beginIndex = i - 1;
                        endIndex = i;
                        count++;
                    }
                }
            }
        }
//        System.out.println(count +" index "+ beginIndex +"   "+ endIndex);
        if (count == 1) {
            System.out.println("yes");
            System.out.println("swap " + ++beginIndex + " " + ++endIndex);
        } else if (count > 1 && count == 2 * (endIndex - beginIndex)) {
            System.out.println("yes");
            System.out.println("reverse " + ++beginIndex + " " + ++endIndex);
        } else {
            // System.out.println(count);
            System.out.println("no");
        }

    }

}
