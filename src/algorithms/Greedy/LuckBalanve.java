package algorithms.Greedy;/**
 * Created by rambo on 3/8/17.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LuckBalanve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        List<Integer> ll = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int l = in.nextInt();
            int t = in.nextInt();
            if (t == 1)
                ll.add(l);
            else {
                sum += l;
            }
        }
        Collections.sort(ll);
        int winSUm = ll.size() - k;
        if (winSUm < 0) {
            for (int i = 0; i < ll.size(); i++) {
                sum += ll.get(i);
            }
//            for (int i = 0; i < winSUm; i++) {
//                sum -= ll.get(i);
//            }
        } else {
            for (int i = winSUm; i < ll.size(); i++) {
                sum += ll.get(i);
            }
            for (int i = 0; i < winSUm; i++) {
                sum -= ll.get(i);
            }
        }
        System.out.println(sum);
    }
}
