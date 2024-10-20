package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation_of_array {
    static int[] arr = {1, 2, 3};

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        find(list, new ArrayList<>(), arr);

        System.out.println(list);
    }

    static void find(List<List<Integer>> list, ArrayList<Integer> current, int[] arr) {
        if (arr.length == 0) {

            list.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            int[] rem1 = Arrays.copyOfRange(arr, 0, i);
            int[] rem2 = Arrays.copyOfRange(arr, i + 1, arr.length);


            int[] remaining = new int[rem1.length + rem2.length];

            for (int j = 0; j < rem1.length; j++) {
                remaining[j] = rem1[j];
            }
            for (int k = 0; k < rem2.length; k++) {
                remaining[rem1.length + k] = rem2[k];
            }


            current.add(arr[i]);


            find(list, current, remaining);


            current.remove(current.size() - 1);
        }
    }
}
