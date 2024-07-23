package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UnitedWeStand {

    public static void unitedWeStand(int[] numArr) {
        if (isSameNumber(numArr)) {
            System.out.println(-1);
            return;
        }
        int cElement = -1;

        for (int i = 0; i < numArr.length; i++) {
            cElement = numArr[i];
            for (int j = 0; j < numArr.length; j++) {
                if (numArr[j] % numArr[i] == 0 && numArr[j] != numArr[i]) {
                    cElement = -1;
                    break;
                }
            }
            if (cElement > -1) {
                break;
            }
        }
        int[] c = returnFilteredArr(numArr, cElement);


        int counter = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] != c[1]) {
                counter++;
            }
        }
        System.out.println(counter + " " + (c.length - 1));


        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] != c[1]) {
                System.out.print(numArr[i] + " ");
            }
        }
        System.out.println();
        for (int index : c) {
            if (index != 0) {
                System.out.print(index + " ");
            }
        }
        System.out.println();
    }

    public static boolean isSameNumber(int[] numArr) {
        boolean isSameNumber = true;
        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] != numArr[0]) {
                isSameNumber = false;
                break;
            }
        }
        return isSameNumber;
    }

    public static int[] returnFilteredArr(int[] numArr, int elem) {
        List<Integer> tempList = new ArrayList<>();
        tempList.add(0);
        for (int number : numArr) {
            if (number == elem) {
                tempList.add(number);
            }
        }
        int[] filteredArray = tempList.stream().mapToInt(i -> i).toArray();
        return filteredArray;
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
                    unitedWeStand(numArrs[j]);
                    break;
                }
            }
        }
    }
}

