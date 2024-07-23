package MISCTools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetTheMaxNUmberFromAnArray {
    public static void main(String[] args) {
        Integer[] numArr = {1, 2, 3, 4, 5};

        for (int i = 0; i < numArr.length; i++) {
            List<Integer> numberList = new ArrayList<>(Arrays.asList(numArr));
            numberList.remove(i);
            System.out.print(numArr[i] - Collections.max(numberList) + " ");
        }
    }
}
