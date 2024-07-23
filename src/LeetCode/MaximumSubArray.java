package LeetCode;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {5,4,-15,7,8};
        System.out.println(returnSubArr(nums));
    }

    public static int returnSubArr(int[] nums) {
        //Brute force
//        int n = nums.length;
//        int sum = Integer.MIN_VALUE;
//        int subSum = 0;
////        int[] resultArr = {};
//
//        for (int i = 0; i < n; i++) {
//            if (nums[i] > sum) {
//                sum = nums[i];
////                int[] subArr = {nums[i]};
////                resultArr = subArr;
//            }
//            subSum = nums[i];
//            for (int j = i + 1; j < n; j++) {
//                subSum += nums[j];
//                if (subSum > sum) {
////                    int l = 0;
//                    sum = subSum;
////                    int[] subArr = new int[j - i + 1];
////                    for (int k = i; k <= j; k++) {
////                        subArr[l] = nums[k];
////                        l++;
////                    }
////                    resultArr = subArr;
//                }
//            }
//        }
//        return sum;



//        5,4,-1,7,8
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
