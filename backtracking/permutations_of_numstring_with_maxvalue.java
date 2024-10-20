package backtracking;

public class permutations_of_numstring_with_maxvalue {
    static String s="11:25";
    static int maxhour=Integer.MIN_VALUE;
    static int maxmin=Integer.MIN_VALUE;
    public static void main(String[] args) {
        find("",s.substring(0,2)+s.substring(3));
        System.out.println(maxhour+":"+maxmin);
    }
    static void find(String c,String s){
        if(s.length()==0){
            int hour=Integer.parseInt(c.substring(0,2));
            int min=Integer.parseInt(c.substring(2));
            if(hour<24) {
                if (hour > maxhour) {
                    maxhour = hour;
                }
            }
            if(min<60){
                if(min>maxmin){
                    maxmin=min;
                }
            }

            return;

        }
        for (int i=0;i<s.length();i++){
            find(c+s.charAt(i),s.substring(0,i)+s.substring(i+1));
        }
    }
}
