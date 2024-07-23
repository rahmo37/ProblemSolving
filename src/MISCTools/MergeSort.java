package MISCTools;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // Initialize an array with unsorted numbers.
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};
        // Starting index of the array
        int p = 0;
        // Ending index of the array
        int r = arr.length - 1;
        // Call the mergeSort function on the array
        mergeSort(arr, p, r);
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] A, int p, int r) {
        // Base case: if the current segment of the array contains more than one item
        if (p < r) {
            // Find the midpoint of the array segment
            int q = (p + r) / 2;
            // Recursively sort the first half of the array segment
            mergeSort(A, p, q);
            // Recursively sort the second half of the array segment
            mergeSort(A, q + 1, r);
            // Merge the two sorted halves
            merge(A, p, q, r);
        }
    }

    public static void merge(int[] A, int p, int q, int r) {
        // Calculate the lengths of the two subarrays to be merged
        int n1 = q - p + 1;
        int n2 = r - q;
        // Create temporary arrays for the left and right subarrays
        int[] L = new int[n1 + 1]; // +1 for the sentinel value
        int[] R = new int[n2 + 1]; // +1 for the sentinel value

        // Copy data to temporary arrays L[] and R[]
        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = A[q + j + 1];
        }

        // Insert sentinel values at the end of temporary arrays
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        // Initial indexes of the first and second subarrays
        int i = 0;
        int j = 0;

        // Merge the temp arrays back into the original array A[p..r]
        for (int k = p; k <= r; k++) {
            // Select the smaller of the two values and place it in the current position of array A
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
        }
    }

    public static class StringClass {
    }
}
