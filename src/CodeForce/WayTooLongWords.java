package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WayTooLongWords {

    public static String returnAbbreviation(String word) {
        if (word.length() < 11) {
            return word;
        }
        String firstLetter = Character.toString(word.charAt(0));
        String lastLetter = Character.toString(word.charAt(word.length() - 1));
        int restOfTheWordLen = word.substring(1, word.length() - 1).length();
        String combinedAbbreviation = firstLetter + restOfTheWordLen + lastLetter;
        return combinedAbbreviation;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfInput = Integer.parseInt(reader.readLine());
        String[] inputArr = new String[numberOfInput];
        for (int i = 0; i < numberOfInput; i++) {
            inputArr[i] = reader.readLine();
        }
        for (String eachWord : inputArr) {
            System.out.println(returnAbbreviation(eachWord));

        }
    }
}
