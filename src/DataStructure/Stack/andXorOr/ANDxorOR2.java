package DataStructure.Stack.andXorOr;/**
 * Created by Ahmed Samir on 4/12/17.
 */

import java.util.Scanner;
import java.util.Stack;

public class ANDxorOR2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Cell> arr = new Stack<>();
        long max = -1;
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            if (arr.isEmpty()) {
                arr.push(new Cell(val));
            } else {
                if (!arr.isEmpty() && arr.peek().val > val) {
                    max = Math.max(max, calc(arr.peek().val, val));
                    arr.peek().taken = true;
                    arr.push(new Cell(val, true));
                } else {
//                    while (!arr.isEmpty() && !arr.peek().taken &&  arr.peek().val < val) {
//                        arr.pop();
//                    }
                    arr.push(new Cell(val, false));
                }
            }
        }
        System.out.println(max);

    }

    private static long calc(int m1, int m2) {
        return (((m1 & m2) ^ (m1 | m2)) & (m1 ^ m2));
    }

    static class Cell {
        int val;
        boolean taken;

        public Cell(int val) {
            this.val = val;
        }

        public Cell(int val, boolean taken) {
            this.val = val;
            this.taken = taken;
        }
    }

}
