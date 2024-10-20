package Strings;

class checkthestringisrotated{
    public boolean rotateString(String s, String goal) {
        // If lengths of s and goal are different, s cannot be a rotation of goal
        if (s.length() != goal.length()) {
            return false;
        }
        // Concatenate s with itself and check if goal is a substring of the result
        return (s + s).contains(goal);
    }

    public static void main(String[] args) {
        checkthestringisrotated soln = new checkthestringisrotated();
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(soln.rotateString(s, goal));  // Expected output: true
    }
}
