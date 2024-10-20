package BinarySearch;

class SingleElementFinder {
    public int findSingle(int[] arr, int n) {
        if (n == 1) return arr[0];
        if (arr[0] != arr[1]) return arr[0];
        if (arr[n - 2] != arr[n - 1]) return arr[n - 1];

        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            }
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SingleElementFinder finder = new SingleElementFinder();
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(finder.findSingle(arr, arr.length));  // Output: 2
    }
}
