package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] numArr = {2, 7, 11, 15};
        int target = 9;
        TwoSum index = new TwoSum();
        System.out.println(Arrays.toString(index.returnIndex(numArr, target)));
    }

    public int[] returnIndex(int[] nums, int target) {
        HashMap<Integer, Integer> saveIndex1 = new HashMap<>();
        HashMap<Integer, Integer> saveIndex2 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remaining = 0;
            if (saveIndex1.get(nums[i]) == null) {
                saveIndex1.put(nums[i], i);
            } else {
                saveIndex2.put(nums[i], i);
            }
            remaining = target - nums[i];
            if (saveIndex1.get(remaining) != null && saveIndex1.get(remaining) != i) {
                if (saveIndex2.get(remaining) != null) {
                    int[] result = {saveIndex2.get(remaining), saveIndex1.get(nums[i])};
                    return result;
                }
                int[] result = {saveIndex1.get(remaining), saveIndex1.get(nums[i])};
                return result;
            }
        }
        return null;
    }
}
//Another Solution, Please study
//import java.util.Map;
//import java.util.HashMap;
//
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement)) {
//                return new int[] { map.get(complement), i };
//            }
//            map.put(nums[i], i);
//        }
//        // In case there is no solution, we'll just return null
//        return null;
//    }
//}