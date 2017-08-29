package DataStructure.Heap.Headp;

import java.util.*;

/**
 * Created by rambo on 2/5/17.
 */
public class FindTheRunningMedian_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Set<Double> q2 = new TreeSet<>();

        for (int i = 0; i < t; i++) {
            q2.add(in.nextDouble());
            double mean = 0.0;
            if (q2.size() % 2 == 0) {
                int index = (q2.size() / 2) - 1;
                Iterator<Double> it = q2.iterator();
                int k = 0;
                while (it.hasNext()) {
                    if (k++ == index) {
                        double val1 = it.next();
                        double val2 = it.next();
                        mean = (val1 + val2) / 2.0;
                        break;
                    }
                    it.next();
                }
            } else {
                int index = (q2.size() / 2);
                int k = 0;
                Iterator<Double> it = q2.iterator();
                while (it.hasNext()) {
                    if (k++ == index) {
                        double val1 = it.next();
                        mean = val1;
                        break;
                    }
                    it.next();
                }
            }
            System.out.println(mean);
        }
    }
}
