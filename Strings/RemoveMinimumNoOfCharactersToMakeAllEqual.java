package Strings;

public class RemoveMinimumNoOfCharactersToMakeAllEqual {

    public static void main(String[] args) {
        String s = "abacad";
        System.out.println("Minimum characters to remove: " + calculateRemove(s));
    }

    static int calculateRemove(String s) {
        int[] freq = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            freq[index]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
            }
        }

        return s.length() - max;
    }
}
