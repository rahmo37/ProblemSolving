//            System.out.println(Arrays.toString(matrix[j]));
//            System.out.println();

package CodeForce;

import java.util.Scanner;


public class MatrixStabilization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Taking Input...
        int numOfTestCases = Integer.parseInt(sc.nextLine());
        for (int a = 0; a < numOfTestCases; a++) {
            String[] nm = sc.nextLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            String[][] matrix = new String[n][m];
            for (int b = 0; b < n; b++) {
                matrix[b] = sc.nextLine().split(" ");
            }
//          Logic Starts here...
            int val = 0;
            int topN = 0;
            int rightN = 0;
            int downN = 0;
            int leftN = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    val = Integer.parseInt(matrix[i][j]);
                    topN = i - 1 < 0 ? 0 : Integer.parseInt(matrix[i - 1][j]);
                    rightN = j + 1 > m - 1 ? 0 : Integer.parseInt(matrix[i][j + 1]);
                    downN = i + 1 > n - 1 ? 0 : Integer.parseInt(matrix[i + 1][j]);
                    leftN = j - 1 < 0 ? 0 : Integer.parseInt(matrix[i][j - 1]);

//                    System.out.print(" Neighbours of " + matrix[i][j]  + " are " + topN + " " + rightN + " " + downN + " " + leftN);
                    printResult(val, topN, rightN, downN, leftN);
                }
                System.out.println();

            }
        }

    }

    private static void printResult(int val, int topN, int rightN, int downN, int leftN) {
        int max = Math.max(Math.max(topN, rightN), Math.max(downN, leftN));
        System.out.print(val > max ? max : val);
        System.out.print(" ");
    }


}

