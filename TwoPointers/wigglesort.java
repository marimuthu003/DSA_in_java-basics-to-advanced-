package TwoPointers;

import java.util.Arrays;

class wigglesort {
    public void wiggleSort(int[] nums) {
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        int n = nums.length;
        int mid = (n - 1) / 2; // Middle of the sorted array
        int end = n - 1;       // End of the sorted array

        // Place elements in wiggle pattern
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = sorted[mid--]; // Place smaller values on even indices
            } else {
                nums[i] = sorted[end--]; // Place larger values on odd indices
            }
        }
    }
    public static void main(String[] args) {
        wigglesort solution = new wigglesort();
        int[] nums = {5, 5, 5, 4, 4, 4, 4};
        solution.wiggleSort(nums);
        System.out.println(Arrays.toString(nums)); // Expected output: [4, 5, 4, 5, 4, 5, 4]
    }

}
