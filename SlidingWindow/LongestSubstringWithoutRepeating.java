package SlidingWindow;
import java.util.*;
public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int n=s.length();
        int maxlength=0;
        HashSet<Character>set=new HashSet<>();
        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            maxlength=Math.max(maxlength,r-l+1);
            set.add(s.charAt(r));
        }
        return maxlength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        LongestSubstringWithoutRepeating c=new LongestSubstringWithoutRepeating();
        System.out.println(c.lengthOfLongestSubstring(s));
    }
}
