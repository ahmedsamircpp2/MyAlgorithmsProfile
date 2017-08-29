package algorithms.MyWork.FindMe;/**
 * Created by Ahmed Samir on 5/19/17.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindMeV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        long time = System.currentTimeMillis();
        for (int k = 0; k < t; k++) {
            String s = in.nextLine();
            Map<String, Boolean> m = new HashMap<>();
            m.put("mas", true);
            m.put("asm", true);
            m.put("sam", true);
            m.put("msa", true);
            m.put("sma", true);
            m.put("ams", true);
            int count = 0;
            for (int i = 0; i < s.length() - 3; i++) {
                if (m.get(s.substring(i, i + 3)) != null) {
                    count++;
                }
            }
            System.out.println(k + ": " + count);
        }
        System.out.println("Time : " + (System.currentTimeMillis() - time) + " ms");
    }

}

/**
 * 22570
 * 22570
 * 22570
 * 90286
 * 22570
 * 22570
 * 22570
 * 22570
 * 22570
 * 22570
 * 22570
 * 90286
 * Time : 69 ms
 * <p>
 * 0: 22570
 * 1: 22570
 * 2: 22570
 * 3: 90286
 * 4: 22570
 * 5: 22570
 * 6: 22570
 * 7: 22570
 * 8: 22570
 * 9: 22570
 * 10: 22570
 * 11: 90286
 * Time : 143 ms
 */