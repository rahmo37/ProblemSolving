package MISCTools;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 6, 3, 7, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int p, int r) {
        if (p < r) { // This is the correct base case check.
            int q = partition(arr, p, r); // The partitioning logic should be in a separate method.
            System.out.println(p + " " + (q - 1));
            quickSort(arr, p, q - 1); // Recursively sort the left sub-array.
            quickSort(arr, q + 1, r); // Recursively sort the right sub-array.
        }
    }

    private static int partition(int[] arr, int p, int r) {
        int x = arr[r]; // Choosing the last element as the pivot.
        int i = p - 1;
        for (int j = p; j < r; j++) { // Loop should go from p to r-1.
            if (arr[j] <= x) {
                i++;
                // Swap arr[i] and arr[j].
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[r] (pivot to the correct place).
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return i + 1; // Return the index of the pivot.
    }

}
