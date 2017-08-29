package algorithms.Implementations;

import java.util.Scanner;

/**
 * Created by Ahmed Samir on 1/20/17.
 */
public class AppleAndOrange {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int oCount = 0, aCount = 0;
        for (int apple_i = 0; apple_i < m; apple_i++) {
            int p = a + in.nextInt();
            aCount += (p >= s && p <= t) ? 1 : 0;
        }
        for (int orange_i = 0; orange_i < n; orange_i++) {
            int o = b + in.nextInt();
            oCount += (o >= s && o <= t) ? 1 : 0;
        }
        System.out.println(aCount);
        System.out.println(oCount);
    }
}
