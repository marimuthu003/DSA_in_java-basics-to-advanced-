package BinarySearch;
class FloorCeilFinder {

    public int findFloor(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] <= x) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public int findCeil(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= x) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public int[] getFloorAndCeil(int[] arr, int n, int x) {
        int floor = findFloor(arr, n, x);
        int ceil = findCeil(arr, n, x);
        return new int[]{floor, ceil};
    }
}

public class FloorCeilMain {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int n = arr.length;
        int x = 5;

        FloorCeilFinder finder = new FloorCeilFinder();
        int[] result = finder.getFloorAndCeil(arr, n, x);

        System.out.println("Floor and Ceil is: " + result[0] + " " + result[1]);
    }
}
