package backtracking;

public class permutation_of_string {
    static String s="abc";
    public static void main(String[] args) {
        find("",s);
    }
    static void find(String c,String s){
        if(s.length()==0){
            System.out.println(c);
            return;
        }
        for (int i=0;i<s.length();i++){
            find(c+s.charAt(i),s.substring(0,i)+s.substring(i+1));
        }
    }
}
