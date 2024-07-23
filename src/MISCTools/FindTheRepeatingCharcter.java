package MISCTools;

public class FindTheRepeatingCharcter {
    public static void main(String[] args) {
        String input = "reoxxxxiiiiyygcvvvxdbbdttihhxl";
        findMostRepeatingCharacterAndConsecutiveIndices(input);
    }

    public static void findMostRepeatingCharacterAndConsecutiveIndices(String str) {
        int maxCount = 0, currentCount = 0;
        int firstIndex = -1, lastIndex = -1, tempIndex = -1;
        char maxChar = ' ', prevChar = '\0';

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == prevChar) {
                // Continue the sequence
                currentCount++;
            } else {
                // New character sequence starts
                currentCount = 1;
                tempIndex = i;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxChar = currentChar;
                firstIndex = tempIndex;
                lastIndex = i;
            }

            prevChar = currentChar;
        }

        if (maxChar != ' ') {
            System.out.println("Most repeating character: " + maxChar);
            System.out.println("First index in the longest sequence: " + firstIndex);
            System.out.println("Last index in the longest sequence: " + lastIndex);
        } else {
            System.out.println("No repeating characters found.");
        }
    }
}
