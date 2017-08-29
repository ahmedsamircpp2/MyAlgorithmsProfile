package DataStructure.Heap.Headp;/**
 * Created by Ahmed Samir on 2/8/17.
 */

import java.util.*;

public class FindingTheMean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PriorityQueue<Integer> p = new PriorityQueue<>();
        int t = in.nextInt();
        Map<Double, Integer> m = new TreeMap<>();
        int len = 0;
        for (int i = 0; i < t; i++) {
            List<Double> tmp = new LinkedList<>();
            double val = in.nextDouble();
            len++;
            m.put(val, m.get(val) != null ? m.get(val) + 1 : 1);
            double mean = 0.0;
            if (len % 2 == 0) {
                int index = len / 2;
                int count = 0;
                boolean oneMore = false;
                double middleVal = 0.0;
                for (Double d : m.keySet()) {
                    if (oneMore) {
                        middleVal += d;
                        break;
                    }
                    count += m.get(d);
                    if (index <= count) {
                        if (count - index == 0) {
                            middleVal += d;
                            oneMore = true;
                        } else {
                            middleVal += (2 * d);
                            break;
                        }
                    }
                }
                mean = middleVal / 2.0;
            } else {
                int index = (len / 2) + 1;
                int count = 0;
                for (Double d : m.keySet()) {
                    count += m.get(d);
                    if (index <= count) {
                        mean = d;
                        break;
                    }
                }
            }
            System.out.println(mean);
        }
    }

}
