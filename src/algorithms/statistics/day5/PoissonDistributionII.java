package algorithms.statistics.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Created by rambo on 3/3/17.
 */
public class PoissonDistributionII {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] split = bf.readLine().split(" ");
            double y = Double.valueOf(split[0]);
            double k = Double.valueOf(split[1]);
            double cA = 160 + (40 * (y + Math.pow(y, 2)));
            double cK = 128 + (40 * (k + Math.pow(k, 2)));

            DecimalFormat d = new DecimalFormat("0.000");
            System.out.println(d.format(cA));
            System.out.println(cK);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long factorial(int n) {
        long nFact = 1;
        for (int i = 1; i <= n; i++) {
            nFact *= i;
        }
        return nFact;
    }
}
