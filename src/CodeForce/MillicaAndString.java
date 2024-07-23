package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MillicaAndString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int charBRequired = 0;
        String givenString = "";
        int numOfTestCase = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numOfTestCase; i++) {
            charBRequired = Integer.parseInt(reader.readLine().split(" ")[1]);
            givenString = reader.readLine();
            minimumOperation(charBRequired, givenString);
        }
    }

    public static void minimumOperation(int charBRequired, String givenString) {
        // Saving the first and last index of A and B. this is because of reducing the number of loops
        int[] firstAndLastIndexOfA = {givenString.indexOf("A"), givenString.lastIndexOf("A")};
        int[] firstAndLastIndexOfB = {givenString.indexOf("B"), givenString.lastIndexOf("B")};
        int numOfBs = 0;
        int numOfAdjustedChar = 0;

        // if present num of Bs in the given String
        if (firstAndLastIndexOfB[0] != -1) {
            for (int i = firstAndLastIndexOfB[0]; i <= firstAndLastIndexOfB[1]; i++) {
                if (givenString.charAt(i) == 'B') {
                    numOfBs++;
                }
            }
        }

        // number of characters required to be adjusted
        numOfAdjustedChar = charBRequired - numOfBs;

        // if we need to adjust positive number of characters, as in A --> B
        if (numOfAdjustedChar > 0) {
            System.out.println("1");
            System.out.println(returnIndex(numOfAdjustedChar, firstAndLastIndexOfA, givenString, 'A') + " " + "B");

        }
        // if we need to adjust negative number of characters, as in B --> A
        else if (numOfAdjustedChar < 0) {
            System.out.println("1");
            System.out.println(returnIndex(Math.abs(numOfAdjustedChar), firstAndLastIndexOfB, givenString, 'B') + " " + "A");
        }
        // if no character change is required we simply print 0
        else {
            System.out.println("0");
        }
    }

    public static int returnIndex(int numberOfChanges, int[] firstAndLastIndexOfChar, String givenString, char searchedChar) {
        for (int i = firstAndLastIndexOfChar[0]; i <= firstAndLastIndexOfChar[1]; i++) {
            if (givenString.charAt(i) == searchedChar) {
                numberOfChanges--;
            }
            if (numberOfChanges == 0) {
                return i + 1;
            }
        }
        return -1;
    }
}
