package Arrays;

class MoveZeros {
    public void moveZeros(int[] arr, int n) {
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        for (int i = index; i < n; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;
        MoveZeros mz = new MoveZeros();
        mz.moveZeros(arr, n);
        System.out.println("Array after moving zeros: ");
        for (int r : arr) {
            System.out.print(r + " ");
        }
    }
}

