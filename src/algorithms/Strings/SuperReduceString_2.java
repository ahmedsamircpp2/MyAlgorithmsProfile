package algorithms.Strings;/**
 * Created by Ahmed Samir on 2/1/17.
 */

import java.util.*;

public class SuperReduceString_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char[] s = in.next().toCharArray();
        Stack<Character> st = new Stack<>();
        st.push(s[0]);
        for (int i = 1; i < s.length; i++)
            if (!st.isEmpty() && s[i] == st.peek())
                st.pop();
            else
                st.push(s[i]);
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty())
            sb.append(st.pop());
        if (sb.length() == 0)
            System.out.println("Empty String");
        else
            System.out.println(sb.reverse().toString());

    }

}
