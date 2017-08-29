package algorithms.Strings;/**
 * Created by Ahmed Samir on 2/1/17.
 */

import java.util.*;

public class TwoCharacters_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] val = in.next().toCharArray();
        int[] c = new int[128];
        Arrays.fill(c, -1);
        Queue<Map.Entry<Character, Integer>> q = new PriorityQueue<>(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (int i = 0; i < n; i++) {
            if (c[val[i]] == -1)
                c[val[i]] = 0;
            if ((i > 0 && val[i] == val[i - 1]))
                c[val[i]] = -5;
            if (c[val[i]] == -5)
                continue;

            c[val[i]]++;
        }
        for (int i = 0; i < 128; i++) {
            if (c[i] > -1)
                q.add(new AbstractMap.SimpleEntry((char) i, c[i]));
        }

        List<Map.Entry<Character, Integer>> ll = new ArrayList<>(q);
        int amount = 0;
        for (int i = 0; i < ll.size(); i++) {
            for (int kk = i + 1; kk < ll.size(); kk++) {
                Map.Entry<Character, Integer> e = ll.get(i), e2 = ll.get(kk);
                if (Math.abs(e.getValue() - e2.getValue()) > 1) {
                    continue;
                }
                boolean switchOff = false;
                boolean wrong = false;
                int count = 0;
                Stack<Character> st = new Stack<>();
                for (int j = 0; j < n; j++) {
                    if (val[j] == e.getKey()) {
                        if (!st.isEmpty() && st.pop() != e2.getKey()) {
                            wrong = true;
                            break;
                        } else {
                            st.push(val[j]);
                        }
                    } else if (val[j] == e2.getKey()) {
                        if (!st.isEmpty() && st.pop() != e.getKey()) {
                            wrong = true;
                            break;
                        } else {
                            st.push(val[j]);
                        }
                    }
                }
//                System.out.println(e + " " + e2);
                if (!wrong) {
                    amount = Math.max(amount, (e.getValue() + e2.getValue()));
                }
            }
        }

        System.out.println(amount);
    }
}
