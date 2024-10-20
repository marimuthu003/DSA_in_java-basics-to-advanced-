package Intervals;

public class longestconsequtivecharacters {
    public static void main(String[] args) {
        String s="acbeghjkd";
        System.out.println(longest(s));
    }
    static int longest(String s){
        int[]numline=new int[26];
        for(int i=0;i<s.length();i++){
            numline[s.charAt(i)-'a']=1;
        }
        int count=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<numline.length;i++){
            if(numline[i]==1){
                count++;
                maxi=Math.max(maxi,count);
            }
            else{
                count=0;
            }
        }
        return maxi;
    }
}