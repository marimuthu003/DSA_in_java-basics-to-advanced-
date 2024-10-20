package SlidingWindow;
import java.util.*;
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxCount = 0;
        int longest = 0;
        int[] counts = new int[26];

        for (int r = 0; r < s.length(); r++) {
            maxCount = Math.max(maxCount, ++counts[s.charAt(r) - 'A']);
            while ((r - l + 1) - maxCount > k) {
                counts[s.charAt(l) - 'A']--;
                l++;
            }

            longest = Math.max(longest, r - l + 1);
        }

        return longest;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        LongestRepeatingCharacterReplacement soln = new LongestRepeatingCharacterReplacement();
        System.out.println(soln.characterReplacement(s, k));  // Output should be 4
    }
}
