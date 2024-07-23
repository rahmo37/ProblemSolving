package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddQueries {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCase = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numOfTestCase; i++) {
            String[] secondLine = reader.readLine().split(" ");
            int n = Integer.parseInt(secondLine[0]);
            int numQueries = Integer.parseInt(secondLine[1]);
            int[] prefixSumArr = new int[n];

            String[] numArrStr = reader.readLine().split(" ");
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Integer.parseInt(numArrStr[j]);
                prefixSumArr[j] = sum;
            }

            for (int k = 0; k < numQueries; k++) {
                String[] queriesArr = reader.readLine().split(" ");
                int l = Integer.parseInt(queriesArr[0]) - 1;
                int r = Integer.parseInt(queriesArr[1]) - 1;
                int d = Integer.parseInt(queriesArr[2]);
                System.out.println(calculation(sum, prefixSumArr, l, r, d));
            }
        }
    }

    public static String calculation(int sum, int[] prefixSumArr, int l, int r, int d) {
        int sumOfRemainingNums;
        int noOfPartialNums = r - l + 1;
        int sumOfReplacedNumMultiplied = d * noOfPartialNums;

        if (l == 0) {
            sumOfRemainingNums = sum - prefixSumArr[r];
        } else {
            int sumOfPartialNums = prefixSumArr[r] - prefixSumArr[l - 1];
            sumOfRemainingNums = sum - sumOfPartialNums;
        }

        return (sumOfRemainingNums + sumOfReplacedNumMultiplied) % 2 != 0 ? "YES" : "NO";
    }
}
