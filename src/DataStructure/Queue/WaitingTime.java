package DataStructure.Queue;/**
 * Created by Ahmed Samir on 2/23/17.
 */

import java.util.*;

public class WaitingTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<row> ll = new ArrayList<>();
        List<row> copy = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            row e = new row(in.nextInt(), in.nextInt());
            ll.add(e);
            copy.add(e);

        }
        int wt = getWt(ll);
        for (int i = 0; i < ll.size(); i++) {
            row v1 = ll.get(i);
            for (int j = i + 1; j < ll.size(); j++) {
                row v2 = ll.get(j);
//                if(v2.a <v1.b )
            }


        }

    }

    private static int getWt(List<row> ll) {
        int wt = 0;
        int start = 0;
        for (int i = 0; i < ll.size(); i++) {
            wt += ((start + ll.get(i).b) - ll.get(i).a);
            start += ll.get(i).b;
        }
        return wt / ll.size();
    }

    static class row {
        int a, b;

        public row(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

}
