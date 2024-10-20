class happynumber {
    // Function to calculate the sum of the squares of the digits of a number
    int digitSquareSum(int n) {
        int sum = 0, tmp;
        while (n > 0) {  // Loop while n is greater than 0
            tmp = n % 10;  // Get the last digit
            sum += tmp * tmp;  // Add the square of the digit to the sum
            n /= 10;  // Remove the last digit from n
        }
        return sum;  // Return the sum of squares
    }

    // Function to check if a number is a happy number
    public boolean isHappy(int n) {
        int slow = n, fast = n;

        // Use Floyd's Cycle Detection algorithm (tortoise and hare)
        do {
            slow = digitSquareSum(slow);  // Move slow pointer by one step
            fast = digitSquareSum(fast);  // Move fast pointer by two steps
            fast = digitSquareSum(fast);
        } while (slow != fast);  // Loop until slow and fast meet

        // If the meeting point is 1, then it's a happy number
        return slow == 1;
    }

    public static void main(String[] args) {
        happynumber solution = new happynumber();
        int n = 19;  // Test input
        boolean result = solution.isHappy(n);
        System.out.println("Is " + n + " a happy number? " + result);
    }
}
