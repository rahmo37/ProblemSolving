package MISCTools;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {20, 18, 27, 10, 68, 80, 91, 45};
        int len = arr.length;
        insertionSort(arr, len);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] A, int n) {
        for (int j = 1; j < n; j++) {
            System.out.println("Current j's value for outer loop: " + (j + 1));
            System.out.println("Starting Array : " + Arrays.toString(A));
            int key = A[j];
            System.out.println("Current Key = A[j]: " + key);
            int i = j - 1;
            System.out.println("Initial i's value for the inner loop i = j - 1 = " + (i + 1));
            int loopNo = 1;
            while (i >= 0 && A[i] > key) {
                System.out.println("\nLoop " + loopNo);
                System.out.println("Copy " + A[i + 1] + " With " + A[i]);
                A[i + 1] = A[i];
                System.out.println("After copying " + A[i] + ":" + Arrays.toString(A));
                i = i - 1;
                System.out.println("i = i - 1 = " + (i + 1));
                System.out.println();
                loopNo++;
            }
            try {
                if (A[i] <= key) {
                    System.out.println(A[i] + " > " + key + " (x)");
                }
            } catch(Exception e) {
                System.out.println("i is less than 1 (x)");
            }
            System.out.println("Swap " + A[i + 1] + " at index " + ((i + 1) + 1) + " With Key " + key);
            A[i + 1] = key;
            System.out.println("\n-----------------------------\n");
        }
    }
}
