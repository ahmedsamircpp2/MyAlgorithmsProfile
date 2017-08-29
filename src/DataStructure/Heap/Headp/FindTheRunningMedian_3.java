package DataStructure.Heap.Headp;

import java.util.*;

/**
 * Created by rambo on 2/5/17.
 */
public class FindTheRunningMedian_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Queue<Double> q = new PriorityQueue<>();
        Queue<Double> copy = new PriorityQueue<>();
        for (int i = 0; i < t; i++) {
            q.add(in.nextDouble());
            int index = 0;
            boolean even = false;

            if (q.size() % 2 == 0) {
                even = true;
                index = (q.size() / 2);
            } else {
                index = (q.size() / 2) + 1;
            }
            // Process
            int k = 0;
            double mean = 0.0;
            while (!q.isEmpty()) {
                if (++k == index) {

                    if (even) {
                        double val1 = q.peek();
                        copy.add(q.poll());
                        double val2 = q.peek();
                        copy.add(q.poll());
                        mean = (val1 + val2) / 2.0;
                    } else {
                        double val1 = q.peek();
                        copy.add(q.poll());
                        mean = val1;
                    }
                    break;
                }
                copy.add(q.poll());
            }
            while (!copy.isEmpty())
                q.add(copy.poll());

            System.out.println(mean);
        }
    }
}
