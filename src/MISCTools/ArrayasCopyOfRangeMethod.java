package MISCTools;

import java.util.Arrays;

public class ArrayasCopyOfRangeMethod {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6};

        // Copying elements from index 1 to 4 (4 is exclusive)
        int[] copiedArray = Arrays.copyOfRange(originalArray, 1, 4);

        // Print the new array to verify
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
        // Output: 2 3 4
    }

}
