//package algorithms.Graph.subsetTest;/**
// * Created by Ahmed Samir on 5/8/17.
// */
//
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class SubsetComponent1 {
//    static final int SZ =64;
//    static int parent[]=new int[SZ];
//
//    static HashMap<Integer,Integer> count=new HashMap<>();
//
//    public static int getParent(int i){
//        if(parent[i]==i)return i;
//        else
//            return parent[i]= getParent(parent[i]);
//    }
//    public static void union( int i, int j ){
//        int p1 = getParent(i);
//        int p2 = getParent(j);
//        if(p1==p2)return;
//
//        parent[p2] = p1;
//        count.put(p1,count.get(p1)+(count.get(p2)));
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        long total= SZ;
//        long arr[]=new long[n];
//        for (int i = 0; i < n; i++) {
//            arr[i]=Long.parseUnsignedLong(in.next());
//        }
//        for (long i = 1; i < Math.pow(2,n); i++) {
//            for (int k = 0; k < SZ; k++) {
//                parent[k]=k;
//                count.put(k,1);
//            }
//            long res=0L;
//            for (int j = 0; j < n; j++) {
//                int pow= (int) Math.pow(2,j);
//                if((i & pow)>0){
//                    if(Long.bitCount(arr[j])>1) {
//                        res |= arr[j];
//                        for (int k = 0, parent = -1; k < SZ; k++)
//                            if ((arr[j] & 1 << k) > 0) {
//                                if (parent < 0) {
//                                    parent = k;
//                                } else {
//                                    union(parent, k);
//                                }
//                            }
//                    }
//                }
//            }
//            int add =SZ;
//            int bit = Long.bitCount(res);
//            if(bit>1){
//                int components =0;
//                for (int j = 0; j < SZ; j++) {
//                    if(count.get(j)>1)components++;
//                }
//                add-=bit;
//                add+=components;
//            }
//
////            System.out.println("Add => "+add);
//            total+=add;
//        }
//        System.out.println(total);
//    }
//}
