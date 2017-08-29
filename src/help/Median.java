package help;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by rambo on 5/6/17.
 */
public class Median {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Queue<Integer> min = new PriorityQueue<>();
        Queue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < t; i++) {
            int val = in.nextInt();
            if (max.isEmpty())
                max.add(val);
            else if (min.isEmpty())
                min.add(val);
            else {
                if (val >= min.peek())
                    min.add(val);
                else
                    max.add(val);
            }
            if (!min.isEmpty() && !max.isEmpty() && min.peek() < max.peek()) {
                int temp = max.poll();
                max.add(min.poll());
                min.add(temp);

            }
            if (Math.abs(min.size() - max.size()) >= 2) {
                if (min.size() > max.size())
                    max.add(min.poll());
                else
                    min.add(max.poll());
            }
            System.out.println(max);
            System.out.println(min);
            calcMedian(min, max);
        }
    }

    private static void calcMedian(Queue<Integer> min, Queue<Integer> max) {
        if (min.size() == max.size()) {
            System.out.println((double) (min.peek() + max.peek()) / 2);
        } else {
            if (max.size() > min.size()) {
                System.out.println(max.peek());
            } else {
                System.out.println(min.peek());
            }
        }
    }
}
