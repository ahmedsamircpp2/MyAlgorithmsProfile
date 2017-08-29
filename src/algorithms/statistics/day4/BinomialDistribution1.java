package algorithms.statistics.day4; /**
 * Created by Ahmed Samir on 3/1/17.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class BinomialDistribution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double m = in.nextDouble();
        /**
         *     ( nCr) ( success)r ( 1-success)n-r
         */
        int totalBoys = 6;
        double result = 0.0;
        for (int i = 0; i <= 3; i++) {
            long allSet = calculateCombinations(totalBoys, i);
            double selectBoy = m / (m + n);
            double success = Math.pow(selectBoy, i);
            double failure = Math.pow(1 - selectBoy, totalBoys - i);

            result += (double) allSet * success * failure;
        }
        DecimalFormat d = new DecimalFormat("0.000");
        System.out.println(d.format(result));

    }

    public static long calculateCombinations(int n, int r) {
        long nFact = 1;
        long nFactDashR = 1;
        long rFact = 1;
        for (int i = 1; i <= n; i++) {
            nFact *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            nFactDashR *= i;
        }
        for (int i = 1; i <= r; i++) {
            rFact *= i;
        }
        return (nFact) / (rFact * nFactDashR);
    }

}
