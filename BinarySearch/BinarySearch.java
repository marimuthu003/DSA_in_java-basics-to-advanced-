package BinarySearch;

class BinarySearch {
    public int binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ind = bs.binarySearch(a, target);
        if (ind == -1) {
            System.out.println("The target is not present.");
        } else {
            System.out.println("The target is at index: " + ind);
        }
    }
}
