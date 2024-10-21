package Arrays;

class ArrayRotation {
    public void rotate(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        ArrayRotation ar = new ArrayRotation();
        ar.rotate(arr, n);
        System.out.println("Array after rotation: ");
        for (int r : arr) {
            System.out.print(r + " ");
        }
    }
}
//---//

