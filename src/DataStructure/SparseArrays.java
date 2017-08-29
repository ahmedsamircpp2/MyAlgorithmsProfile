package DataStructure;/**
 * Created by Ahmed Samir on 2/4/17.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String val = in.next();
            m.put(val, m.get(val) != null ? m.get(val) + 1 : 1);
        }
        int k = in.nextInt();
        for (int i = 0; i < k; i++) {
            Integer val = m.get(in.next());
            System.out.println(val != null ? val : 0);
        }


    }

}
