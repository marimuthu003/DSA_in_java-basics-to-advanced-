package Arrays;
public class largestodd {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (Integer.parseInt(String.valueOf(num.charAt(i))) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        largestodd soln = new largestodd();
        String num = "3252";
        System.out.println(soln.largestOddNumber(num));
    }
}
