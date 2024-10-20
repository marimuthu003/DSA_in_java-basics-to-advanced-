package backtracking;

import java.util.ArrayList;
import java.util.HashMap;

public class possible_combination_alphabets_printing {
    public static void main(String[] args) {
        String s = "121";
        HashMap<Integer, Character> map = new HashMap<>();
        for (char i = 'a'; i <= 'z'; i++) {
            map.put(i - 'a' + 1, i);
        }
        ArrayList<String> list = new ArrayList<>();
        System.out.println(possible(s, 0, list, map));
    }

    static int possible(String s, int index, ArrayList<String> list, HashMap<Integer, Character> map) {
        // Base case: if index reaches the end of the string, we have found a valid combination
        if (index == s.length()) {
            System.out.println(list);  // Print the current combination
            return 1;
        }

        // If the current character is '0', return 0 as no valid alphabet maps to '0'
        if (s.charAt(index) == '0') {
            return 0;
        }

        int val = 0;

        // Case 1: Single digit conversion (e.g., '1' -> 'a', '2' -> 'b', etc.)
        int digit1 = s.charAt(index) - '0';
        if (map.containsKey(digit1)) {
            char c = map.get(digit1);
            list.add("" + c);
            val += possible(s, index + 1, list, map); // Move to the next character
            list.remove(list.size() - 1); // Backtrack
        }

        // Case 2: Double digit conversion (e.g., '10' -> 'j', '26' -> 'z')
        if (index < s.length() - 1) {
            int digit2 = Integer.parseInt(s.substring(index, index + 2));
            if (digit2 <= 26 && map.containsKey(digit2)) {
                char c = map.get(digit2);
                list.add("" + c);
                val += possible(s, index + 2, list, map); // Skip two characters for double digit
                list.remove(list.size() - 1); // Backtrack
            }
        }

        return val;
    }
}
