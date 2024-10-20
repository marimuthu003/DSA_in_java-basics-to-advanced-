package Intervals;

import java.util.ArrayList;


import java.util.*;
public class SpotLogic {
    public static void main(String[] args) {
        int[][] arr={{1,3},{2,6},{8,10},{15,18}};
        mergeinterval(arr);

    }
    static void mergeinterval(int[][] arr){
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int previousstart=arr[0][0];
        int previousend=arr[0][1];
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{ previousstart,previousend});
        for(int i=1;i<arr.length;i++){
            int curstart=arr[i][0];
            int curend=arr[i][1];
            int [] num= list.get(list.size()-1);
            if(curstart<=num[1]){
                num[1]=Math.max(curend,num[1]);
            }
            else{
                list.add(new int[]{curstart,curend});
            }

        }

        for(int[] a: list){
            System.out.println("["+a[0]+" "+a[1]+"]");
        }


    }
}
//public class SpotLogic {
//    public static void main(String[] args) {
//        ArrayList<int[]> list= new ArrayList<>();
//
//        list.add(new int[]{1,32
//        });
//        int[] n= list.get(list.size()-1);
//        n[1]=10;
//        for(int[] m:list){
//            System.out.println("["+m[0]+" "+m[1]+"]");
//        }
//    }
//}