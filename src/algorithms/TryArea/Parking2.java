package algorithms.TryArea;
/**
 * Created by Ahmed Samir on 2/6/17.
 */

import java.util.*;

public class Parking2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Map<String, List<String>> m = new LinkedHashMap<>();
        for (int i = 0; i < t; i++) {  //n
            String name = in.next(), p1 = in.next(), p2 = in.next();
            String fs = p2 + '|' + p1, ns = p1 + '|' + p2;
            if (!m.containsKey(fs)) {
                m.put(ns, new LinkedList<>());
                m.get(ns).add(name);
            } else
                System.out.println(m.get(fs).remove(0) + " replace " + name);
        }
    }
}
