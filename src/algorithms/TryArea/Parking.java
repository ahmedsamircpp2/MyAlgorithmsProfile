package algorithms.TryArea;
/**
 * Created by Ahmed Samir on 2/6/17.
 */

import java.util.*;

public class Parking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Map<row, List<String>> m = new LinkedHashMap<>();

        for (int i = 0; i < t; i++) {
            String name = in.next();
            String s = in.next();
            String e = in.next();
            row r = new row(s, e);
            if (m.get(r) != null) {
                m.get(r).add(name);
            } else {
                m.put(r, new LinkedList<>());
                m.get(r).add(name);
            }
        }
        int counter = 0;
        for (row r : m.keySet()) {
            for (String str : m.get(r)) {
                row o = new row(r.e, r.s);
                if (m.containsKey(o)) {
                    List<String> val = m.get(o);
                    if (!val.isEmpty()) {
                        System.out.println(str + " can replace with " + val.remove(0));
                    } else {
                        counter++;
                    }
                } else {
                    counter++;
                }
            }
        }


    }

    static class row {
        public String s;
        public String e;

        public row(String s, String e) {
            this.s = s;
            this.e = e;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            row row = (row) o;

            if (!s.equals(row.s)) return false;
            return e.equals(row.e);

        }

        @Override
        public int hashCode() {
            int result = s.hashCode();
            result = 31 * result + e.hashCode();
            return result;
        }
    }

}
