package Arrays;

import java.lang.Math;

class JudgeSquareSum {
    public boolean judgeSquareSum(int c) {
        if (c < 0) return false;
        int a = 0;
        int b = (int) Math.sqrt(c);
        while (a <= b) {
            int res = a * a + b * b;
            if (res == c) {
                return true;
            } else if (res < c) {
                a++;
            } else {
                b--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        JudgeSquareSum soln = new JudgeSquareSum();
        int c = 5;
        System.out.println(soln.judgeSquareSum(c));
    }
}

