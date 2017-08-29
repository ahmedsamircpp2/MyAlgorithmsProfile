package DataStructure.Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by rambo on 2/5/17.
 */
public class MaximumElement {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Long> s = new Stack<>();
        Stack<Long> mStack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int f = in.nextInt();
            if (f == 1) {
                long val = in.nextLong();
                s.push(val);
                if (mStack.isEmpty())
                    mStack.push(val);
                else {
                    long v = mStack.pop();
                    long max = Math.max(v, val);
                    mStack.push(v);
                    mStack.push(max);
                }
            } else if (f == 2) {
                if (!mStack.isEmpty())
                    mStack.pop();
                if (!s.isEmpty())
                    s.pop();
            } else {
                System.out.println(mStack.peek());
            }
        }
    }
}
