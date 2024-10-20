package backtracking;

public class keypadmobilecombination {
    static String[] combination=new String[]{"abc","def","ghi","jkl","nmo","pqr","stu","vwx","yz"};

    public static void main(String[] args) {
        String ip="12";
        find("",ip,0);
    }
    static  void find(String s,String ip,int index){
        if (ip.length()==s.length()){
            System.out.println(s);
            return;
        }

        int c =ip.charAt(index)-'1';
        String word=combination[c];
        char[] ch=word.toCharArray();
        for(int i=0;i<ch.length;i++){
            find(s+ch[i],ip,index+1);
        }
    }
}
