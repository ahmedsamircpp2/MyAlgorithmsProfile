package algorithms.Strings;/**
 * Created by Ahmed Samir on 1/28/17.
 */

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
                count++;
        }
        System.out.println(count + 1);
    }

}
