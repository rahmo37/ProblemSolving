package DataStructureAndAlgorithms.ArrayProblems;

public class RemoveOddIntegers {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 7, 10, 6, 5};
        printArray(removeEven(arr));
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int iwd = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 != 0) {
                result[iwd] = arr[j];
                iwd++;
            }
        }
        return result;
    }
}
