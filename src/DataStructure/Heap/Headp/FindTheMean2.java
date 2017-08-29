package DataStructure.Heap.Headp;/**
 * Created by Ahmed Samir on 2/8/17.
 */

import java.util.*;

public class FindTheMean2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Double> tmp = new LinkedList<>();
        for (int i = 0; i < t; i++) {
            double dbl = in.nextDouble();
            int res = Arrays.binarySearch(tmp.toArray(), dbl);
            if (Math.abs(res) - 1 >= 0)
                tmp.add(Math.abs(res) - 1, dbl);
            else
                tmp.add(dbl);
            double mean = 0.0;
            if (tmp.size() % 2 == 0) {
                int index = tmp.size() / 2;
            } else {
                int index = (tmp.size() / 2);
                mean = tmp.get(index);
            }
            System.out.println(mean);
        }
    }
}
