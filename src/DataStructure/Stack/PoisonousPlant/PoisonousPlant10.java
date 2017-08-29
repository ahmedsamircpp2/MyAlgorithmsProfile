package DataStructure.Stack.PoisonousPlant;
/**
 * Created by Ahmed Samir on 4/12/17.
 */

import java.util.Scanner;
import java.util.Stack;

public class PoisonousPlant10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), count = 0;
        Stack<Integer> s = new Stack<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int element = in.nextInt();
            //to ignore zero
            element++;
            count = 0;
            if (s.isEmpty()) s.push(element);
            else {
                if (!s.isEmpty()) {
                    int top = s.pop();
                    if (element < Math.abs(top)) {
                        s.push(top);
                        s.push(element);
                    } else if (element > Math.abs(top) && top > -1) {
                        count++;
                        s.push(top);
                        s.push(-1 * element);
                    } else if (element > Math.abs(top) && top < -1) {
                        count++;
                        Stack<Integer> tmp = new Stack<>();
                        tmp.push(top);
                        while (!s.isEmpty()) {
                            int newTop = s.pop();
                            tmp.push(newTop);
                            if (element < Math.abs(newTop) && newTop > -1) {
                                while (!tmp.isEmpty()) s.push(tmp.pop());
                                break;
                            } else if (element > Math.abs(newTop) && newTop > -1) {
                                count++;
                            } else if (element > Math.abs(newTop) && newTop < -1) {
                                count++;
                                break;
                            }
                        }
                        while (!tmp.isEmpty()) s.push(tmp.pop());
                        s.push(-1 * element);
                    }
                }
            }
            max = Math.max(max, count);
        }
        System.out.println(max);

    }

}
