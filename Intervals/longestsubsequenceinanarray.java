package Intervals;

public class longestsubsequenceinanarray {
    public static void main(String[] args) {
        int[]arr={1,7,5,3,4,2,8,9,20,25};
        System.out.println(longestsubquence(arr));
    }
    static int longestsubquence(int []arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[]numline=new int[max+1];
        for(int i=0;i<arr.length;i++){
            numline[arr[i]]=1;
        }
        int count=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<numline.length;i++){
            if(numline[i]==1){
                count++;
                maxi=Math.max(count,maxi);
            }
            else{
                count=0;
            }
        }
        return maxi;
    }
}
