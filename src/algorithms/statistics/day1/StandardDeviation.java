package algorithms.statistics.day1;/**
 * Created by Ahmed Samir on 2/24/17.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double arr[] = new double[n];
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        double mean = sum / n;
        long sd = 0;
        for (int i = 0; i < n; i++) {
            sd += ((mean - arr[i]) * (mean - arr[i]));
        }
        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println(sd);
        System.out.println(df.format(Math.sqrt(sd / n)));
    }

}
