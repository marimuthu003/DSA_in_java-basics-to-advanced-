package Strings;

import java.util.Arrays;

class LongestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        // If the input list is empty, return an empty string
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Sort the array of strings
        Arrays.sort(strs);

        // The first and last strings after sorting will help find the common prefix
        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;
        // Compare characters of the first and last string as long as they match
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        // The common prefix is the substring of the first string from 0 to i
        return first.substring(0, i);
    }

    public static void main(String[] args) {
        LongestCommonPrefixSolution soln = new LongestCommonPrefixSolution();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(soln.longestCommonPrefix(strs));  // Expected output: "fl"
    }
}
