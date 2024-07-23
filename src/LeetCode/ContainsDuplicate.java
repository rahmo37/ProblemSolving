package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] numArr = {4, 2, 3, 1};
        System.out.println(containsDuplicate(numArr));
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int i = 1;
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            if (frequencyMap.get(num) > 1) {
                return true;
            }
        }
        return false;
    }

//    Another solution
//    public static boolean containsDuplicate(int[] nums) {
//        final int length = nums.length;
//        if (length == 1) return false;
//        if (length == 2) return nums[0] == nums[1];
//
//        for (int i = 1; i < length; i++) {
//            final int current = nums[i];
//            int j = i - 1, jval = nums[j];
//            if (current < jval) {
//                while (true) {
//                    nums[j + 1] = jval;
//                    if (j-- == 0) break;
//                    jval = nums[j];
//                    if (current >= jval) break;
//                }
//                nums[j + 1] = current;
//            }
//
//            if (j > -1 && current == jval) {
//                return true;
//            }
//        }
//        return false;
//    }

}
