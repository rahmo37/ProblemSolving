package LeetCode;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] nums = {2, -5, -2, -4, 3};
        System.out.println(maxProduct(nums));
    }

    private static int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int temp = max;  // store the max because before updating min your max will already be updated

            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            System.out.println(max + " " + min);
            if (max > ans) {
                ans = max;
            }
        }

        return ans;
    }
}

//Explanation...
//
//        Start with the First Element: It begins by assuming the first element of the array is the smallest (min), the largest (max), and the answer (ans) to the maximum product subarray problem.
//
//        Loop Through Each Element: It then goes through each element in the array starting from the second element.
//
//        Calculate Potential Products: For each element, it calculates three potential products:
//
//        The product of the current element and the previous maximum product.
//        The product of the current element and the previous minimum product.
//        The current element itself.
//        Update Maximum and Minimum: It updates the maximum and minimum product tracked so far with the maximum and minimum of these three potential products, respectively. This is crucial because the maximum product could come from the multiplication of two negative numbers, which would give a positive result.
//
//        Keep a Temporary Maximum: Before updating the minimum product, it keeps a temporary copy of the current maximum product. This is necessary because updating the minimum product requires the original maximum product value (before it was updated during the current iteration).
//
//        Update the Answer: If at any point the updated maximum product is greater than the current answer, it updates the answer to this new maximum product.
//
//        Result: After looping through all elements in the array, it returns the maximum product found, which is stored in ans.


//
//The reason for calculating and comparing three values for each array element—the product of the current element and the previous maximum product, the product of the current element and the previous minimum product, and the current element itself—is to handle the variability introduced by negative numbers and the possibility of the current element being a more favorable starting point for a subarray. Here's why each is considered:
//
//        Product with Previous Maximum: Multiplying the current element by the previous maximum product could yield a new maximum, especially if the current element is positive. This potentially extends an existing subarray to include the current element.
//
//        Product with Previous Minimum: This is crucial when the current element is negative. Multiplying a negative number by the previous minimum product (which could be negative) might result in a positive product that is larger than any previously calculated product. This is because two negatives make a positive, and if both the current element and the minimum product are large negative numbers, their product could be a large positive number, possibly the largest seen so far.
//
//        The Current Element Itself: Considering the current element as a standalone product is important because it might be larger than any product calculated so far. This can happen if the sequence of products resulted in a very small product due to negative numbers, and the current element is a positive number that is larger than those products. Additionally, if all preceding elements were negative and the current element is positive, starting a new subarray from the current element might yield a larger product moving forward.
//
//        This approach ensures that you are always keeping track of the maximum possible product up to the current point in the array, taking into account the peculiarities introduced by negative numbers and the potential for any single element to be the start of a new, more optimal subarray.