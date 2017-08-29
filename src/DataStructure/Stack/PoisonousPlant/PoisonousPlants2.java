package DataStructure.Stack.PoisonousPlant;/**
 * Created by Ahmed Samir on 2/15/17.
 */

import java.util.*;

public class PoisonousPlants2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            ll.add(in.nextInt());
        }
        int count = 0;
        while (true) {
            int i = 1;
            List<Integer> delete = new ArrayList<>();
            while (!ll.isEmpty() && ll.size() > 1 && i < ll.size()) {
                if (Math.abs(ll.get(i)) - Math.abs(ll.get(i - 1)) > 0) {
                    ll.set(i, -1 * ll.get(i));
                    delete.add(i);
                }
                i++;
            }
            if (delete.size() > 0) {
                for (int j = 0; j < ll.size(); j++) {
                    if (ll.get(j) < 0) ll.remove(j--);
                }
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);


    }

}
