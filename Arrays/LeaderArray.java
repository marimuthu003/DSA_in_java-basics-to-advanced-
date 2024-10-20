package Arrays;

class LeaderArray {
    public int[] leaderArray(int[] arr, int n) {
        int[] leader = new int[n];
        int max = arr[n - 1];
        leader[0] = max;
        int index = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leader[index++] = max;
            }
        }
        int[] result = new int[index];
        System.arraycopy(leader, 0, result, 0, index);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 20, 6};
        int n = arr.length;
        LeaderArray la = new LeaderArray();
        int[] result = la.leaderArray(arr, n);
        System.out.println("Leaders in the array: ");
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}

