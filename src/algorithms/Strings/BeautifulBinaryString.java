package algorithms.Strings;/**
 * Created by Ahmed Samir on 2/1/17.
 */

import java.util.Scanner;

public class BeautifulBinaryString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), count = 0;
        String s = in.next();
        for (int i = 1; i < n - 1; ) {
            if (s.charAt(i) == '1' && s.charAt(i - 1) == '0' && s.charAt(i + 1) == '0') {
                count++;
                i += 2;
            }
            i++;
        }
        System.out.println(count);
    }
}
