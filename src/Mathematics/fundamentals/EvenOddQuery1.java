package Mathematics.fundamentals;/**
 * Created by Ahmed on 5/26/17.
 */

import java.util.Scanner;

public class EvenOddQuery1 {

    static long find(int x, int y, int[] arr) {
        if (x > y) return 1;
        return (long) Math.pow(arr[x], find(x + 1, y, arr));
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        for (int i = 0; i < k; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(find(a - 1, b - 1, arr) % 2 == 0 ? "Even" : "Odd");
        }
    }

}
