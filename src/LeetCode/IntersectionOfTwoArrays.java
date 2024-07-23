package LeetCode;

import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1000, 1000, 1000};
        int[] arr2 = {1000, 1000};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));

    }


    public static int[] intersection(int[] nums1, int[] nums2) {
//        First Method
//      The code converts a primitive int[] array into an Integer[] array. It first creates an IntStream from the int[] array, then boxes each primitive int into an Integer object, and finally collects these Integer objects into a new Integer[] array using a method reference to specify the array type.
//        Integer[] nums1Boxed = Arrays.stream(nums1).boxed().toArray(Integer[]::new);
//        Set<Integer> firstArr = new HashSet<>(Arrays.asList(nums1Boxed));
//        Set<Integer> intersectionSet = new HashSet<>();
//        for (int i = 0; i < nums2.length; i++) {
//            if (firstArr.contains(nums2[i])) {
//                intersectionSet.add(nums2[i]);
//            }
//        }
//        int[] intersectionArray = intersectionSet.stream().mapToInt(Integer::intValue).toArray();
//        return intersectionArray;


//      Second method
        int[] values = new int[1001];
        int k = 0;
        int[] answer = new int[1001];

        for (int n : nums1) {
            values[n]++;
        }

        for (int n : nums2) {
            if (values[n] != 0) {
                values[n] = 0;
                answer[k++] = n;
            }

        }
        return Arrays.copyOfRange(answer, 0, k);
    }
}
