package Strings;

public class validparenthesis {

    public static void main(String[] args) {
        String testString = "()()";
        System.out.println(check(testString));
    }

    static boolean check(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        int openCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(') {
                openCount++;
            } else if (currentChar == ')') {
                openCount--;

                if (openCount < 0) {
                    return false;
                }
            }
        }

        return openCount == 0;
    }
}

