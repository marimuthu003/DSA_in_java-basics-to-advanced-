package Arrays;
import java.util.*;
class SecondLargestSmallest {
    public int[] findSecondLargestAndSmallest(int[] arr) {
        int n = arr.length;
        int secondSmall = Integer.MAX_VALUE, small = Integer.MAX_VALUE;
        int secondLarge = Integer.MIN_VALUE, large = Integer.MIN_VALUE;
        for (int i : arr) {
            small = Math.min(small, i);
            large = Math.max(large, i);
        }
        for (int i : arr) {
            if (i < secondSmall && i != small) {
                secondSmall = i;
            } else if (i > secondLarge && i != large) {
                secondLarge = i;
            }
        }
        return new int[]{secondLarge, secondSmall};
    }

    public static void main(String[] args) {
        SecondLargestSmallest soln = new SecondLargestSmallest();
        int[] arr = {1, 2, 4, 6, 5, 7};
        int[] result = soln.findSecondLargestAndSmallest(arr);
        System.out.println(Arrays.toString(result));
    }
}

