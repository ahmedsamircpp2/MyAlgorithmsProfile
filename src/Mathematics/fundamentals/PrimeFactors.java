package Mathematics.fundamentals;/**
 * Created by Ahmed Samir on 5/25/17.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {
    static int MAX = 100000000;
    static boolean isPrime[] = new boolean[MAX];
    static List<Integer> primes = new ArrayList<>();

    static void sievePrime() {
        isPrime[0] = isPrime[1] = true;
        isPrime[2] = false;
        for (int i = 2; i * i < MAX; i++) {
            if (!isPrime[i]) {
                primes.add(i);
                for (int j = i * i; j < MAX; j += i) {
                    isPrime[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        sievePrime();
        for (int i = 0; i < n; i++) {
            long val = in.nextLong();
            if (val == 1) {
                System.out.println(0);
                continue;
            }
            if (val == 2) {
                System.out.println(1);
                continue;
            }
            int size = 0;
            long compare = 1;
            for (int k = 0; k < primes.size(); k++) {
                compare *= primes.get(k);
                if (compare > val || compare < 0) {
                    System.out.println(size);
                    break;
                }
                size++;
            }
        }
    }
}