package algorithms.statistics.day1;/**
 * Created by Ahmed Samir on 2/23/17.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatedMean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int w[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            w[i] = in.nextInt();
        }
        int val = 0;
        for (int i = 0; i < n; i++) {
            val += (arr[i] * w[i]);
        }
        int g = 0;
        for (int i = 0; i < n; i++) {
            g += w[i];
        }
        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println(df.format((double) val / (double) g));
    }

}
