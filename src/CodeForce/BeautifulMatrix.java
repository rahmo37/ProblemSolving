package CodeForce;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean indexFound = false;
        int indexOfOne = 0;
        while (!indexFound) {
            String[] row = sc.nextLine().split(" ");
            for (int j = 0; j < 5; j++) {
                indexOfOne++;
                if (row[j].equals("1")) {
                    indexFound = true;
                    break;
                }
            }
        }
        System.out.println(findMinimumSteps(indexOfOne));
    }

    private static int findMinimumSteps(int indexOfOne) {
        int steps = Integer.MAX_VALUE;
        Map<Integer, Integer> middleColumns = new HashMap<>();
        int closestMiddleColumn = 0;
        middleColumns.put(3, 2);
        middleColumns.put(8, 1);
        middleColumns.put(13, 0);
        middleColumns.put(18, 1);
        middleColumns.put(23, 2);
        for (int key : middleColumns.keySet()) {
            if (Math.abs(indexOfOne - key) < steps) {
                steps = Math.abs(indexOfOne - key);
                closestMiddleColumn = key;
            }
        }
        return steps + middleColumns.get(closestMiddleColumn);
    }
}
