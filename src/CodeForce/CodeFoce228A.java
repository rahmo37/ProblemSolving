package CodeForce;

import java.util.Scanner;

public class CodeFoce228A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] strArr = line.split(" ");
        int[] numArr = convertStringArrayToIntArray(strArr);
        int output = 0;

        for (int i = 0; i < numArr.length; i++) {
            int counter = 0;
            boolean isMatch = false;
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] == numArr[j]) {
                    isMatch = true;
                    counter++;
                }
            }

            if (output < counter) {
                output = counter;
            } else if (output == counter && isMatch) {
                output++;
            }
        }

        sc.close();
        System.out.println(output);
    }

    public static int[] convertStringArrayToIntArray(String[] stringArray) {
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            // Convert each string to an int and store in the int array
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }


}
