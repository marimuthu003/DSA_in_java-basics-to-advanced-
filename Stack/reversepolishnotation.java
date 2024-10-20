package Stack;

import java.util.*;

class reversepolishnotation {
    public int evalRPN(String[] tokens) {
        // Stack to store intermediate results
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            // Check if the token is an operator
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = stack.pop();  // Second operand
                int a = stack.pop();  // First operand

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        // Perform division and truncate towards zero
                        stack.push(a / b);
                        break;
                }
            } else {
                // If the token is a number, push it onto the stack
                stack.push(Integer.parseInt(token));
            }
        }

        // The result will be the only number left in the stack
        return stack.pop();
    }

    public static void main(String[] args) {
        reversepolishnotation soln = new reversepolishnotation();
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(soln.evalRPN(tokens));  // Expected output: 9
    }
}

