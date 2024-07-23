package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] test1 = {{1, 2, 3}};
        System.out.println(spiralOrder(test1));
    }


    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> resultList = new ArrayList<>();
        Set<String> visitedList = new HashSet<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int lengthOfAllNumbers = m * n;
        int currentNumber = 1;
        int col = 0;
        int row = 0;
        resultList.add(matrix[row][col]);
        visitedList.add(row + "," + col);

        while (currentNumber < lengthOfAllNumbers) {
//            Forward Column traverse
            for (col = col + 1; col < n; col++) {
                if (!visitedList.contains(row + "," + col)) {
                    resultList.add(matrix[row][col]);
                    visitedList.add(row + "," + col);
                    currentNumber++;
                } else {
                    break;
                }
            }
            col = col - 1;

//            Downward row traverse
            for (row = row + 1; row < m; row++) {
                if (!visitedList.contains(row + "," + col)) {
                    resultList.add(matrix[row][col]);
                    visitedList.add(row + "," + col);
                    currentNumber++;
                } else {
                    break;
                }
            }
            row = row - 1;

//          Backward column traverse
            for (col = col - 1; col > -1; col--) {
                if (!visitedList.contains(row + "," + col)) {
                    resultList.add(matrix[row][col]);
                    visitedList.add(row + "," + col);
                    currentNumber++;
                } else {
                    break;
                }
            }
            col = col + 1;


//          Upward row traverse
            for (row = row - 1; row > -1; row--) {
                if (!visitedList.contains(row + "," + col)) {
                    resultList.add(matrix[row][col]);
                    visitedList.add(row + "," + col);
                    currentNumber++;
                } else {
                    break;
                }
            }
            row = row + 1;
        }
        return resultList;
    }
}
