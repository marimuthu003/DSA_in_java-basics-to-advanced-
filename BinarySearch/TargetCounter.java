package BinarySearch;

class OccurrenceFinder {

    // Method to find the first occurrence of the target in the array
    public int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int firstPos = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                firstPos = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return firstPos;
    }

    // Method to find the last occurrence of the target in the array
    public int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int lastPos = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                lastPos = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return lastPos;
    }

    // Method to get both the first and last positions of the target in the array
    public int[] firstAndLastPosition(int[] arr, int target) {
        int first = firstOccurrence(arr, target);
        if (first == -1) {
            return new int[] {-1, -1};
        }
        int last = lastOccurrence(arr, target);
        return new int[] {first, last};
    }

    // Method to count occurrences of the target in the array
    public int countOccurrences(int[] arr, int target) {
        int[] positions = firstAndLastPosition(arr, target);
        if (positions[0] == -1) {
            return 0;
        }
        return positions[1] - positions[0] + 1;
    }
}

public class TargetCounter {
    public static void main(String[] args) {
        OccurrenceFinder finder = new OccurrenceFinder();
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int target = 8;
        int count = finder.countOccurrences(arr, target);
        System.out.println("Count of " + target + ": " + count);
    }
}

