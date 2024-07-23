package MISCTools;

import java.util.ArrayList;
import java.util.Scanner;

public class preFixSum {
    public static void main(String[] args) {
        ArrayList<Integer> prefixSumArr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Scanner lineScanner = new Scanner(line);

        // Initialize sum
        int sum = 0;

        // Read integers from the line
        while (lineScanner.hasNextInt()) {
            sum += lineScanner.nextInt();
            prefixSumArr.add(sum);
        }

        // Print the sum
        System.out.println(prefixSumArr);

        // Close the scanners
        lineScanner.close();
        scanner.close();
    }

}
