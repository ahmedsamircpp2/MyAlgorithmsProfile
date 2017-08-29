package DataStructure.Queue;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by rambo on 2/5/17.
 */
public class QueueUsingTwoStacks {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Stack<Integer> o = new Stack<>();
        Stack<Integer> tmp = new Stack<>();
        for (int i = 0; i < t; i++) {
            int co = in.nextInt();
            if (co == 1) {
                if (o.isEmpty())
                    o.push(in.nextInt());
                else {
//                    o.add(0,in.nextInt());
                    tmp = new Stack<>();
                    while (!o.isEmpty()) {
                        tmp.add(o.pop());
                    }
                    tmp.add(in.nextInt());
                    while (!tmp.isEmpty()) {
                        o.add(tmp.pop());
                    }
                }
            } else if (co == 2) {
                o.pop();

            } else {
                System.out.println(o.peek());
            }
        }
    }
}
