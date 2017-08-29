package DataStructure.Queue;/**
 * Created by Ahmed Samir on 4/11/17.
 */

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Stack<Integer> oldElement = new Stack<>();
        Stack<Integer> newElement = new Stack<>();
        for (int i = 0; i < t; i++) {
            int co = in.nextInt();
            if (co == 1) {
                newElement.push(in.nextInt());
            } else if (co == 2) {
                if (oldElement.isEmpty()) {
                    while (!newElement.isEmpty())
                        oldElement.push(newElement.pop());
                }
                oldElement.pop();
            } else {
                if (oldElement.isEmpty()) {
                    while (!newElement.isEmpty())
                        oldElement.push(newElement.pop());
                }
                System.out.println(oldElement.peek());
            }
        }
    }

}
