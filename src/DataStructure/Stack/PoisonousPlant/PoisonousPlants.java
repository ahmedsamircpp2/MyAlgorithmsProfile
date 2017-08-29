package DataStructure.Stack.PoisonousPlant;/**
 * Created by Ahmed Samir on 2/15/17.
 */

import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class PoisonousPlants {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Plant> s = new Stack<>();
/**
 * 7
 6 5 8 4 7 10 9
 */
        Set<Integer> set;

        for (int i = 0; i < n; i++) {
            Plant c = new Plant(in.nextInt(), 0);
            if (s.peek().num > c.num) {
                while (!s.isEmpty() && s.peek().num > c.num) {
                    s.peek().day++;
                }
            } else {
                s.push(c);
            }
        }
    }

    static class Plant {
        int num, day;

        public Plant(int num, int day) {
            this.num = num;
            this.day = day;
        }
    }
}