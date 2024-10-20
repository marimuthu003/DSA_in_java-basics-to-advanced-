package BinarySearch;

class SearchInsertPosition {
    public int searchInsert(int[] arr, int x) {
        int n = arr.length;  // size of the array
        int low = 0;
        int high = n - 1;
        int ans = n;  // default to the end of the array

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = mid;  // potential answer
                high = mid - 1;  // look for smaller index on the left
            } else {
                low = mid + 1;  // look on the right
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        SearchInsertPosition searcher = new SearchInsertPosition();
        int[] arr = {1, 2, 4, 7};
        int x = 6;
        int ind = searcher.searchInsert(arr, x);
        System.out.println("The index is: " + ind);
    }
}
