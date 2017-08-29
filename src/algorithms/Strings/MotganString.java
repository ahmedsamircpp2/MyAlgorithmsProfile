package algorithms.Strings;/**
 * Created by Ahmed Samir on 1/30/17.
 */

import java.util.Scanner;

public class MotganString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int k = 0; k < t; k++) {
            String j1 = in.next() + "z";
            String j2 = in.next() + "z";
            StringBuilder st = new StringBuilder();
            int i = 0, j = 0, len = j1.length(), len2 = j2.length();
            for (; i < len && j < len2; ) {

                if (j1.charAt(i) - j2.charAt(j) > 0) {
                    st.append(j2.charAt(j++));
                } else if (j1.charAt(i) - j2.charAt(j) < 0) {
                    st.append(j1.charAt(i++));
                } else {
                    int ii = i, jj = j, res = -5;
                    boolean exist = false;
                    while (ii < len && jj < len2) {
                        char c1 = j1.charAt(ii);
                        char c2 = j2.charAt(jj);
                        if (c1 != c2) {
                            res = c1 - c2;
                            exist = true;
                            break;
                        }
                        ii++;
                        jj++;
                    }
                    if (!exist)
                        res = (len - i) - (len2 - j);

                    if (res < 0) {
                        st.append(j1.charAt(i++));
                        while (i + 1 < len && j1.charAt(i) == j1.charAt(i + 1)) {
                            st.append(j1.charAt(i++));
                        }
                    } else {
                        st.append(j2.charAt(j++));
                    }
                }
            }
            if (i < j1.length())
                st.append(j1.substring(i));
            else if (j < j2.length())
                st.append(j2.substring(j));
            System.out.println(st.toString().substring(0, st.length() - 2));
        }
    }
}
