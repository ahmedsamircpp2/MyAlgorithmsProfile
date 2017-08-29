package algorithms.Strings;/**
 * Created by Ahmed Samir on 1/30/17.
 */

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int k = 0; k < t; k++) {
            String j1 = in.next();
            String j2 = in.next();
            int s1Index = 0, s2Index = 0, length1 = j1.length(), length2 = j2.length();
            StringBuilder st = new StringBuilder();
            for (; s1Index < length1 && s2Index < length2; ) {
                if (myCompareTo(j1, j2, s1Index, s2Index, length1, length2) <= 0) {
                    System.out.print(j1.charAt(s1Index++));
                    char ch = j1.charAt(s1Index - 1);
                    while (s1Index < length1 && ch == j1.charAt(s1Index))
                        st.append(j1.charAt(s1Index++));
                } else {
                    st.append(j2.charAt(s2Index++));
                }
            }
            if (s1Index < length1)
                st.append(j1.substring(s1Index));
            if (s2Index < length2)
                st.append(j2.substring(s2Index));

            System.out.println(st.toString());
        }
    }

    private static int myCompareTo(String j1, String j2, int s1Index, int s2Index, int length1, int length2) {
        int len1 = length1 - s1Index;
        int len2 = length2 - s2Index;
        int lim = Math.min(len1, len2);
        int k = 0;
        while (k < lim) {
            if (j1.charAt(k + s1Index) != j2.charAt(k + s2Index)) {
                return j1.charAt(k + s1Index) - j2.charAt(k + s2Index);
            }
            k++;
        }
        return len1 - len2;
    }

}
