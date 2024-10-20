package BinarySearch;

import java.util.*;

class KokoEatingBananas {
    public int totalHours(int[] piles, int k) {
        int totalhr = 0;
        for (int pile : piles) {
            totalhr += Math.ceil((double)pile / k);
        }
        return totalhr;
    }

    public int findMax(int[] piles) {
        int maxi = Integer.MIN_VALUE;
        for (int pile : piles) {
            maxi = Math.max(maxi, pile);
        }
        return maxi;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);

        while (low <= high) {
            int mid = (low + high) / 2;
            int total = totalHours(piles, mid);

            if (total <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        KokoEatingBananas sol = new KokoEatingBananas();
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println(sol.minEatingSpeed(piles, h));  // Output: 4
    }
}

