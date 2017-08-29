package algorithms.statistics.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Created by rambo on 3/3/17.
 */
public class PoissonDistributionI {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            double y = Double.valueOf(bf.readLine().split(" ")[0]);
            int k = Integer.valueOf(bf.readLine().split(" ")[0]);
            double a = Math.pow(y, k) * Math.exp(-y) / factorial(k);
            DecimalFormat d = new DecimalFormat("0.000");
            System.out.println(d.format(a));
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
