package Arrays;

class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        char[] c = s.toCharArray();
        int len = c.length;

        String[] arr = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = "";
        }

        boolean down = true;
        int row = 0;

        for (int i = 0; i < len; ++i) {
            arr[row] += c[i];

            if (row == numRows - 1) {
                down = false;
            } else if (row == 0) {
                down = true;
            }

            if (down) {
                row++;
            } else {
                row--;
            }
        }

        String result = "";
        for (int i = 0; i < numRows; i++) {
            result += arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        ZigZagConversion soln = new ZigZagConversion();
        System.out.println(soln.convert(s, numRows));
    }
}
