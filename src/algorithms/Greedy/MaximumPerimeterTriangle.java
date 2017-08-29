package algorithms.Greedy;/**
 * Created by Ahmed Samir on 4/24/17.
 */

import java.util.*;

public class MaximumPerimeterTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        Queue<Triangle> t = new PriorityQueue<>(new Comparator<Triangle>() {
            @Override
            public int compare(Triangle o1, Triangle o2) {
                if (o1.prem == o2.prem) {
                    return (o1.x != o2.x ? o1.x.compareTo(o2.x) : o1.y != o2.y ? o1.y.compareTo(o2.y) : o1.z != o2.z ? o1.z.compareTo(o2.z) : o1.x.compareTo(o2.x));
                } else {
                    return (-1) * o1.prem.compareTo(o2.prem);
                }
            }
        });
        int arr[] = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 2; i < s; i++) {
            if (!isDegenerous(arr[i - 2], arr[i - 1], arr[i])) {
                t.add(new Triangle(arr[i - 2], arr[i - 1], arr[i]));
            }
        }
        if (t.isEmpty())
            System.out.println(-1);
        else {
            Triangle tr = t.peek();
            System.out.println(tr.x + " " + tr.y + " " + tr.z);
        }

    }

    private static boolean isDegenerous(int x, int y, int z) {
        return x + y <= z;
    }

    static class Triangle {
        Integer x, y, z;
        Integer prem;

        public Triangle(Integer x, Integer y, Integer z) {
            this.x = x;
            this.y = y;
            this.z = z;
            prem = this.x + this.y + this.z;
        }

        @Override
        public String toString() {
            return "Triangle{" +
                    "x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    ", prem=" + prem +
                    '}';
        }
    }


}
