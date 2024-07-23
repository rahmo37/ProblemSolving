package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 6, 7, 0, 0, 0};
        int m = 4;  // Number of initialized elements in nums1
        int[] nums2 = {1, 2, 3};
        int n = 3;  // Number of elements in nums2
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        // Start from the last element in nums1 that should contain the final elements
//        int i = m - 1; // Last index of the initial part of nums1
//        int j = n - 1; // Last index of nums2
//        int k = m + n - 1; // Last index of nums1 where the merged array should end
//
//        // Merge in reverse order
//        while (i >= 0 && j >= 0) {
//            if (nums1[i] > nums2[j]) {
//                nums1[k--] = nums1[i--];
//            } else {
//                nums1[k--] = nums2[j--];
//            }
//        }
//
//        // If there are remaining elements in nums2, fill them in nums1
//        while (j >= 0) {
//            nums1[k--] = nums2[j--];
//        }
//
//        // No need to handle the remaining elements of nums1, they are already in place
//        System.out.println(Arrays.toString(nums1));


//        Another solution
        int l = m - 1, r = n - 1, i = nums1.length - 1;
        while (r >= 0) {
            if (l >= 0 && nums1[l] > nums2[r]) {
                nums1[i] = nums1[l];
                l--;
            } else {
                nums1[i] = nums2[r];
                r--;
            }
            i--;
        }
        System.out.println(Arrays.toString(nums1));
    }


}
