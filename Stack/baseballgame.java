package Stack;

import java.util.*;

class baseballgame
{
    public int calPoints(String[] operations) {
        // Use a stack to track valid points
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("C")) {
                stack.pop();  // Remove the last valid score
            } else if (op.equals("D")) {
                // Double the last valid score and push to stack
                stack.push(stack.peek() * 2);
            } else if (op.equals("+")) {
                // Sum the last two valid scores and push to stack
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);  // Push the top element back
                stack.push(newTop);  // Push the new score
            } else {
                // Parse the string to an integer and push to stack
                stack.push(Integer.parseInt(op));
            }
        }

        // Calculate the total sum of the stack
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }

    public static void main(String[] args) {
        baseballgame soln = new baseballgame();
        String[] ops = {"5", "2", "C", "D", "+"};
        System.out.println(soln.calPoints(ops));  // Expected output: 30
    }
}

