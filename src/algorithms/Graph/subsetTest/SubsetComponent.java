//package algorithms.Graph.subsetTest;/**
// * Created by Ahmed Samir on 5/8/17.
// */
//
//import java.util.ArrayDeque;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class SubsetComponent {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        final int SZ =64;
//        long total= SZ;
//        long arr[]=new long[SZ];
//        Queue<Integer> q = new ArrayDeque<>();
//        for (int i = 0; i < n; i++) {
//            arr[i]=Long.parseUnsignedLong(in.next());
//            q.add(i);
//        }
//        long res =0L;
//        while (!q.isEmpty()){
//            int index = q.poll(),bit = Long.bitCount(arr[index]);
//            if(bit > 1){
//                res|=arr[index];
//                bit = Long.bitCount(res);
//                total+=((SZ - bit) + 1);
//            }
//            else{
//                total+=SZ;
//            }
//            long cRes=res;
//            for (int i =index+1 ; i <n ; i++) {
//                 bit = Long.bitCount(arr[i]);
//                if(bit >1) {
//                    res|=arr[i];
//                    bit = Long.bitCount(res);
//                    total+=((SZ - bit) + 1);
//                }
//                else {
//                    total += SZ;
//                }
//            }
//            res=0L;
//
//        }
//        System.out.println(total);
//    }
//}
