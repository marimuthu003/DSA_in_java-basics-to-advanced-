package Arrays;

import java.util.HashMap;

public class onerep {
    public int rep(int[] arr) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int num : arr) {
            hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (hashmap.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        onerep soln = new onerep();
        int[] arr = {2, 2, 1};
        System.out.println(soln.rep(arr));
    }
}
