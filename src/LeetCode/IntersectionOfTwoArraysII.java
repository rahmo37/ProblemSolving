package LeetCode;

import java.util.Arrays;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] arr1 = {1000, 1000, 1000};
        int[] arr2 = {1000, 1000};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {


        int[] values = new int[1001];
        int k = 0;
        int[] answer = new int[1001];

        for (int n : nums1) {
            values[n]++;
        }

        for (int n : nums2) {
            if (values[n] != 0) {
                values[n]--;
                answer[k++] = n;
            }

        }
        return Arrays.copyOfRange(answer, 0, k);
    }
}
