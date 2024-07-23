package LeetCode;

//        Remove all instances of a specified value val from the array.
//        Rearrange the array so that all elements not equal to val are moved to the front of the array.
//        Return the number of elements that are not equal to val (denoted as k).
//        After performing the operation, the first k elements of the array should not include val,
//        but they do not need to be sorted unless explicitly stated by the problem.
//        In the context of the problem statement you've provided, the focus is on the removal and counting

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();

        // Example 1
        int[] nums1 = {1, 5, 2, 0, 7, 8, 7};
        int val1 = 7;
        int k1 = solution.removeElement(nums1, val1);
        System.out.println("k1 = " + k1 + ", nums1 = " + Arrays.toString(nums1));

        // Example 2
        int[] nums2 = {3, 2, 2, 3};
        int val2 = 3;
        int k2 = solution.removeElement(nums2, val2);
        System.out.println("k2 = " + k2 + ", nums2 = " + Arrays.toString(nums2));
    }

    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for placing non-val elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) { //if any value of num[i] does not equals to the val
                nums[k] = nums[i]; //num[k] equals to num[i]
                k++;
            }
        }
        return k;
    }
}

