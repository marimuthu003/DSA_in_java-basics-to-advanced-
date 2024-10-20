package backtracking;

public class maxsum_in_path_from_topleft_to_bottomright {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int i = 0;
        int j = 0;
        int row = mat.length;
        int col = mat[0].length;
        // Start with initial sum as mat[0][0]
        int sum = mat[i][j];
        // Call the function to calculate the maximum sum path
        int maxSum = maxSumPath(mat, i, j, row, col, sum);
        System.out.println(maxSum);
    }

    static int maxSumPath(int[][] mat, int i, int j, int row, int col, int sum) {
        // Base case: if we reach the bottom-right corner, return the sum
        if (i == row - 1 && j == col - 1) {
            return sum;
        }

        // If out of bounds, return a small number (invalid path)
        if (i >= row || j >= col) {
            return Integer.MIN_VALUE;
        }

        // Initialize rightSum and bottomSum with very small values (invalid paths)
        int rightSum = Integer.MIN_VALUE;
        int bottomSum = Integer.MIN_VALUE;

        // Recur for the right and bottom moves and add their respective values
        if (j < col - 1) {
            rightSum = maxSumPath(mat, i, j + 1, row, col, sum + mat[i][j + 1]);
        }
        if (i < row - 1) {
            bottomSum = maxSumPath(mat, i + 1, j, row, col, sum + mat[i + 1][j]);
        }

        // Return the maximum of the two possible paths
        return Math.max(rightSum, bottomSum);
    }
}
