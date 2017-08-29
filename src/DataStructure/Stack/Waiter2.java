package DataStructure.Stack;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by rambo on 2/14/17.
 */
public class Waiter2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        Stack<Integer> a[] = new Stack[q + 1];
        Stack<Integer> b = new Stack<>();
        a[0] = new Stack<>();
        for (int i = 0; i < n; i++) {
            a[0].push(in.nextInt());
        }
        /**
         * Getting primes
         */
        Queue<Integer> prim = new ArrayDeque<>();

        prim.add(2);
        for (int i = 3; prim.size() < q; i++) {
            boolean isPrime = true;
            if (i % 2 == 0) continue;
            for (int j = 3; j < i; j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                prim.add(i);
            }
        }


        for (int i = 0; i < q; i++) {
            int pr = prim.poll();
            a[i + 1] = new Stack<>();
            while (!a[i].isEmpty()) {
                int val = a[i].pop();
                if (val % pr == 0)
                    b.push(val);
                else {
                    a[i + 1].push(val);
                }
            }
        }
        while (!a[q].isEmpty()) {
            System.out.println(a[q].pop());
        }
        while (!b.isEmpty()) {
            System.out.println(b.pop());
        }
    }
}
