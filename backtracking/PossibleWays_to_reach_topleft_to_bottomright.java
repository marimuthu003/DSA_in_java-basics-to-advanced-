package backtracking;

public class PossibleWays_to_reach_topleft_to_bottomright {
    public static void main(String[] args) {
        int[][]mat={{0,0,0},{0,0,0},{0,0,0}};
        int i=0;
        int j=0;
        int row=mat.length;
        int col=mat[0].length;
        System.out.println(possibleways(mat,i,j,row,col));
    }
    static int possibleways(int[][]mat,int i,int j,int row,int col){
        if(i==row-1 && j==col-1){
            return 1;
        }
        if(i>=row|| j>=col){
            return 0;
        }
        int rightval=possibleways(mat,i,j+1,row,col);
        int bottomval=possibleways(mat,i+1,j,row,col);

        return rightval+bottomval;
    }
}
