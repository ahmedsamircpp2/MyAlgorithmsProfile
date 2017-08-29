package help;/**
 * Created by Ahmed Samir on 2/21/17.
 */

import java.util.Scanner;

public class Factorization {
    public static void main(String[] args) {
        int i, j, k;
        int N = 1000000;

        int[] factors = new int[N];

        for (i = 0; i < N; i++)
            factors[i] = 0;
        for (i = 2; i < N / 2; i++) {
            // factor of himsef
            if (factors[i] == 0)
                factors[i] = 1;
            for (j = 2; j <= i && (k = j * i) < N; j++)
                if (factors[k] == 1 && factors[j] == 1)
                    factors[k] = factors[i] + 1;
        }
        for (i = N / 2; i < N; i++)
            if (factors[i] == 1)
                factors[i] = 1;
        for (i = 2; i < N; i++)
            factors[i] += factors[i - 1];
    }

    /**
     *
     * void cachePrimes(int n)
     {
     int i,j,k;
     primes = (char*) malloc((n+1)*sizeof(char));
     for(i = 0;i<=n;i++)
     primes[i] = 0;
     primes[0]=1;
     primes[1] = 1;
     k = sqrt(n);
     for(i = 2;i<=k;i++)
     if(!primes[i])
     for(j=i*i;j<=n;j+=i)
     primes[j] = 1;
     }
     */


    /**
     *
     *
     *
     public class CompositePrimes {
     public static void main(String[] args) {
     int MAXN = (1 << 20) + 1;
     int primeFactor[] = new int[MAXN];
     for (int i = 2; i * i < MAXN; i++)
     if (primeFactor[i] == 0)
     for (int j = i * i; j < MAXN; j += i)
     primeFactor[j] = i;
     for (int i = 2; i < MAXN; i++)
     if (primeFactor[i] == 0)
     primeFactor[i] = i;
     int[] nPrimeFactors = new int[MAXN];
     nPrimeFactors[0] = nPrimeFactors[1] = 0;
     for (int i = 2; i < MAXN; i++)
     nPrimeFactors[i] = 1 + nPrimeFactors[i / primeFactor[i]];
     Scanner in = new Scanner(System.in);
     while (in.hasNext()) {
     int n = in.nextInt();
     int count = 0;
     for (int i = 0; i < n; i++)
     if (nPrimeFactors[in.nextInt()] == 2)
     count++;
     System.out.println(count);
     }

     }
     }


     */


    /*

    Prime Code

      1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0


    boolean[] isPrime = new boolean[1 << 16];
    isPrime[0] = isPrime[1] = true;
        for (int i = 2; i * i < isPrime.length; i++)
            if (!isPrime[i])
            for (int j = i * i; j < isPrime.length; j += i)
                isPrime[j] = true


    ;*/


   /*

   Prime Factors

   int[] pfactor = new int[10000001];
    pfactor[0] = pfactor[1] = -1;
    for (int i = 2; i * i < pfactor.length; i++)
        if (pfactor[i] == 0)
            for (int j = i * i; j < pfactor.length; j += i)
                  pfactor[j] = i;

    for (int i = 2; i < pfactor.length; i++)
        if (pfactor[i] == 0)
            pfactor[i] = i;

    */


    /*byte[] cyclic = new byte[1000001];*/



    /*
    public static void sieve() {
        int max = (int) Math.sqrt(primes.length);
        primes[0] = primes[1] = true;
        for (int i = 0; i * i <= max; i++)
            if (!primes[i])
                for (int j = i * i; j < primes.length; j += i)
                    primes[j] = true;


    }*/
}
