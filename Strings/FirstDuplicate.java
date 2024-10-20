package Strings;

public class FirstDuplicate {

    public static void main(String[] args) {
        String s = "abcddc";
        System.out.println("First duplicate character: " + find(s));
    }

    static char find(String s) {
        int[] freq = new int[26]; // For letters 'a' to 'z'

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a'; // Get index for 'a' to 'z'

            freq[index]++; // Increment frequency count

            if (freq[index] > 1) {
                return s.charAt(i); // Return the first duplicate character
            }
        }

        return '\0'; // Return null character if no duplicates found
    }
}

