package SlidingWindow;
import java.util.*;
public class Containsduplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int j=map.get(nums[i]);
                if(Math.abs(i-j)<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }

    public static void main(String[] args) {
        Containsduplicate solution = new Containsduplicate();

        // Test Cases
        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        System.out.println(solution.containsNearbyDuplicate(nums1, k1));

        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        System.out.println(solution.containsNearbyDuplicate(nums2, k2)); // Output: true

        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;
        System.out.println(solution.containsNearbyDuplicate(nums3, k3));
    }
}
