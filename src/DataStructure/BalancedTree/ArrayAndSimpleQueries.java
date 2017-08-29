package DataStructure.BalancedTree;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by rambo on 3/1/17.
 */
public class ArrayAndSimpleQueries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        LinkedList<Integer> arr = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }
        for (int i = 0; i < m; i++) {
            int s = in.nextInt();
            int e = in.nextInt();
            int w = in.nextInt();
            int diff = w - e + 1;
            if (s == 1) {
                while (diff-- > 0) {

                    arr.add(0, arr.remove(w - 1));
                }
            } else {
                while (diff-- > 0) {
                    arr.add(arr.remove(e - 1));
                }
            }
        }
        System.out.println(Math.abs(arr.get(0) - arr.get(arr.size() - 1)));
        StringBuffer st = new StringBuffer();
        for (int i = 0; i < arr.size(); i++) {
            st.append(arr.get(i)).append(" ");
        }
        System.out.println(st.toString());
    }
}

