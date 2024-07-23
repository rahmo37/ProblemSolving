package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rook {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCases = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numOfTestCases; i++) {
            String descriptionOfSquare = reader.readLine();
            String[] descriptionSeparated = descriptionOfSquare.split("");
            allPossibleSquare(descriptionSeparated[0].charAt(0), Integer.parseInt(descriptionSeparated[1]));
        }
    }

    public static void allPossibleSquare(char letter, int num) {
        int[] vertArr = {1, 2, 3, 4, 5, 6, 7, 8};
        char[] horArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        for (int i = 0; i < vertArr.length; i++) {
            if (num == vertArr[i]) {
                continue;
            }
            System.out.println(letter + "" + vertArr[i]);
        }
        for (int i = 0; i < horArr.length; i++) {
            if (letter == horArr[i]) {
                continue;
            }
            System.out.println(horArr[i] + "" + num);
        }
    }
}
