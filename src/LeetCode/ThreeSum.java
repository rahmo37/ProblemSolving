package LeetCode;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, -1, -1, -1, 2, 2};
        for (List<Integer> each : threeNumberSum(arr)) {
            System.out.println(each);
        }

    }

    public static List<List<Integer>> threeNumberSum(int[] array) {
        Set<String> tripletList = new HashSet<>();
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(array);
        int n = array.length;
        for (int k = 0; k < n; k++) {
            int i = k + 1;
            int j = n - 1;
            while (j > i) {
                int a = array[k];
                int b = array[i];
                int c = array[j];
                if (a + b + c < 0) {
                    i++;
                } else if (a + b + c > 0) {
                    j--;
                } else {
                    String tripletStr = a + "" + b + "" + c;
                    if (!tripletList.contains(tripletStr)) {
                        resultList.add(new ArrayList<>(Arrays.asList(a, b, c)));
                        tripletList.add(tripletStr);
                    }
                    i++;
                    j--;
                }
            }
        }
        return resultList;
    }
}


//import java.util.AbstractList;
//class Solution {
//
//    private List<List<Integer>> res;
//    public List<List<Integer>> threeSum(int[] nums) {
//        return new AbstractList<List<Integer>>() {
//            public List<Integer> get(int index) {
//                init();
//                return res.get(index);
//            }
//            public int size() {
//                init();
//                return res.size();
//            }
//            private void init() {
//                if (res != null) return;
//                Arrays.sort(nums);
//                int l, r, sum;
//                Set<List<Integer>> tempRes = new HashSet<>();
//                for(int i = 0; i < nums.length - 2; ++i) {
//                    l = i + 1;
//                    r = nums.length - 1;
//                    while(l < r) {
//                        sum = nums[i] + nums[l] + nums[r];
//                        if (sum == 0) tempRes.add(Arrays.asList(nums[i], nums[l], nums[r]));
//                        if (sum < 0) ++l; else --r;
//                    }
//                }
//                res = new ArrayList<List<Integer>>(tempRes);
//            }
//
//        };
//    }
//}