package algorithms.Implementations;

import java.util.Scanner;

/**
 * Created by Ahmed Samir on 1/20/17.
 */
public class PDFViewer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for (int h_i = 0; h_i < n; h_i++) {
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int maxHeight = -1;
        for (int i = 0; i < word.length(); i++) {
            maxHeight = Math.max(h[((int) word.charAt(i)) - 97], maxHeight);
        }
        System.out.println(maxHeight * word.length());

    }
}
