package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CanISquare {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCases = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numOfTestCases; i++) {
            reader.readLine();
            String[] numArray = reader.readLine().split(" ");
            canISquare(returnSum(numArray));
        }
    }

    public static long returnSum(String[] numArray) {
        long sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum += Long.parseLong(numArray[i]);
        }
        return sum;
    }

    public static void canISquare(long num) {
        long number = num;
        long sqrtOfNum = (long) Math.sqrt(number);
        if (sqrtOfNum * sqrtOfNum == number) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
