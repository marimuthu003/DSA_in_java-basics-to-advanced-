package SlidingWindow;

public class MaximumOnes {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int zerocount=0;
        int maxlength=0;
        for(int r=0;r<n;r++){
            if(nums[r]==0){
                zerocount++;
            }
            while(zerocount>k){
                if(nums[l]==0){
                    zerocount--;
                }
                l++;
            }
            maxlength=Math.max(maxlength,r-l+1);

        }
        return maxlength;
    }

    public static void main(String[] args) {
        int []nums={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        MaximumOnes s=new MaximumOnes();
        System.out.println(s.longestOnes(nums,k));
    }
}
