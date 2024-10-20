package Strings;

import java.util.*;

class ReverseStringSolution {
    public void reverseString(char[] s) {
        // Helper recursive function to reverse the string in-place
        reverseHelper(s, 0, s.length - 1);
    }

    // Recursive function to reverse the string
    private void reverseHelper(char[] s, int left, int right) {
        if (left < right) {
            // Swap the characters at positions left and right
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Recursive call for the next set of characters
            reverseHelper(s, left + 1, right - 1);
        }
    }

    public static void main(String[] args) {
        ReverseStringSolution soln = new ReverseStringSolution();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        soln.reverseString(s);
        System.out.println(Arrays.toString(s));  // Expected output: [o, l, l, e, h]
    }
}
