package DataStructure.Trie;

import java.util.Scanner;

/**
 * Created by rambo on 2/6/17.
 */
public class Contacts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            String val = in.next();
            if (val.equals("add")) {
                String word = in.next();
                System.out.println(" ADD ");
            } else {
                String word = in.next();
                System.out.println("FIND");

            }
        }
    }
}
