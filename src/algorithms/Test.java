package algorithms;
/**
 * Created by Ahmed Samir on 3/14/17.
 */

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString((int) 'a'));
        System.out.println(Integer.toBinaryString((int) 'b'));
        System.out.println(Integer.toBinaryString((int) 'c'));
        int s = 's';
        int a = 'a';
        int m = 'm';

        // [5,4,25,3,33]

        int y = s ^ a ^ m;
        System.out.println(Integer.toBinaryString(s ^ a ^ m));
        System.out.println((char) (y ^ s ^ a));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ahmedsamir");
        System.out.println(stringBuilder.replace(2, 4, "ahmed"));

    }
}