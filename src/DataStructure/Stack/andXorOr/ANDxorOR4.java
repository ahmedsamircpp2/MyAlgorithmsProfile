package DataStructure.Stack.andXorOr;
/**
 * Created by Ahmed Samir on 4/12/17.
 */

import java.util.Scanner;
import java.util.Stack;

public class ANDxorOR4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Long> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(in.nextLong());
        }
        long finalMax = Long.MIN_VALUE;
        Stack<Long> tmp = new Stack<>();
        long m1 = stack.pop();
        long m2 = m1;
        while (!stack.isEmpty() || !tmp.isEmpty()) {
            if (stack.peek() > m1) {
                m1 = stack.pop();
                tmp.push(m1);
                finalMax = Math.max(finalMax, calc(m1, m2));
            } else if (stack.peek() < m2) {
                m2 = stack.pop();
                tmp.push(m2);
                finalMax = Math.max(finalMax, calc(m1, m2));
            } else {
                tmp.push(stack.pop());
            }
            if (stack.isEmpty() && !tmp.isEmpty()) {
                stack = tmp;
                tmp = new Stack<>();
                m1 = stack.pop();
                m2 = m1;
            }
            System.out.println(m1 + " " + m2 + " =>" + finalMax);
        }
        System.out.println(finalMax);
    }

    private static long calc(long m1, long m2) {
        return (((m1 & m2) ^ (m1 | m2)) & (m1 ^ m2));
    }
}

/**
 * 5
 * 9 6 3 5 2
 */