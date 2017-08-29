package DataStructure.Heap.Headp;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by rambo on 2/5/17.
 */
public class FindTheRunningMedian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Queue<Double> q = new PriorityQueue<>();
        Queue<Double> tmp = new PriorityQueue<>();

        for (int i = 0; i < t; i++) {
            q.add(in.nextDouble());
            if (q.size() % 2 != 0) {
                int val = (int) Math.ceil((double) q.size() / (double) 2);
                int k = 1;
                while (!q.isEmpty()) {
                    double vevo = q.poll();
                    tmp.add(vevo);
                    if (k++ == val) {
                        System.out.printf("%f", vevo);
                        System.out.println();
                    }
                }
                while (!tmp.isEmpty()) {
                    q.add(tmp.poll());
                }
            } else {
                int val = (int) Math.ceil(q.size() / 2) - 1;
                int k = 0;
                while (!q.isEmpty()) {
                    double vevo = q.poll();
                    tmp.add(vevo);
                    if (k++ == val) {
                        double vevo2 = q.poll();
                        tmp.add(vevo2);
                        double res = (vevo + vevo2) / (double) 2;
                        System.out.printf("%f", res);
                        System.out.println();
                    }
                }
                while (!tmp.isEmpty()) {
                    q.add(tmp.poll());
                }
            }

        }

    }
}
