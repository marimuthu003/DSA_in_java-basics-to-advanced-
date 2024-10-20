package Arrays;

class SquareRoot {
    public double findSquareRoot(int num) {
        int start = 0, end = num;
        double ans = 0;
        while (start <= end) {
            double mid = (start + end) / 2.0;
            double square = mid * mid;
            if (square == num) {
                return mid;
            } else if (square < num) {
                ans = mid;
                start++;
            } else {
                end--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        SquareRoot soln = new SquareRoot();
        int num = 11;
        System.out.println(soln.findSquareRoot(num));
    }
}

