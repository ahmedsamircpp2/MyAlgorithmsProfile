//package DataStructure.Queue;
//
//import java.util.*;
//
///**
// * Created by rambo on 2/5/17.
// */
//public class CastleOnTheGrid {
//   static class Cell{
//       int s,e,steps=0;
//       int sT,eT;
//
//       public Cell(int s, int e) {
//           this.s = s;
//           this.e = e;
//       }
//
//       @Override
//       public String toString() {
//           return "Cell{" +
//                   "s=" + s +
//                   ", e=" + e +
//                   ", steps=" + steps +
//                   '}'+'\n';
//       }
//   }
//    static class Cell{
//        int s,e,steps=1;
//        int sT,eT;
//
//        public Cell(int s, int e) {
//            this.s = s;
//            this.e = e;
//        }
//
//        @Override
//        public String toString() {
//            return "Cell{" +
//                    "s=" + s +
//                    ", e=" + e +
//                    ", steps=" + steps +
//                    ", sT=" + sT +
//                    ", eT=" + eT +
//                    '}';
//        }
//    }
//>>>>>>> 12ef7fb1321cb41d374a3c2b8a439007334f18e9
//    static int []DI = {1,0,-1,0};
//    static int []DJ = {0,1,0,-1};
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        char mat [][]= new char [n][n];
//        for (int i = 0; i < n; i++) {
//            mat[i]= in.next().toCharArray();
//        }
//        boolean vis[][]= new boolean [n][n];
//        Queue<Cell> q = new PriorityQueue<>(new Comparator<Cell>() {
//            @Override
//            public int compare(Cell o1, Cell o2) {
//                return Integer.valueOf(o1.steps).compareTo(o2.steps);
//            }
//        });
//        Cell startCell=new Cell(in.nextInt(),in.nextInt());
//        startCell.sT=startCell.s;
//        startCell.eT=startCell.e;
//<<<<<<< HEAD
//=======
////        startCell.steps=1;
//>>>>>>> 12ef7fb1321cb41d374a3c2b8a439007334f18e9
//        q.add(startCell);
//        int eS = in.nextInt(), eE= in.nextInt();
//        int min=Integer.MAX_VALUE;
//        while(!q.isEmpty()){
//            Cell cell = q.remove();
//            int s = cell.s;
//            int e =cell.e;
//            if(s==eS && e==eE){
//<<<<<<< HEAD
//                System.out.println(cell.steps+1);
//=======
//                System.out.println(cell.steps);
//>>>>>>> 12ef7fb1321cb41d374a3c2b8a439007334f18e9
//                break;
//            }else{
//                if(!vis[s][e]){
//                    vis[s][e]=true;
//                    for (int i = 0; i < DI.length; i++) {
//                        int nS = s+DI[i];
//                        int nE = e+DJ[i];
//<<<<<<< HEAD
//                        if(nS>=0&& nS<n && nE>=0&&nE<n &&!vis[nS][nE] && mat[nS][nE]!='X'){
//=======
//                        while(nS>=0&& nS<n && nE>=0&&nE<n &&!vis[nS][nE] && mat[nS][nE]!='X'){
//>>>>>>> 12ef7fb1321cb41d374a3c2b8a439007334f18e9
//                            Cell nCell = new Cell(nS,nE);
//                            nCell.steps=cell.steps;
//                            if(nCell.s !=cell.sT && nCell.e!=cell.eT){
//                                nCell.steps++;
//                                nCell.sT=nCell.s;
//                                nCell.eT=nCell.e;
//                            }else{
//                                nCell.sT=cell.sT;
//                                nCell.eT=cell.eT;
//                            }
//                            q.add(nCell);
//<<<<<<< HEAD
//=======
//                            nS+=DI[i];
//                            nE+=e+DJ[i];
//>>>>>>> 12ef7fb1321cb41d374a3c2b8a439007334f18e9
//                        }
//                    }
////                    System.out.println(q);
//                }
//            }
//        }
//    }
//}
