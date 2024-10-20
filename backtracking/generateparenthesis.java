package backtracking;

import java.util.ArrayList;
import java.util.List;

public class generateparenthesis {
    public static void main(String[] args) {
        int n=3;
        String s="";
        int open=0;
        int close=0;
        ArrayList<String>list=new ArrayList<>();
        List<String>c=parenthesis(n,open,close,s,list);
        System.out.println(c);

    }
    static List<String> parenthesis(int n,int open,int close,String s,List<String>list){
        if(s.length()==2*n){
            list.add(s);

        }

        if(open<n){
            parenthesis(n,open+1,close,s+"(",list);
        }
        if(close<open){
            parenthesis(n,open,close+1,s+")",list);
        }
        return list;
    }

}
