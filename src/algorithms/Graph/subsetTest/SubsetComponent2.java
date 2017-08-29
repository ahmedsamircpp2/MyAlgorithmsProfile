//package algorithms.Graph.subsetTest;/**
// * Created by Ahmed Samir on 5/8/17.
// */
//
//import java.util.Scanner;
//
//public class SubsetComponent2 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        final int SZ =64;
//        long total= SZ;
//        long arr[]=new long[n];
//        for (int i = 0; i < n; i++) {
//            arr[i]=Long.parseUnsignedLong(in.next());
//        }
//        for (long i = 1; i < Math.pow(2,n); i++) {
//            long res=0L;
//            for (int j = 0; j < n; j++) {
//                int pow= (int) Math.pow(2,j);
//                if( (i &pow)>0){
//                    int bit = Long.bitCount(arr[j]);
//                    if(bit>1) res|=arr[j];
//                }
//            }
//            total+=SZ;
//            int bit = Long.bitCount(res);
//            if(bit>1){total-=(bit+1); }
//// 45088769
//// 45088769
//        }
//        System.out.println(total);
//    }
//    //56623104
//}
