package DataStructure.Stack.PoisonousPlant;/**
 * Created by Ahmed Samir on 2/15/17.
 */

import java.util.*;

public class PoisonousPlants3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), count = 0;
        Stack<Integer> s[] = new Stack[n + 1];
        Stack<Integer> s2 = new Stack<>();
        boolean dieOrNot = false;
        s[0] = new Stack<>();
        boolean[] fixed = new boolean[n];
        boolean noDiff = true;
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            if (i > 0) {
                if (val - s2.peek() > 0) {
                    dieOrNot = true;
                    noDiff = false;
                } else {
                    if (noDiff)
                        s[0].pop();
                    s[0].push(val);
                }
            } else {
                if (noDiff && !s[0].isEmpty())
                    s[0].pop();
                s[0].push(val);
            }
            s2.push(val);
        }


        if (!dieOrNot) {
            System.out.println(0);
            return;
        } else {
            count++;
        }
        byte flip = 0;
        for (int i = 0; i < n; i++) {
            noDiff = true;
            s2 = new Stack<>();
            int size = s[i].size();
            s[i + 1] = new Stack<>();
            for (int j = 0; j < size; j++) {
                int val = s[i].pop();
                if (j > 0) {
                    if (flip == 0) {
                        if (val - s2.peek() < 0) {
                            s[i + 1].pop();
                            s[i + 1].push(val);
                        } else {
                            s[i + 1].push(val);
                        }
                    } else {
                        if (val - s2.peek() > 0) {
                        } else {
                            if (noDiff)
                                s[i + 1].pop();
                            s[i + 1].push(val);
                        }
                    }
                } else {
                    s[i + 1].push(val);
                }
                s2.push(val);
            }
            if (size == s[i + 1].size()) break;
            else count++;
            flip ^= 1;
            s[i] = null;
        }

        System.out.println(count);

    }

}
