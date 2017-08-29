package algorithms.MyWork.FindMe;

import java.util.Scanner;

/**
 * Created by rambo on 5/18/17.
 */
public class FindMe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        long time = System.currentTimeMillis();
        int word = 's' ^ 'a' ^ 'm';
        for (int k = 0; k < t; k++) {
            String line = in.nextLine();
            int count = 0;
            for (int i = 0; i < line.length() - 3; i++)
                count += (word ^ line.charAt(i) ^ line.charAt(i + 1) ^ line.charAt(i + 2)) == 0 ? 1 : 0;
            System.out.println(count);
        }
        System.out.println("Time : " + (System.currentTimeMillis() - time) + " ms");
    }
}
