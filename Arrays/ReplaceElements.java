package Arrays;

import java.util.Arrays;

class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxSoFar = -1;
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxSoFar;
            maxSoFar = Math.max(maxSoFar, current);
        }
        return arr;
    }

    public static void main(String[] args) {
        ReplaceElements soln = new ReplaceElements();
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] res = soln.replaceElements(arr);
        System.out.println(Arrays.toString(res));
    }
}

