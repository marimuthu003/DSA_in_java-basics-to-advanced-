package Arrays;

import java.util.Arrays;

class Candy {
    public int candy(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr, 1);

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] < nums[i]) {
                arr[i] = arr[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                arr[i] = Math.max(arr[i], arr[i + 1] + 1);
            }
        }

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Candy soln = new Candy();
        int[] nums = {1, 2, 6, 5};
        int result = soln.candy(nums);
        System.out.println(result);
    }
}

