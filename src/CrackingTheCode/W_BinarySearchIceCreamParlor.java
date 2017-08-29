package CrackingTheCode;/**
 * Created by Ahmed Samir on 4/14/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class W_BinarySearchIceCreamParlor {
    /*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int dollar = in.nextInt();
            int count = in.nextInt();
            int arr []= new int [count];
            int copyArr []= new int [100001];
            for (int j = 0; j < count; j++) {
                arr[j]=in.nextInt();
                copyArr[arr[j]]=j+1;
            }
            Arrays.sort(arr);
            int rem =0;
            for (int j = 0; j < count; j++) {
                rem=0;
                if(arr[j]<=dollar){
                    rem=dollar-arr[j];
                    int copy=arr[j];
                    arr[j]=-1;
                    int index = Arrays.binarySearch(arr,rem);
                    arr[j]=copy;
                    System.out.println(rem +" | "+ index);
                    if(index>=0){
                         System.out.println(copyArr[arr[i]] +" "+ copyArr[arr[index]]);
                        break;
                    }
                }
            }
        }
    }*/
}