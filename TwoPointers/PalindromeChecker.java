package TwoPointers;

class PalindromeChecker {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        String testString = "A man, a plan, a canal: Panama";
        boolean result = checker.isPalindrome(testString);
        System.out.println("Is Palindrome: " + result);
    }
}

