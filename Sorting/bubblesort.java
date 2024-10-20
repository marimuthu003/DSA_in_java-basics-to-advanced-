package Sorting;

public class bubblesort {
    void bubble(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true; // Swap happened
                }
            }
            // If no two elements were swapped in the inner loop, then the array is sorted
            if (!swap) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1, 3};
        bubblesort obj = new bubblesort();
        obj.bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
