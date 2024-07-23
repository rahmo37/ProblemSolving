package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PheonixAndPuzzle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCases = Integer.parseInt(reader.readLine());
        int numOfPieces;
        for (int i = 0; i < numOfTestCases; i++) {
            numOfPieces = Integer.parseInt(reader.readLine());
            System.out.println(isPerfectSquare(numOfPieces));
        }
    }

    public static String isPerfectSquare(int numOfPieces) {
        int divideBy2 = numOfPieces / 2;
        int divideBy4 = numOfPieces / 4;
        int squareRootOfDivisionOf2 = (int) Math.sqrt(divideBy2);
        int squareRootOfDivisionOf4 = (int) Math.sqrt(divideBy4);


        if (numOfPieces % 2 == 0 && squareRootOfDivisionOf2 * squareRootOfDivisionOf2 == divideBy2) {
            return "YES";
        } else if (numOfPieces % 4 == 0 && squareRootOfDivisionOf4 * squareRootOfDivisionOf4 == divideBy4) {
            return "YES";
        } else {
            return "NO";
        }
    }

}
