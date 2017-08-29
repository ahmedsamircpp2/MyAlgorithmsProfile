package Mathematics.fundamentals;
/**
 * Created by Ahmed on 5/26/17.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * n log n
 */
public class BestDivisor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int resNumber = -1;
        for (int val = 2; val <= n; val++) {
            if (n % val == 0) {
                if (val < 10) {
                    sum = resNumber = Math.max(sum, val);
                    continue;
                }

                int digitCount = 0;
                int copy = val;
                while (copy > 0) {
                    digitCount += (copy % 10);
                    copy /= 10;
                }
                if (digitCount > sum) {
                    resNumber = val;
                    sum = digitCount;
                } else if (digitCount == sum) {
                    if (val < resNumber) {
                        resNumber = val;
                        sum = digitCount;
                    }
                }
            }
        }
        if (resNumber > -1)
            System.out.println(resNumber);
        else
            System.out.println(n);
    }
}
