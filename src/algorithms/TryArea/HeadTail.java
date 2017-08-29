package algorithms.TryArea;/**
 * Created by Ahmed Samir on 2/9/17.
 */

import java.util.*;

public class HeadTail {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Boolean> hash = new HashMap<>();
        hash.put("TAIL", true);
        hash.put("HEAL", true);
        hash.put("HALE", true);

        String start = in.next();
        String end = in.next();
        Queue<Map.Entry<String, Cell>> q = new ArrayDeque();
        q.add(new AbstractMap.SimpleEntry<String, Cell>(start, new Cell(start.length() - 1)));
        boolean vis[] = new boolean[4];
        HashMap<String, Boolean> bb = new HashMap<>();
        while (!q.isEmpty()) {
            Map.Entry<String, Cell> me = q.poll();
            if (me.getKey().equals(end)) {
                System.out.println("FOUNd");
                while (!me.getValue().parent.isEmpty()) {
                    System.out.print(me.getValue().parent.pop() + " => ");
                }
                System.out.println();
                break;
            }
            if (hash.get(me.getKey()) != null && (bb.get(me.getKey()) == null || !bb.get(me.getKey()))) {
                System.out.println(me.getKey());
            }
            if (me.getValue().val < 0) {
                continue;
            }
            if (bb.get(me.getKey()) == null || !bb.get(me.getKey())) {
//                bb.put(me.getKey(),Boolean.TRUE);
                for (int i = 'A'; i <= 'Z'; i++) {
                    char[] s = me.getKey().toCharArray();
                    s[me.getValue().val] = (char) i;
                    Cell c = new Cell(me.getValue().val - 1);
                    c.parent.addAll(me.getValue().parent);
                    c.parent.push(me.getKey());
                    q.add(new AbstractMap.SimpleEntry<String, Cell>(String.valueOf(s), c));
                }
            }
        }
    }

    static class Cell {
        int val;
        Stack<String> parent;

        public Cell(int val) {
            this.val = val;
            parent = new Stack<>();
        }
    }
}
