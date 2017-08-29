package algorithms.Regex;/**
 * Created by Ahmed Samir on 5/9/17.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHtmlTag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            Pattern pattern = Pattern.compile("</?(.*?)>");
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                set.add(matcher.group(1).split("\\s+")[0]);
            }

        }

        int j = 0;
        for (String str : set) {
            if (j++ > 0)
                System.out.print(";");
            System.out.print(str);
        }

    }

}
