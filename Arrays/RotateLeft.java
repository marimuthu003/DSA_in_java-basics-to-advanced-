package Arrays;

class RotateLeft {
    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotateLeft(int[] arr, int n, int k) {
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 2;
        RotateLeft rl = new RotateLeft();
        rl.rotateLeft(arr, n, k);
        System.out.println("Array after left rotation: ");
        for (int r : arr) {
            System.out.print(r + " ");
        }
    }
}

