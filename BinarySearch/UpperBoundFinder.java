package BinarySearch;

class UpperBoundFinder {
    public int upperBound(int[] arr, int n, int x) {
        int low = 0, high = n - 1, ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        UpperBoundFinder ub = new UpperBoundFinder();
        int[] arr = {3, 5, 8, 15, 19};
        int x = 6;
        System.out.println("The Upper bound is the index: " + ub.upperBound(arr, arr.length, x));
    }
}
