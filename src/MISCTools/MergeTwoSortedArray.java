package MISCTools;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2};
        int[] mergedArr = new int[arr1.length + arr2.length];
        int arr1index = 0;
        int arr2index = 0;

        for (int i = 0; i < mergedArr.length; i++) {
            boolean isArr1Exhausted = arr1index >= arr1.length;
            boolean isArr2Exhausted = arr2index >= arr2.length;

            if (!isArr1Exhausted && !isArr2Exhausted) {
                if (arr1[arr1index] <= arr2[arr2index]) {
                    mergedArr[i] = arr1[arr1index++];
                } else {
                    mergedArr[i] = arr2[arr2index++];
                }
            } else if (!isArr1Exhausted) {
                mergedArr[i] = arr1[arr1index++];
            } else if (!isArr2Exhausted) {
                mergedArr[i] = arr2[arr2index++];
            }
        }
        System.out.println(Arrays.toString(mergedArr));
    }
}
