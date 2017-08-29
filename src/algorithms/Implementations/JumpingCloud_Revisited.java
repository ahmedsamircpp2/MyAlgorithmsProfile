package algorithms.Implementations;/**
 * Created by Ahmed Samir on 1/26/17.
 */

import java.util.Scanner;

public class JumpingCloud_Revisited {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        int E = 100;
        for (int i = 0; i < n; i = (i + k) % n) {
//            System.out.println(i);
            if (i == 0 && E < 100) {
                System.out.println(E);
                break;
            }
            if (c[i] > 0)
                E -= 3;
            else
                E--;
        }
    }//86
}
