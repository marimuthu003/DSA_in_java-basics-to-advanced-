package Matrices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class spiralmatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        List<Integer>ans=spiral(matrix);
        System.out.println(ans);

    }
    static List<Integer> spiral(int[][] mat){
        int rowsize=mat.length;
        int colsize=mat[0].length;

        int top=0;
        int left=0;

        int bottom=colsize-1;
        int right=rowsize-1;

        ArrayList<Integer>arr=new ArrayList<>();

        while(top<=bottom && left<=right){
            for(int i=top;i<=right;i++){
                arr.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr.add(mat[i][right]);
            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    arr.add(mat[bottom][i]);
                }
            }
            bottom--;
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    arr.add(mat[i][left]);
                }
            }
            left++;

        }
        return arr;
    }
}
