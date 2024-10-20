package Arrays;

import java.util.List;

public class maximumheight {
    public int maximumTotalSum(List<Integer> maximumHeight) {
        int n = maximumHeight.size();

        // Adjust the list to ensure no consecutive numbers
        for (int i = 0; i < n; i++) {
            while (i > 0 && maximumHeight.get(i) - 1 == maximumHeight.get(i - 1)) {
                maximumHeight.set(i, maximumHeight.get(i) - 1);
            }
        }

        // Calculate the sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += maximumHeight.get(i);
        }

        return sum;
    }

    public static void main(String[] args) {
        maximumheight soln = new maximumheight();
        List<Integer> maximumHeight = List.of(2, 3, 4, 3);
        System.out.println(soln.maximumTotalSum(maximumHeight));
    }
}
