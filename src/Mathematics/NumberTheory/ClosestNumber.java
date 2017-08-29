package Mathematics.NumberTheory;
/**
 * Created by Ahmed on 5/31/17.
 */

import java.util.Scanner;

public class ClosestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int x = in.nextInt();
            if (x == 1) {
                System.out.println(x);
                continue;
            }
            if (Math.abs(b) >= 1) {
                long val = a;
                if (val > 1)
                    for (int j = 1; j < Math.abs(b); j++) {
                        val *= a;
                    }
                if (b < 0)
                    val = Math.round(1 / val);
                for (long j = 1; j < 1000000000; j++) {
                    long res = j * x;
                    if (res > val) {
                        long before = (j - 1) * x;
                        if ((val - before) > (res - val))
                            System.out.println(res);
                        else
                            System.out.println(before);
                        break;
                    }
                }
            } else {
                System.out.println(0);
            }
        }
    }
}