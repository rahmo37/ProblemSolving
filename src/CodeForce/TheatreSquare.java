package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TheatreSquare {

    public static long numOfFlagstones(String numOfRows, String numOfColumns, String flagStoneSize) {
        int n = Integer.parseInt(numOfRows);
        int m = Integer.parseInt(numOfColumns);
        int a = Integer.parseInt(flagStoneSize);
        int numFlagstoneVertically = (int) (Math.ceil(n / (double) a));
        int numFlagstoneHorizontally = (int) (Math.ceil(m / (double) a));
        long flagStoneNeeded = (long) numFlagstoneVertically * numFlagstoneHorizontally;
        return flagStoneNeeded;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = reader.readLine().split(" ");
        System.out.println(numOfFlagstones(inputArr[0], inputArr[1], inputArr[2]));
    }
}
