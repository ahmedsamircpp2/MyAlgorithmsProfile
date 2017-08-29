package algorithms.statistics.day4; /**
 * Created by Ahmed Samir on 3/1/17.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class GeometricDistribution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int deno = in.nextInt();
        int n = in.nextInt();
        double res = 0.0;
        double val = (double) num / (double) deno;
        for (int i = 1; i <= n; i++) {
            res += val * Math.pow(1 - val, i - 1);
        }
        DecimalFormat d = new DecimalFormat("0.000");
        System.out.println(d.format(res));
    }
}