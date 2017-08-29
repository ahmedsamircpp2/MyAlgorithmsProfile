package DataStructure.Stack.andXorOr;/**
 * Created by Ahmed Samir on 5/23/17.
 */

import java.util.*;

public class AndXorOr3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        int m1 = in.nextInt();
        for (int i = 1; i < n; i++) {
            int m2 = in.nextInt();
            int val = (((m1 & m2) ^ (m1 | m2)) & (m1 ^ m2));
            if (val > stack.peek())
                stack.push(val);
            m1 = m2;
        }
        System.out.println(stack.peek());
    }
}

