package SlidingWindow;
import java.util.Scanner;
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int n=nums.length;
        int sum=0;
        int longest=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(sum>=target){
                longest=Math.min(longest,r-l+1);
                sum=sum-nums[l];
                l++;

            }

        }
        return (longest == Integer.MAX_VALUE)?0:longest;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=input.nextInt();
        }
        int target=input.nextInt();
        MinimumSizeSubarraySum obj=new MinimumSizeSubarraySum();
        System.out.println(obj.minSubArrayLen(target,nums));
    }
}
