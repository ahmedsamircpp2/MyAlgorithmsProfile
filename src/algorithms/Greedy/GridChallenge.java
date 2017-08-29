package algorithms.Greedy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by rambo on 3/8/17.
 */
public class GridChallenge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            char arr[][] = new char[n][n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.next().toCharArray();
                Arrays.sort(arr[j]);
            }
            boolean no = false;
            for (int j = 0; j < n; j++) {
                Stack<Character> s = new Stack<>();
                for (int k = 0; k < n; k++) {
                    if (!s.isEmpty()) {
                        int val = s.pop().compareTo(arr[k][j]);
                        if (val > -1 && val != 0) {
                            System.out.println("NO");
                            no = true;
                            break;
                        }
                    }
                    s.push(arr[k][j]);
                }
                if (no)
                    break;
            }
            if (!no)
                System.out.println("YES");
        }
    }
}
