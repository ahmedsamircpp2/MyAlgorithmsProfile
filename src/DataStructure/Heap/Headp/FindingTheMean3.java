package DataStructure.Heap.Headp;

import java.util.*;

/**
 * Created by rambo on 3/1/17.
 */
public class FindingTheMean3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        StringBuffer st = new StringBuffer();
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
            st.append(mean).append("\n");
        }
        System.out.println(st.toString());


    }


}
