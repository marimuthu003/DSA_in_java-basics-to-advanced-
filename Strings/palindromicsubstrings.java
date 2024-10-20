package Strings;


public class palindromicsubstrings {
    public static void main(String[] args) {
        String s="abacabadffgf";
        findpalindrome(s);

    }
    static void findpalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<=end) {
            if (start == end) {
                start++;
                end = s.length() - 1;
            }
            String sub = s.substring(start, end + 1);
            Boolean val = checkpalindrome(sub);
            if (val == true) {
                if(sub.length()>1) {
                    System.out.println(sub);
                }
            }
            end--;
        }
    }

    static Boolean checkpalindrome(String sub){
        int start=0;
        int end=sub.length()-1;

        while(start<=end){
            if(sub.charAt(start)!=sub.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
