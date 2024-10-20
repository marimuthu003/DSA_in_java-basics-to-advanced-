package Arrays;

class ReverseVowels {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = s.length() - 1;
        String vowels = "aeiouAEIOU";
        while (l < r) {
            if (vowels.indexOf(arr[l]) >= 0 && vowels.indexOf(arr[r]) >= 0) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
            if (vowels.indexOf(arr[l]) < 0) l++;
            if (vowels.indexOf(arr[r]) < 0) r--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        ReverseVowels soln = new ReverseVowels();
        String s = "hello";
        System.out.println(soln.reverseVowels(s));
    }
}

