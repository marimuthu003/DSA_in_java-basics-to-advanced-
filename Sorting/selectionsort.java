package Sorting;

public class selectionsort {
    void selection(int[]arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            int minidx=i;
            for (int j=i+1;j<n;j++){
                if(arr[minidx]>arr[j]){
                        minidx=j;
                }
            int temp=arr[i];
                arr[i]=arr[minidx];
                arr[minidx]=temp;

            }
        }

    }
    public static void main(String[] args) {
        int []arr={4,5,3,6,1};
        selectionsort obj=new selectionsort();
        obj.selection(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
