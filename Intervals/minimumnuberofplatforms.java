package Intervals;
import java.util.*;
public class minimumnuberofplatforms {
    public static void main(String[] args) {
        int[][] interval={{9,15},{11,12},{12,14}};
        System.out.println(find(interval));
    }
    static int find(int[][]interval){
        int n=interval.length;
        int []arr=new int[n];
        int []dep=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=interval[i][0];
            dep[i]=interval[i][1];
        }

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=0;
        int j=0;

        int platform=0;
        int max=0;

        while(i<n && j<n){
            if(arr[i]<dep[j]){
                platform++;
                if(platform>max){
                    max=platform;
                }
                i++;
            }
            else{
                platform--;
                j++;
            }
        }
        return max;

    }
}
