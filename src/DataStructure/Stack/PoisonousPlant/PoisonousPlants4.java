package DataStructure.Stack.PoisonousPlant;/**
 * Created by Ahmed Samir on 2/15/17.
 */

import java.util.Scanner;
import java.util.Stack;

public class PoisonousPlants4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), count = 0;
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int die = 0;
        boolean regular = false;
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            if (i > 0) {
                if (s.peek() - val < 0) {
                    if (val - s2.peek() >= 0) {
                        if (!regular) {
                            die++;
                            regular = true;
                        }
                    } else {
                        die++;
                    }
                    s2.push(val);
                } else {
                    s2.push(val);
                    s.push(val);
                }
            } else {
                s.push(val);
                s2.push(val);
            }
            System.out.println("==>>" + s);
            System.out.println(s2);
            System.out.println(" Die Value :" + die);
        }
        System.out.println(die);
    }

}
