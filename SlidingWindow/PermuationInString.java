package SlidingWindow;

import java.util.HashMap;

public class PermuationInString {
    public Boolean permutation(String s1, String s2) {
        HashMap<Character,Integer>need=new HashMap<>();
        HashMap<Character,Integer>have=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(need.containsKey(c)) need.put(c,need.get(c)+1);
            need.put(c,1);
        }
        int start=0;
        int end=0;
        while(end<s2.length()){
            char startchar=s2.charAt(start);
            if(need.containsKey(startchar)){
                if(have.containsKey(startchar)){
                    have.put(startchar,have.get(startchar)+1);
                }
                else{
                    have.put(startchar,1);
                }
                int windowsize=end-start+1;
                if(windowsize==s1.length()) return true;
            }
            else{
                start=end+1;
                have.clear();
            }
            end+=1;
        }
        return false;
    }

    public static void main(String[] args) {
        PermuationInString obj = new PermuationInString();
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(obj.permutation(s1, s2));  // Output: true
    }
}
