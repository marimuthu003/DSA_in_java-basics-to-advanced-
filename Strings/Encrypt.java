package Strings;

public class Encrypt {

    public String changing(String s) {
        char[] res = s.toCharArray();

        // First pass for lowercase letters
        for (int i = 0; i < res.length; i++) {
            if (Character.isLowerCase(res[i])) {
                // Reverse the letter within lowercase alphabet
                res[i] = (char) ('a' + ('z' - res[i]));
            }
        }

        // Second pass for uppercase letters
        for (int i = 0; i < res.length; i++) {
            if (Character.isUpperCase(res[i])) {
                // Reverse the letter within uppercase alphabet
                res[i] = (char) ('A' + ('Z' - res[i]));
            }
        }

        return new String(res);
    }

    public static void main(String[] args) {
        String s = "abc ABC";
        Encrypt obj = new Encrypt();
        String res = obj.changing(s);
        System.out.println(res); // Output should be: "zyx ZYX"
    }
}
