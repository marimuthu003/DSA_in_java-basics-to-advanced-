package SlidingWindow;

public class MaximumAverage {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxAverage = Integer.MIN_VALUE; // Use double for maxAverage

        // Calculate the sum of the first 'k' elements
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxAverage = sum * 1.0 / k; // Initial average

        // Slide the window
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i]; // Update sum by sliding window
            double avg = sum * 1.0 / k; // Calculate average of current window
            maxAverage = Math.max(maxAverage, avg); // Update maxAverage if needed
        }

        return maxAverage;
    }

    public static void main(String[] args) {
        MaximumAverage s = new MaximumAverage();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double res = s.findMaxAverage(nums, k);
        System.out.println(res); // Should print 12.75
    }
}
