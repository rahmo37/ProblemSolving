package LeetCode;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
//        first solution
//        HashMap<Integer, Integer> numberFrequency = new HashMap<>();
//        int halfOfNums = nums.length / 2;
//        for (int i = 0; i < nums.length; i++) {
//            numberFrequency.put(nums[i], numberFrequency.getOrDefault(nums[i], 0) + 1);
//            if (numberFrequency.get(nums[i]) > halfOfNums) {
//                return nums[i];
//            }
//        }
//        return -1;
//    }
//
//      Another Solution
        Arrays.sort(nums);
        int currentValue = nums[0];
        int counter = 1;
        int halfOfLength = nums.length / 2;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == currentValue) {
                counter++;
                if (counter > halfOfLength) {
                    return currentValue;
                }
            } else {
                currentValue = nums[i];
                counter = 1;
            }
        }
        return currentValue;
    }

//    Another Solution
//    int n = nums.length;
//    Map<Integer, Integer> map = new HashMap<>();
//
//        for(int i = 0; i < n; i++) {
//        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//    }
//
//    n = n / 2;
//
//        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//        if(entry.getValue() > n) {
//            return entry.getKey();
//        }
//    }
//        return 0;
}
