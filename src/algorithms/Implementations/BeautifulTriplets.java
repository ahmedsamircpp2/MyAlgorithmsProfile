package algorithms.Implementations;/**
 * Created by Ahmed Samir on 1/26/17.
 */

import java.util.*;

public class BeautifulTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int dd = in.nextInt();
        int arr[] = new int[n];
        Map<Integer, Boolean> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            m.put(arr[i], Boolean.TRUE);
        }
        int count = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < 3; j++) {
                if (m.get(arr[i] + j * dd) != null && m.get(arr[i] + j * dd))
                    count++;
            }
            if (count == 3)
                sum++;
        }
        System.out.println(sum);
    }
}