package backtracking;

public class climbingstairs {
    static int climbstairs(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return climbstairs(n-1)+climbstairs(n-2);
    }

    public static void main(String[] args) {
        int n=3;
        int res=climbstairs(n);
        System.out.println(res);

    }
}
