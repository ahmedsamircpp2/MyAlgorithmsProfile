package DataStructure.Heap;

import java.util.*;

/**
 * Created by rambo on 2/5/17.
 */
public class FindTheRunningMedian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        PriorityQueue<Double> min = new PriorityQueue<Double>();
        PriorityQueue<Double> max = new PriorityQueue<Double>(Collections.reverseOrder());
        for (int i = 0; i < t; i++) {
            addItem(min, max, in.nextDouble());
            reBalance(min, max);
            System.out.println(calcMean(min, max));
        }
    }

    private static void reBalance(PriorityQueue<Double> min, PriorityQueue<Double> max) {
        PriorityQueue<Double> minSize = min.size() < max.size() ? min : max;
        PriorityQueue<Double> maxSize = min.size() > max.size() ? min : max;
        //System.out.println(minSize + " | " + maxSize);
        if (maxSize.size() - minSize.size() >= 2) {
            minSize.add(maxSize.poll());
        }
    }

    private static void addItem(PriorityQueue<Double> min, PriorityQueue<Double> max, double i) {
        if (min.isEmpty() || (min.peek() <= i))
            min.add(i);
        else
            max.add(i);
    }

    public static double calcMean(PriorityQueue<Double> min, PriorityQueue<Double> max) {
        double res = 0.0;
        if (min.size() == max.size()) {
            res = (min.peek() + max.peek()) / 2;
        } else {
            PriorityQueue<Double> minSize = min.size() > max.size() ? min : max;
            res = minSize.peek();
        }
        return res;
    }
}
