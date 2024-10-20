package Strings;

class ReverseWordsSolution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();  // Convert string to character array
        int l = 0;  // Left pointer to track the beginning of each word

        for (int r = 0; r <= arr.length; r++) {
            // Check if we reached a space or the end of the string
            if (r == arr.length || arr[r] == ' ') {
                int temp_l = l;
                int temp_r = r - 1;

                // Reverse the characters between the current word
                while (temp_l < temp_r) {
                    char temp = arr[temp_l];
                    arr[temp_l] = arr[temp_r];
                    arr[temp_r] = temp;
                    temp_l++;
                    temp_r--;
                }

                // Move left pointer to the start of the next word
                l = r + 1;
            }
        }

        // Convert the character array back to a string
        return new String(arr);
    }

    public static void main(String[] args) {
        ReverseWordsSolution soln = new ReverseWordsSolution();
        String s = "Let's take LeetCode contest";
        System.out.println(soln.reverseWords(s));  // Expected output: "s'teL ekat edoCteeL tsetnoc"
    }
}

