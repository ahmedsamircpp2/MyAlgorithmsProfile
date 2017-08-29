package Mathematics.fundamentals.fibonacci;/**
 * Created by Ahmed on 5/26/17.
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsFibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Long, Boolean> m = new HashMap<>();
        long arr[] = new long[n];
        long last = 0;
        for (int i = 0; i < n; i++) {
            long val = in.nextLong();
            m.put(val, false);
            arr[i] = val;
            last = val > last ? val : last;
        }


        long a = 0;
        long b = 1;
        for (int i = 2; i < last; i++) {
            long tmp = a + b;
            a = b;
            b = tmp;
            if (m.get(b) != null) {
                m.put(b, true);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (m.get(arr[i]))
                System.out.println("IsFibo");
            else
                System.out.println("IsNotFibo");
        }
    }
}