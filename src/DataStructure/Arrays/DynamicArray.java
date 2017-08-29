package DataStructure.Arrays; /**
 * Created by Ahmed Samir on 3/1/17.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        List<ArrayList<Integer>> seq = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            seq.add(new ArrayList<>());
        }
        int lastAns = 0;
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int t = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            if (t == 1) {
                seq.get((x ^ lastAns) % n).add(y);
            } else {
                List<Integer> ll = seq.get((x ^ lastAns) % n);
                lastAns = ll.get(y % ll.size());
                st.append(lastAns);
                st.append("\n");
            }

        }
        System.out.println(st.toString());
    }

}
