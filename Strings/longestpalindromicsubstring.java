package Strings;

class longestpalindromicsubstring {
    public static void main(String[] args) {
        longestpalindromicsubstring soln=new longestpalindromicsubstring();
        String s="babad";
        System.out.println(soln.longestPalindrome(s));

    }
    public String longestPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        int maxi=Integer.MIN_VALUE;
        String longestpal="";

        while(start<=end){
            if(start==end){
                start++;
                end=s.length()-1;
            }
            String sub=s.substring(start,end+1);
            Boolean val=checkpalindrome(sub);
            if(val==true){
                if(sub.length()>maxi){
                    maxi=sub.length();
                    longestpal=sub;
                }
            }
            end--;

        }
        return longestpal;
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
