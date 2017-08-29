package algorithms.Strings;/**
 * Created by Ahmed Samir on 2/1/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TwoCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] val = in.next().toCharArray();
        char[] del = new char[n];
        int c[] = new int[128];
        for (int i = 1, j = 0; i < n; i++) {

            if (val[i] == val[i - 1])
                del[j++] = val[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < del.length; j++) {
                if (val[i] == del[j]) {
                    val[i] = '0';
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (val[i] != '0')
                c[val[i]]++;
        }
        Arrays.sort(c);
        System.out.println(c[127] + c[126]);
    }

}
