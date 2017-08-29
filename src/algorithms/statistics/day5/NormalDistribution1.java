package algorithms.statistics.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Created by rambo on 3/5/17.
 */
public class NormalDistribution1 {
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("0.000");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] split = bf.readLine().split(" ");
            double mean = Double.valueOf(split[0]);
            double sD = Double.valueOf(split[1]);
            double fQ = Double.valueOf(bf.readLine());
            String[] sQ = bf.readLine().split(" ");
            int lB = Integer.valueOf(sQ[0]);
            int uB = Integer.valueOf(sQ[1]);
            double res = 0.0;
            for (double i = 1; i <= fQ; i += 1.0) {

                double fF = 1.0 / (sD * Math.sqrt(2.0 * Math.PI));
                res += fF * (Math.pow(Math.E, (-1.0 * (Math.pow(i - mean, 2.0)) / (2.0 * (sD * sD)))));

            }
            System.out.println(d.format(res));

            res = 0.0;
            for (double i = lB; i <= uB; i += 1.0) {

                double fF = 1.0 / (sD * Math.sqrt(2.0 * Math.PI));
                res += fF * (Math.pow(Math.E, (-1 * (Math.pow(i - mean, 2)) / (2 * (sD * sD)))));

            }
            System.out.println(d.format(res));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
