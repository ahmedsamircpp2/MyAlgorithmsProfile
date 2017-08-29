package algorithms.search;/**
 * Created by Ahmed Samir on 4/13/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class IceCreameparlor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for (int k = 0; k < test; k++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int arr[] = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = in.nextInt();
            }

            int num[] = new int[2];
            int rem = n;
            boolean done = false;
            for (int i = 0; i < m; i++) {
                rem = n;
                if (rem - arr[i] > 0)
                    rem -= arr[i];
                else {
                    continue;
                }
                num[0] = i + 1;
                for (int j = i + 1; j < m; j++) {
                    if (rem - arr[j] == 0) {
                        num[1] = j + 1;
                        done = true;
                        break;
                    }
                }
                if (done)
                    break;
            }
            Arrays.sort(num);
            System.out.println(num[0] + " " + num[1]);
        }
    }

}
