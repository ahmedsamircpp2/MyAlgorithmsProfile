package algorithms.statistics.day1;/**
 * Created by Ahmed Samir on 2/23/17.
 */

import java.util.*;

public class MeanMedianMode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> ll = new ArrayList<>();
        long sum = 0;
        Map<Integer, Integer> m = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            ll.add(in.nextInt());
            sum += ll.get(i);
            if (m.get(ll.get(i)) != null) {
                m.put(ll.get(i), m.get(ll.get(i)) + 1);
            } else {
                m.put(ll.get(i), 1);
            }
        }
        System.out.println((double) sum / (double) ll.size());
        Collections.sort(ll);
        if (ll.size() % 2 == 0) {
            double v1 = ll.get(ll.size() / 2);
            double v2 = ll.get((ll.size() / 2) - 1);
            System.out.println((v1 + v2) / 2.0);
        } else {
            System.out.println(ll.get((int) Math.ceil(ll.size() / 2)));
        }
        int maxi = Integer.MIN_VALUE;
        int maxVal = 0;
        for (Integer i :
                m.keySet()) {
            if (m.get(i) > maxi) {
                maxi = m.get(i);
                maxVal = i;
            }
        }
        System.out.println(maxVal);
    }

}
