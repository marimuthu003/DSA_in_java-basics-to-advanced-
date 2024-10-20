package Matrices;

public class ZigZagmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {8, 12, 13},
                {4, 3, 16},
                {7, 8, 9}
        };
        zigzag(matrix);

    }
    static void zigzag(int[][] m){
        int r=m.length;
        int c=m[0].length;
        int top=0;
        int left=0;
        int bottom=c-1;
        int right=r-1;

        while(top<=bottom){
            int col=left;
            while(col<=right){
                System.out.println(m[top][col]);
                col++;
            }
            top++;

            col=right;
            while(col>=0){
                System.out.println(m[top][col]);
                col--;
            }
            top++;
        }
    }
}
