package SlidingWindow;
import java.util.*;
public class maximumwindowsubstring {
    public int[] maxSlidingWindow(int[]nums,int k){
        int n=nums.length;
        int ri=0;
        int[]r=new int [n-k+1];
        Deque<Integer>q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(!q.isEmpty()&&q.peekFirst()==i-k){
                q.pollFirst();
            }
            while(!q.isEmpty()&&nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }
            q.offerLast(i);
            if(i>=k-1){
                r[ri++]=nums[q.peekFirst()];
            }
        }
        return r;
    }
    public static void main(String[] args) {
        // Test case 1
        maximumwindowsubstring soln=new maximumwindowsubstring();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(soln.maxSlidingWindow(nums, k)));
    }
}
