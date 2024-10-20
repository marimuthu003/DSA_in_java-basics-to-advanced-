package Strings;

import java.util.*;

class IsomorphicChecker {
    public boolean isIsomorphic(String s, String t) {
        // Two HashMaps to store mappings between characters of s and t
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        // Iterate through characters of both strings
        for (int i = 0; i < s.length(); i++) {
            char char1 = s.charAt(i);
            char char2 = t.charAt(i);

            // Check if char1 is already mapped in map1
            if (map1.containsKey(char1)) {
                if (map1.get(char1) != char2) {
                    return false;
                }
            }

            // Check if char2 is already mapped in map2
            if (map2.containsKey(char2)) {
                if (map2.get(char2) != char1) {
                    return false;
                }
            }

            // Add the new mapping in both maps
            map1.put(char1, char2);
            map2.put(char2, char1);
        }

        // If we have passed through all characters without conflict, return true
        return true;
    }

    public static void main(String[] args) {
        IsomorphicChecker checker = new IsomorphicChecker();
        String s = "egg";
        String t = "add";
        System.out.println(checker.isIsomorphic(s, t));  // Expected output: true
    }
}

