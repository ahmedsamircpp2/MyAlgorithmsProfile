package algorithms.Implementations;/**
 * Created by Ahmed Samir on 1/25/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class AlmostSorted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int beginIndex = -1, endIndex = -1, diff = 0;
        boolean lock = false;
        arr[0] = in.nextInt();
        for (int i = 1; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] < arr[i - 1]) {
                if (!lock) {
                    beginIndex = i - 1;
                    lock = true;
                }
                endIndex = i;
            }
        }
        int copy[] = arr.clone(), copy2[] = arr.clone();
        Arrays.sort(copy);
        copy2[beginIndex] ^= copy2[endIndex];
        copy2[endIndex] ^= copy2[beginIndex];
        copy2[beginIndex] ^= copy2[endIndex];

        if (Arrays.equals(copy, copy2)) {
            System.out.println("yes\nswap " + (1 + beginIndex) + " " + (1 + endIndex));
        } else {
            for (int i = beginIndex, j = 0; i <= endIndex; i++, j++) {
                copy2[i] = arr[endIndex - j];
                if (copy[i] != arr[i])
                    diff++;
            }
            if (Arrays.equals(copy, copy2)) {
                if (diff > 2) System.out.println("yes\nreverse " + ++beginIndex + " " + ++endIndex);
            } else System.out.println("no");
        }
    }

}