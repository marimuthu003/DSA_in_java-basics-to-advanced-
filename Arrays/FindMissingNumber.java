package Arrays;

class FindMissingNumber {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int sum = N * (N + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return sum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        FindMissingNumber fn = new FindMissingNumber();
        int missing = fn.missingNumber(arr);
        System.out.println("Missing number: " + missing);
    }
}

