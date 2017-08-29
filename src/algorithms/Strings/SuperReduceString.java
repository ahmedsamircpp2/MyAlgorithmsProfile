package algorithms.Strings;/**
 * Created by Ahmed Samir on 2/1/17.
 */

import java.util.Queue;
import java.util.Scanner;

public class SuperReduceString {
    public static void main(String[] args) {
        Queue e;
        Scanner in = new Scanner(System.in);
        char[] s = in.next().toCharArray();
        for (int i = 1; i < s.length; i++)
            if (s[i] == s[i - 1])
                s[i] = s[i - 1] = '0';
            else {

            }
        int count = 0;
        StringBuilder sst = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            if (s[i] != '0') {
                sst.append(s[i]);
                count++;
            }
        }
        if (count == 0)
            System.out.println("Empty String");
        else
            System.out.println(sst.toString());
    }

}
