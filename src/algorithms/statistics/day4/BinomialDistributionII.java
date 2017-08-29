package algorithms.statistics.day4; /**
 * Created by Ahmed Samir on 3/1/17.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class BinomialDistributionII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double m = in.nextDouble();

        /**
         * FCase
         */
        // 3/20

        int total = 10;
        double reject = 3.0 / 25.0;
        DecimalFormat d = new DecimalFormat("0.000");
        double success = 0.0, failure = 0.0;
        long allSet = calculateCombinations(10, 2);
        double result = 0.0;
        for (int i = 0; i <= 2; i++) {
            allSet = calculateCombinations(total, i);
            success = Math.pow(reject, i);
            failure = Math.pow(1 - reject, total - i);

            result += (double) allSet * success * failure;
        }
        System.out.println(d.format(result));

        result = 0.0;
        for (int i = 2; i <= 10; i++) {
            allSet = calculateCombinations(total, i);
            success = Math.pow(reject, i);
            failure = Math.pow(1 - reject, total - i);

            result += (double) allSet * success * failure;
        }
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
