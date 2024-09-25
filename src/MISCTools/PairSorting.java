package MISCTools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PairSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // List to store pairs of integers
        List<int[]> pairs = new ArrayList<>();

        System.out.println("Enter the number of pairs: ");
        int n = scanner.nextInt();

        // Accept pairs from user
        for (int i = 0; i < n; i++) {
            System.out.println("Enter pair " + (i + 1) + " (two integers): ");
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            pairs.add(new int[]{first, second});
        }

        // Sort pairs based on the first integer, and second if the first is the same
        Collections.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] pair1, int[] pair2) {
                // Compare first elements
                    return Integer.compare(pair1[0], pair2[0]);

                // If first elements are the same, compare second elements
//                return Integer.compare(pair1[1], pair2[1]);
            }
        });

        // Output the sorted pairs
        System.out.println("Sorted pairs:");
        for (int[] pair : pairs) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}
