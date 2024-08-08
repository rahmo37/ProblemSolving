package AlgoExpert;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidSequence {

    public static void main(String[] args) {
        List mainList = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List subList = new ArrayList<>(Arrays.asList(1, 6, -1, -1));
        System.out.println(isValidSubsequence(mainList, subList));
    }

    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence
    ) {
        int k = 0;
        int j = 0;
        for (int i = 0; i < sequence.size(); i++) {
            for (j = k; j < array.size(); j++) {
                k = j;
                if(sequence.get(i) == array.get(j)) {
                    k++;
                    break;
                }
            }
            if(j == array.size()) {
                return false;
            }
        }
        return true;
    }
}
