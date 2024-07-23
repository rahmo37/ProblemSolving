package MISCTools;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] nums = {0, 4, 2, 3, 5, 7, 10};
        System.out.println(Arrays.toString(sortAlgo(nums)));

    }

    public static int[] sortAlgo(int[] arr) {
        int min = returnMin(arr);
        int max = returnMax(arr);
        int range = max - min + 1;
        int[] expandedArray = new int[range];
        int[] resultArray = new int[arr.length];
        int index = 0;


//        Marking the distance
        for (int i = 0; i < arr.length; i++) {
            int position = arr[i] - min;
            expandedArray[position] += 1;
        }
        for (int i = 0; i < expandedArray.length; i++) {
            if (expandedArray[i] > 0) {
                for (int j = 0; j < expandedArray[i]; j++) {
                    resultArray[index] = i + min;
                    index++;
                }
            }
        }


        return resultArray;
    }

    public static int returnMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int eachNum : arr) {
            if (eachNum < min) {
                min = eachNum;
            }
        }
        return min;
    }

    public static int returnMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int eachNum : arr) {
            if (eachNum > max) {
                max = eachNum;
            }
        }
        return max;
    }
}
