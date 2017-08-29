package DataStructure.Heap;
/**
 * Created by Ahmed Samir on 4/11/17.
 */

import java.util.*;

public class AverageWaitingTime {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Queue<Customer> c = new PriorityQueue<>(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.st.compareTo(o2.st);
            }
        });
        Queue<Customer> c2 = new PriorityQueue<>(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.period.compareTo(o2.period);
            }
        });
        for (int i = 0; i < n; i++) {
            c.add(new Customer(in.nextLong(), in.nextLong()));
        }

        long serviceTime = -1;
        long waitingTime = 0;
        while (!c.isEmpty() || !c2.isEmpty()) {
            Customer current = null;
            if (c2.isEmpty()) current = c.poll();
            else current = c2.poll();

            if (serviceTime < 0) serviceTime = current.st;
            serviceTime += current.period;
            waitingTime += (serviceTime - current.st);
            while (!c.isEmpty() && c.peek().st <= serviceTime) {
                c2.add(c.poll());
            }
        }
        System.out.println(waitingTime / n);
    }

    static class Customer {
        Long st, period;

        public Customer(Long st, Long period) {
            this.st = st;
            this.period = period;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "st=" + st +
                    ", period=" + period +
                    '}';
        }
    }
}