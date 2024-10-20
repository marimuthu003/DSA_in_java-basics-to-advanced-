package Matrices;

public class setmatrixzeros {
    static int[][] zeromatrix(int[][]mat,int r,int c){
        int []row=new int[r];
        int []col=new int[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row[i]==1||col[j]==1){
                    mat[i][j]=0;
                }
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        int[][]matrix={
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        int r=matrix.length;
        int c=matrix[0].length;
        int [][]ans=zeromatrix(matrix,r,c);
        for(int[] row:ans){
            for(int col:row){
                System.out.print(col +" ");
            }
            System.out.println(" ");
            

        }
    }
}
