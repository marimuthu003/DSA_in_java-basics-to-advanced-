package BinarySearch;

import java.util.*;

class MedianFinder {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] res = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                res[k++] = nums1[i++];
            } else {
                res[k++] = nums2[j++];
            }
        }
        while (i < m) res[k++] = nums1[i++];
        while (j < n) res[k++] = nums2[j++];

        int len = res.length;
        if (len % 2 == 0) {
            return (res[len / 2 - 1] + res[len / 2]) / 2.0;
        } else {
            return res[len / 2];
        }
    }

    public static void main(String[] args) {
        MedianFinder soln = new MedianFinder();
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(soln.findMedianSortedArrays(nums1, nums2));  // Output: 2.5
    }
}
