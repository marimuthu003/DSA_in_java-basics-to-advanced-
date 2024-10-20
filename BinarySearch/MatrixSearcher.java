package BinarySearch;

class MatrixSearcher {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int total = m * n;
        int left = 0, right = total - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int i = mid / n;  // Row index
            int j = mid % n;  // Column index
            int val = matrix[i][j];

            if (val == target) {
                return true;
            } else if (val < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        MatrixSearcher searcher = new MatrixSearcher();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        System.out.println(searcher.searchMatrix(matrix, target));  // Output: true
    }
}

