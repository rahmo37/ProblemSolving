package AlgoExpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for(Integer[] each : threeNumberSum(arr, 6)) {
            System.out.println(Arrays.toString(each));
        }

    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> resultList = new ArrayList<>();
        Arrays.sort(array);
        int n = array.length;
        for (int k = 0; k < n; k++) {
            int i = k + 1;
            int j = n - 1;
            while (j > i) {
                int a = array[k];
                int b = array[i];
                int c = array[j];
                if (a + b + c < targetSum) {
                    i++;
                } else if (a + b + c > targetSum) {
                    j--;
                } else {
                    resultList.add(new Integer[]{a, b, c});
                    i++;
                    j--;
                }
            }
        }
        return resultList;
    }
}
