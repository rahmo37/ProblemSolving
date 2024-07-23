package LeetCode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix1 = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int k1 = 8;
        System.out.println(solution.kthSmallest(matrix1, k1)); // Output: 13

        int[][] matrix2 = {
                {-5}
        };
        int k2 = 1;
        System.out.println(solution.kthSmallest(matrix2, k2)); // Output: -5
    }

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;

        // Min-heap to store elements
        PriorityQueue<Element> minHeap = new PriorityQueue<>((a, b) -> a.value - b.value);
        Set<String> visited = new HashSet<>();

        // Add the first element to the heap
        minHeap.offer(new Element(matrix[0][0], 0, 0));
        visited.add(0 + "," + 0);

        // Poll from heap k times
        for (int i = 0; i < k - 1; i++) {
            Element element = minHeap.poll();

            int row = element.row;
            int col = element.col;

            // Add the right neighbor if it exists and is not visited
            if (col + 1 < n && !visited.contains(row + "," + (col + 1))) {
                minHeap.offer(new Element(matrix[row][col + 1], row, col + 1));
                visited.add(row + "," + (col + 1));
            }

            // Add the bottom neighbor if it exists and is not visited
            if (row + 1 < n && !visited.contains((row + 1) + "," + col)) {
                minHeap.offer(new Element(matrix[row + 1][col], row + 1, col));
                visited.add((row + 1) + "," + col);
            }
        }

        return minHeap.poll().value;
    }

    class Element {
        int value;
        int row;
        int col;

        Element(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
    }
}




//class Solution {
//    public int kthSmallest(int[][] matrix, int k) {
//        int n = matrix.length;
//        int left = matrix[0][0];
//        int right = matrix[n - 1][n - 1];
//
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            int count = countLessEqual(matrix, mid);
//            if (count < k) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//
//        return left;
//    }
//
//    private int countLessEqual(int[][] matrix, int target) {
//        int n = matrix.length;
//        int count = 0;
//        int row = n - 1;
//        int col = 0;
//
//        while (row >= 0 && col < n) {
//            if (matrix[row][col] <= target) {
//                count += row + 1;
//                col++;
//            } else {
//                row--;
//            }
//        }
//
//        return count;
//    }
//}