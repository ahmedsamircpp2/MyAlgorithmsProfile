package algorithms.Regex;/**
 * Created by Ahmed Samir on 5/9/17.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindASubWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder st = new StringBuilder();
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            st.append(in.nextLine()).append(" ");
        }
        int q = Integer.parseInt(in.nextLine());
        for (int i = 0; i < q; i++) {
            int counter = 0;
            String word = in.nextLine();
            String reg = "[^\\W](" + word + ")[^\\W]";
            Pattern pattern = Pattern.compile(reg);
            Matcher matcher = pattern.matcher(st.toString());
            while (matcher.find()) {
                counter++;
            }
            System.out.println(counter);
        }
    }
    // ahmed
}