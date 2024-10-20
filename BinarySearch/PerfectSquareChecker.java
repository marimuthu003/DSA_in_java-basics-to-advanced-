package BinarySearch;

class PerfectSquareChecker {
    public boolean isPerfectSquare(int num) {
        int l = 1, r = num;
        while (l <= r) {
            int mid = (l + r) / 2;
            int m = mid * mid;
            if (num == m) {
                return true;
            } else if (m < num) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PerfectSquareChecker checker = new PerfectSquareChecker();
        int num = 16;  // Example input
        boolean result = checker.isPerfectSquare(num);
        System.out.println("Is perfect square: " + result);
    }
}

