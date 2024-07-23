package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] numArr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println(uniqueOccurrences(numArr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numMap = new HashMap<>();
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            numMap.put(arr[i], numMap.getOrDefault(arr[i], 0) + 1);
        }
        for (int num : numMap.values()) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
            if (occurrenceMap.get(num) > 1) {
                return false;
            }
        }
        return true;
    }
}

// Another solution
//class Solution {
//    public boolean uniqueOccurrences(int[] arr) {
//        int[] numberOfOccurrences = new int[2001];
//        boolean[] used = new boolean[1001];
//
//        for (int i : arr) {
//            numberOfOccurrences[1000 + i]++;
//        }
//
//        for (int i : arr) {
//            int count = numberOfOccurrences[1000 + i]; // идем по исходному массиву
//            numberOfOccurrences[1000 + i] = 0; // достаем кол-во повторений и зануляем его
//            if (count > 0) {
//                if (used[count]) return false;
//                else used[count] = true;
//            }
//        }
//        return true;
//    }
//}