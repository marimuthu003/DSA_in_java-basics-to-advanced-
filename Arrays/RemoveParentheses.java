package Arrays;

class RemoveParentheses {
    public String removeOuterParentheses(String s) {
        StringBuilder arr = new StringBuilder();
        int openCount = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (openCount > 0) {
                    arr.append(c);
                }
                openCount++;
            } else {
                openCount--;
                if (openCount > 0) {
                    arr.append(c);
                }
            }
        }
        return arr.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        RemoveParentheses rp = new RemoveParentheses();
        String result = rp.removeOuterParentheses(s);
        System.out.println("Result: " + result);
    }
}
