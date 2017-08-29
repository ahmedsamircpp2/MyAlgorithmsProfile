package DataStructure.Queue;

import java.util.Scanner;

/**
 * Created by rambo on 2/13/17.
 */
public class DownToZero {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int pFact[] = getPrimeFactors(1000001);
        for (int i = 0; i < q; i++) {
            int n = in.nextInt();
            if (n <= 3) {
                System.out.println(n);
            } else {
                int val = pFact[n];
                System.out.println(Math.max(val, n / val));
            }

        }
    }

    private static int[] getPrimeFactors(int i) {
        int pFactor[] = new int[i];
        pFactor[0] = 0;
        pFactor[1] = 1;
        pFactor[2] = 2;
        for (int j = 3; j < i; j += 2) {
            for (int k = 3; k < i; k++) {
                if (k % j == 0 && pFactor[k] == 0)
                    pFactor[k] = j;
                else if (k % 2 == 0)
                    pFactor[k] = 2;
            }
        }
        return pFactor;
    }
}
