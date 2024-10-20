package Stack;

import java.util.*;

class validparenthesis {
    public boolean isValid(String s) {
        // Stack to track opening brackets
        Stack<Character> stack = new Stack<>();
        // HashMap to match closing brackets with their corresponding opening brackets
        Map<Character, Character> hashmap = new HashMap<>();
        hashmap.put(')', '(');
        hashmap.put(']', '[');
        hashmap.put('}', '{');

        // Loop through each character in the string
        for (char c : s.toCharArray()) {
            // If it's a closing bracket
            if (hashmap.containsKey(c)) {
                // Pop from the stack if not empty, else assign a dummy value
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                // If the popped element doesn't match the corresponding opening bracket
                if (topElement != hashmap.get(c)) {
                    return false;
                }
            } else {
                // If it's an opening bracket, push it onto the stack
                stack.push(c);
            }
        }

        // Return true if the stack is empty (all brackets matched), false otherwise
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        validparenthesis soln = new validparenthesis();
        String s = "()";
        System.out.println(soln.isValid(s));  // Expected output: true
    }
}
