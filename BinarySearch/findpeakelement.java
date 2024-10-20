package BinarySearch;

class findpeakelement {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;

        while (l < r) {
            int mid = (l + r) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // If the middle element is greater than the next element,
                // then the peak lies on the left side (including mid).
                r = mid;
            } else {
                // If the middle element is less than the next element,
                // then the peak lies on the right side.
                l = mid + 1;
            }
        }
        // l and r will converge to the peak element
        return l;
    }
    public static void main(String[] args) {
        findpeakelement solution = new findpeakelement();

        // Test case 1
        int[] nums1 = {1, 2, 3, 1};
        int peakIndex1 = solution.findPeakElement(nums1);
        System.out.println("Peak element index: " + peakIndex1);  // Output: 2

        // Test case 2
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        int peakIndex2 = solution.findPeakElement(nums2);
        System.out.println("Peak element index: " + peakIndex2);  // Output could be 1 or 5
    }
}

