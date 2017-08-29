package algorithms.statistics.day8;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by rambo on 3/7/17.
 */
public class LinearRegression {
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("0.000");
        Scanner in = new Scanner(System.in);
        int[][] data = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                data[i][j] = in.nextInt();
            }

        }
        int n = 5;
        double sumX = 0.0;
        for (int i = 0; i < n; i++) {
            sumX += data[i][0];
        }
        double meanX = sumX / n;

        double sumY = 0.0;

        for (int i = 0; i < n; i++) {
            sumY += data[i][1];
        }
        double meanY = sumY / n;

        double sumXS = 0.0;
        for (int i = 0; i < n; i++) {
            sumXS += (data[i][0] * data[i][0]);
        }
        double sumYS = 0.0;

        for (int i = 0; i < n; i++) {
            sumYS += (data[i][1] * data[i][1]);
        }
        double sumXY = 0.0;
        for (int i = 0; i < n; i++) {
            sumXY += (data[i][1] * data[i][0]);
        }

        double b = (n * sumXY - sumX * sumY) / (n * sumXS - Math.pow(sumX, 2));
        double a = meanY - (b * meanX);

        double res = a + (b * 80);
        System.out.println(d.format(res));
    }
}
