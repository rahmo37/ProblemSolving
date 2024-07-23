//            1.	A sorted ascending array will be given,
//            2.	Find a set of three values that will NOT form a triangle.
//            3.	The indices of the values in the set must move to the ascending order 
//            4.	ai Means a value, and i, j, k means indices.
//            5.	ai-1’s value must be less than or equal to ai,  meaning 10, 10 is a valid value
//            6.	The indices must be in the following order i < j < k
//            7.	The values must be less than or equal to 109 (1,000,000,000)
//            8.	If values of i and j is NOT bigger than k, they are not going to form a perfect triangle, so it’s a valid answer.
//            9.	After solving and analyzing the test cases in code forces, it looks like if i + j = k, this is also a valid answer.


package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BadTriangle {

    // Actual algorithm
    public static void badTriangle(int[] triSidesArr) {
        for (int i = 2; i < triSidesArr.length; i++) {
//            Since i know the array is sorted and it is in ascending order, i know the first two numbers in
//            the array are the smallest. that is why, if the sum of first two num is smaller or equals to any other
//            number in the array, that three number set is my bad triangle`
            if (triSidesArr[0] + triSidesArr[1] <= triSidesArr[i]) {
                System.out.println("1 2" + " " + (i + 1));
                return;
            }
        }
        System.out.println(-1);
    }

    //    Helper algorithms to format the codeforce input
    public static boolean isNumber(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }


    //    Helper algorithms to format the codeforce input
    public static int[] returnIntArr(String[] strArr) {
        int[] convertedArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            convertedArr[i] = Integer.parseInt(strArr[i]);
        }
        return convertedArr;
    }

    //    Helper algorithms to format the codeforce input
    public static boolean lookForString(String str) {
        if (str.contains(" ")) {
            return true;
        } else {
            return false;
        }
    }

    // Programiz.Main method
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numOfInput = Integer.parseInt(reader.readLine()) * 2;
        String[] inputArr = new String[numOfInput];
        int i = 0;
        while (i < numOfInput) {
            inputArr[i] = reader.readLine();
            i++;
        }

        // Defining my 2d Arrays
        int[][] numArrs = new int[inputArr.length / 2][];

        // Extracting the inner arrays
        int l = 0;
        for (int j = 0; j < numArrs.length; j++) {
            for (int k = l; k < inputArr.length; k++) {
                if (lookForString(inputArr[k])) {
                    numArrs[j] = returnIntArr(inputArr[k].split(" "));
                    l = k + 1;
                    badTriangle(numArrs[j]);
                    break;
                }
            }
        }
    }
}
