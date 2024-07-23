package LeetCode;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] sortedArr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(sortedArr));
    }

    public static int removeDuplicates(int[] nums) {
        int curVal = Integer.MAX_VALUE;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (curVal != nums[i]) {
                nums[k] = nums[i];
                k++;
                curVal = nums[i];
            }
        }
        return k;
    }

//    Another Solution
//    public int removeDuplicates(int[] nums) {
//        int j = 1;
//        for(int i = 1; i<nums.length; i++){
//            if(nums[i]!=nums[i-1]){
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//        return j;
//
//    }
}
