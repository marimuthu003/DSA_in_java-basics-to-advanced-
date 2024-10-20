package Strings;

class LengthofLastWordSolution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int length = 0;

        // Iterate from the end of the string
        for (int i = n - 1; i >= 0; i--) {
            // If the character is not a space, increase the length count
            if (s.charAt(i) != ' ') {
                length++;
            }
            // If we encounter a space after counting characters, return the length
            else if (length > 0) {
                return length;
            }
        }

        // Return the final length (in case the string ends without any spaces)
        return length;
    }

    public static void main(String[] args) {
        LengthofLastWordSolution soln = new LengthofLastWordSolution();
        String s = "Hello World";
        System.out.println(soln.lengthOfLastWord(s));  // Expected output: 5
    }
}
