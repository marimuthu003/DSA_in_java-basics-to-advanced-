package Arrays;

class validanagram {
    public boolean isAnagram(String s, String t) {
        // If lengths of the strings are not equal, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create a frequency array for all lowercase letters
        int[] charCount = new int[26];  // There are 26 letters in the alphabet

        // Increment for characters in string 's' and decrement for characters in string 't'
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        // If all counts are zero, then the strings are anagrams
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        validanagram soln = new validanagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(soln.isAnagram(s, t));  // Expected output: true

        String s2 = "rat";
        String t2 = "car";
        System.out.println(soln.isAnagram(s2, t2));  // Expected output: false
    }
}

