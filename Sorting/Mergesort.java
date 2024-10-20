package Sorting;

public class Mergesort {

    void mergesort(int[] arr) {
        int n = arr.length;

        // Base condition: if array has less than 2 elements, return
        if (n < 2) {
            return;
        }

        // Find the middle point to divide the array into two halves
        int mid = n / 2;

        // Create left and right subarrays
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // Copy elements into the left and right subarrays
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }

        // Recursively sort the left and right halves
        mergesort(left);
        mergesort(right);

        // Merge the sorted halves
        merge(arr, left, right);
    }

    // Merge function to combine the sorted left and right arrays
    void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merging the arrays while comparing elements
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements of left[], if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements of right[], if any
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 3, 5, 1, 7};
        Mergesort obj = new Mergesort();
        obj.mergesort(arr);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
