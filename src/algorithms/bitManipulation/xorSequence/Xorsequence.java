package algorithms.bitManipulation.xorSequence;

/**
 * Created by Ahmed Samir on 5/10/17.
 */


public class Xorsequence {
    public static void main(String[] args) {
        int x = -1;
        System.out.println(Integer.toBinaryString(x << 3));
        System.out.println(x >>> 1);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.toBinaryString(x >>> 1));

//        long time =System.currentTimeMillis();
//        for (int i = 0; i <100000000 ; i++) {
//            less(3000,100);
//        }
//        System.out.println("Time : "+ (System.currentTimeMillis()-time));
//        System.out.println(isTrue());
    }

    static int lessThanBranchFree(int x, int y) {
        return ~~(x - y) >>> (Integer.SIZE - 1);
    }

    static boolean less(int x, int y) {
        return (x - y) < 0;
    }

    static boolean isTrue() {
        return 0 == 0 & 5 == 6;
    }
}