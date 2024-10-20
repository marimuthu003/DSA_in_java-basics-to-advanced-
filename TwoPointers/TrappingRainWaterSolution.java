package TwoPointers;

import java.util.Arrays;

class TrappingRainWaterSolution {
    public int trap(int[] height) {
        int n = height.length;
        int lWall = 0;
        int rWall = 0;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];

        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            maxLeft[i] = lWall;
            maxRight[j] = rWall;
            lWall = Math.max(lWall, height[i]);
            rWall = Math.max(rWall, height[j]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int pot = Math.min(maxLeft[i], maxRight[i]);
            sum += Math.max(0, pot - height[i]);
        }

        return sum;
    }

    public static void main(String[] args) {
        TrappingRainWaterSolution solution = new TrappingRainWaterSolution();
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = solution.trap(height);
        System.out.println("Trapped Rain Water: " + result);
    }
}

