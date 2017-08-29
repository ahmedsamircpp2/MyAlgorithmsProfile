package DataStructure.Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by rambo on 2/5/17.
 */
public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            char[] a = in.next().toCharArray();
            Stack<Character> s = new Stack<>();
            boolean no = false;
            for (int j = 0; j < a.length; j++) {
                if (!s.isEmpty()) {
                    Character c = s.peek();
                    if ((a[j] == '}' && c.equals('{'))
                            || (a[j] == ']' && c.equals('[')) ||
                            (a[j] == ')' && c.equals('('))) {
                        s.pop();
                    } else {
                        s.push(a[j]);
                    }
                } else {
                    s.push(a[j]);
                }
            }
            if (s.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");

        }

    }
}
