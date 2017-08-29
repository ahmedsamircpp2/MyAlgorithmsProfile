package DataStructure.Stack;/**
 * Created by Ahmed Samir on 2/14/17.
 */

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Waiter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        Queue<Integer> prim = new ArrayDeque<>();
        prim.add(2);
        int k = 1;
        for (int i = 3; prim.size() < q; i++) {
            if (i % 2 == 0) continue;
            boolean isPrim = true;
            for (int j = 3; j < i; j += 2) {
                if (i % j == 0) {
                    isPrim = false;
                    break;
                }
            }
            if (isPrim)
                prim.add(i);
        }

        Stack<Integer> a = new Stack<>();
        for (int i = 0; i < n; i++) {
            a.push(in.nextInt());
        }

        Stack[] l = new Stack[q];
        for (int i = 0; i < q; i++) {
            Stack<Integer> ac = new Stack<>();
            l[i] = new Stack();
            int primeNum = prim.poll();
            while (!a.isEmpty()) {
                int val = a.pop();
                if (val % primeNum == 0) l[i].push(val);
                else {
                    ac.push(val);
                }
            }
            a = ac;
        }
        for (int i = 0; i < q; i++) {
            while (!l[i].isEmpty()) System.out.println(l[i].pop());
        }
        while (!a.isEmpty()) System.out.println(a.pop());


    }

}
