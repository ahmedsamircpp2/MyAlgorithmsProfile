package DataStructure.Stack;

import java.util.*;

/**
 * Created by rambo on 2/5/17.
 */
public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Stack<Map.Entry<Integer, StringBuffer>> s = new Stack<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < t; i++) {
            int o = in.nextInt();
            if (o == 1) {
                s.push(new AbstractMap.SimpleEntry<Integer, StringBuffer>(1, new StringBuffer(sb)));
                sb.append(in.next());
            } else if (o == 2) {
                s.push(new AbstractMap.SimpleEntry<Integer, StringBuffer>(2, new StringBuffer(sb)));
                int v = in.nextInt();
                sb.setLength(sb.length() - v);
            } else if (o == 3) {
                int index = in.nextInt();
                System.out.println(sb.charAt(index - 1));
            } else {
                Map.Entry<Integer, StringBuffer> eee = s.pop();
                sb = eee.getValue();
            }
        }
    }
}
