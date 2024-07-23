package LeetCode;

import java.util.Arrays;

public class ProductOfAnArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)
        ));
    }

//    public static int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int[] answer = new int[n];
//        answer[0] = 1;
//        int val = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            answer[i] = val;
//            for (int j = i - 1; j >= 0; j--) {
//                answer[j] = answer[j] * nums[i];
//            }
//            val = val * nums[i];
//            System.out.println(val);
//        }
//        return answer;
//    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Initialize the answer array with 1s for the left product
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        System.out.println(Arrays.toString(answer));
        // Right products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;
    }
}

