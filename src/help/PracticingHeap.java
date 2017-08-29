package help;

import java.util.*;

/**
 * Created by rambo on 5/6/17.
 */
public class PracticingHeap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        Queue<Map.Entry<Long, Long>> customers = new PriorityQueue<>(
                (Map.Entry<Long, Long> e1, Map.Entry<Long, Long> e2)
                        -> (e1.getKey().compareTo(e2.getKey())));
        for (int i = 0; i < cases; i++) {
            customers.add(new AbstractMap.SimpleEntry<>(scanner.nextLong(), scanner.nextLong()));
        }
        Queue<Map.Entry<Long, Long>> q = new PriorityQueue<>(
                (Map.Entry<Long, Long> e1, Map.Entry<Long, Long> e2)
                        -> (e1.getValue().compareTo(e2.getValue())));

        long waitingTime = 0;
        long timeStamp = customers.peek().getKey();
        q.add(customers.poll());

        while (!q.isEmpty()) {
            Map.Entry<Long, Long> servingNow = q.poll();
            timeStamp += servingNow.getValue();
            waitingTime += timeStamp - servingNow.getKey();

            while (!customers.isEmpty() && customers.peek().getKey() <= timeStamp) {
                q.add(customers.poll());
            }
            if (q.isEmpty()) {
                if (!customers.isEmpty())
                    q.add(customers.poll());
            }
        }
        System.out.println(waitingTime / cases);
    }
}
