package Sorting;

public class insertionsort {
    public void insertion(int[]arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int value=arr[i];
            int index=i;
            while((index>0)&&(arr[index-1]>value)){
                arr[index]=arr[index-1];
                index--;

            }
            arr[index]=value;
        }
    }
    public static void main(String[] args) {
        int []arr={6,4,2,0};
        insertionsort obj=new insertionsort();
        obj.insertion(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
