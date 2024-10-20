package TwoPointers;

public class MaximumWaterStorage {

    public int maxi(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int l = 0;
        int r = n - 1;

        while (l < r) {
            int h = Math.min(height[l], height[r]);
            int w = r - l;
            maxArea = Math.max(maxArea, h * w);

            // Move the pointer pointing to the shorter line
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        MaximumWaterStorage obj = new MaximumWaterStorage();
        int res = obj.maxi(height);
        System.out.println(res); // Output should be: 49
    }
}
