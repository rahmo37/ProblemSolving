package CodeForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimplePermutation {

    static int counter = 0;

    public static int[] generatePermutations(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        permute(nums, 0, resultList);

        // Convert List<Integer> to int[]
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    private static void permute(int[] array, int start, List<Integer> result) {
        if (start == array.length - 1) {
            result.add(convertToInt(array));
            return;
        }

        for (int i = start; i < array.length; i++) {
            swap(array, start, i);
            permute(array, start + 1, result);
            swap(array, start, i);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        counter++;
        System.out.println("array: " + Arrays.toString(array));
        System.out.println(" counter: " + counter + " | array[i] : " + array[i] + " | array[j] : " + array[j] + " | i (start) :" + i + " | j (i) :" + j);
        System.out.println();
    }


    private static int convertToInt(int[] array) {
        int result = 0;
        for (int value : array) {
            result = 10 * result + value;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {3, 1, 2};
        int[] permutations = generatePermutations(nums);

        for (int perm : permutations) {
//            System.out.println(perm);
        }
    }
}

