package Arrays;

public class longestsubarray {
    public int getLongestSubarray(int[] arr, int k) {
        int n = arr.length;
        int length = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    length = Math.max(length, j - i + 1);
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
       longestsubarray soln = new longestsubarray();
        int[] arr = {2, 3, 5, 1, 9};
        int k = 10;
        System.out.println("The length of the longest subarray is: " + soln.getLongestSubarray(arr, k));
    }
}

