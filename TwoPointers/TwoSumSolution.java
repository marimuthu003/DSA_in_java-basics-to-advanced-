package TwoPointers;
import java.util.List;
import java.util.ArrayList;

class TwoSumSolution {
    public List<Integer> twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return List.of(left + 1, right + 1);
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return List.of(-1, -1); // return -1 if no solution found
    }

    public static void main(String[] args) {
        TwoSumSolution solution = new TwoSumSolution();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        List<Integer> result = solution.twoSum(numbers, target);
        System.out.println("Two Sum Indices: " + result);
    }
}
