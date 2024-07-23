package MISCTools;

import java.util.Arrays;

public class UnnamedSort {
    public static void main(String[] args) {
        int[] numArr = {3, 2, 1, 30, 5, 5, 7, 1, 6, 99};
        boolean needSorting = true;
        while (needSorting) {
            needSorting = unnamedSort(numArr);
        }
        System.out.println(Arrays.toString(numArr));
    }

    public static boolean unnamedSort(int[] numArr) {
        boolean needSorting = false;
        int val = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            if (val <= numArr[i]) {
                val = numArr[i];
            } else {
                needSorting = true;
                numArr[i - 1] = numArr[i];
                numArr[i] = val;
            }
        }
        return needSorting;
    }

}
