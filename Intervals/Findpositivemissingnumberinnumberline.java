package Intervals;

public class Findpositivemissingnumberinnumberline {
    static int missing(int[]a){
        int n=a.length;
        int []numline=new int[10];
        for(int i=0;i<n;i++){
            if(a[i]<0||a[i]>9) {
                a[i] = 0;
            }
        }

        for(int i=0;i<numline.length;i++){
            numline[a[i]]=1;
        }

        for(int i=0;i<numline.length;i++){
            if(numline[i]==0){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[]a={-10,-20,0,40,100,3,2,1,1,1,3,3,2,2};
        System.out.println(missing(a));    }
}
