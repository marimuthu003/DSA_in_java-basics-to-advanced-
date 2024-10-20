package Intervals;
import java.util.*;
public class mergeintervals {
    static int[][] merge(int[][]intervals){
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int []>list=new ArrayList<>();

        for(int[] interval:intervals){
            if(list.isEmpty() || list.get(list.size()-1)[1]<interval[0]){
                list.add(interval);
            }
            else{
                list.get(list.size()-1)[1]=Math.max(list.get(list.size()-1)[1],interval[1]);
            }
        }
        return list.toArray(new int[list.size()][]);

    }
    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        int[][] res=merge(intervals);
        System.out.println(Arrays.deepToString(res));
    }
}
