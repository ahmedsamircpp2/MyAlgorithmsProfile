package algorithms.Implementations;

/**
 * Created by Ahmed Samir on 1/23/17.
 */

public class BeautifulDaysAtMovies {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int i = in.nextInt();
//        int j = in.nextInt();
//        int k = in.nextInt();
//        int total =0;
//        for (int l = i; l <j ; l++) {
//            if(Math.abs(l -reverse(l))%k  ==0 ){
//                total++;
//            }
//        }
//        System.out.println(total);

        long t = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            reverse(i);
        }
        System.out.println("Time : " + (System.currentTimeMillis() - t) + " ns");
    }

    public static int reverse(int x) {
        if (x < 10) return x;
        int tmp = 0;
        while (x > 0) {
            if (tmp > 0)
                tmp *= 10;
            tmp += (x % 10);
            x = x / 10;
        }
        return tmp;
    }

    public static int gcd_arr(int a[]) {
        int res = 1;
        for (int i = 0; i < a.length; i++) {
            res = gcd(res, a[i]);
        }
        return res;
    }

    public static int lcm_arr(int a[]) {
        int res = 1;
        for (int i = 0; i < a.length; i++) {
            res = lcm(res, a[i]);
        }
        return res;
    }

    public static int gcd(int a, int b) {
        int r = 0;
        while ((r = a % b) > 0) {
            a = b;
            b = r;
        }
        return b;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

}
