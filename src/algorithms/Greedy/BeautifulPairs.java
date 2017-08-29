package algorithms.Greedy;
/**
 * Created by rambo on 3/8/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class BeautifulPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a[] = new int[t];
        int b[] = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < t; i++) {
            b[i] = in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < t; i++) {
            if (a[i] != b[i]) {
                System.out.println(Math.max(b[i], a[i]));
                break;
            }
        }
    }
}