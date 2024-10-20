package BinarySearch;

class FindMinimumrotatedsortedarray {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        FindMinimumrotatedsortedarray soln = new FindMinimumrotatedsortedarray();
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(soln.findMin(nums));  // Output: 1
    }
}
