package backtracking;

public class possible_ways_combinations_in_number_alphabets {
    public static void main(String[] args) {
        String s="121";
        System.out.println(possible(s,0));
    }
    static int possible(String s,int index){
        if(index==s.length()){
            return 1;
        }
        if(index>s.length()){
            return 0;
        }
        if(s.charAt(index)=='0'){
            return 0;
        }

        int val=possible(s,index+1);
        val=val+possible(s,index+2);

        return val;
    }
}
