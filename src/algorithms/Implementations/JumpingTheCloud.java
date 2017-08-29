package algorithms.Implementations;/**
 * Created by Ahmed Samir on 1/26/17.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JumpingTheCloud {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        int prevOrd = 0, prevNum = -1, count = 0;
        List<Integer> ll = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (c[i] == 0) {
                ll.add(i - prevOrd);
                prevOrd = i;
            }
        }
        for (int i = 1; i < ll.size(); i++) {
            if (ll.get(i) == ll.get(i - 1) && ll.get(i) == 1)
                ll.set(i, -1);
        }
        for (int i = 0; i < ll.size(); i++) {
            count += ll.get(i) > -1 ? 1 : 0;
        }
        System.out.println(count);
    }
}