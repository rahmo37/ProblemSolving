package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RowGCD1459 {

    public static void printGCD(long[] gcdNumsArr) {
        if(gcdNumsArr.length == 1) {
            System.out.println(gcdNumsArr[0]);
            return;
        }
        long GCD = returnGCDOfTwo(gcdNumsArr[0], gcdNumsArr[1]);
        if (GCD == 1) {
            System.out.println(1);
            return;
        }
        for (int i = 2; i < gcdNumsArr.length; i++) {
            GCD = returnGCDOfTwo(GCD, gcdNumsArr[i]);
        }
        System.out.print(GCD + " ");
    }

    public static int returnGCDOfTwo(long num1, long num2) {
        long a = 0;
        long b = 0;
        if (num1 > num2) {
            a = num1;
            b = num2;
        } else {
            a = num2;
            b = num1;
        }
        long remainder = a % b;
        if (remainder == 0) {
            return (int) b;
        }
        a = b;
        b = remainder;
        return returnGCDOfTwo(a, b);
    }


    public static long[] returnIntArr(String[] strArr) {
        long[] convertedArr = new long[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            convertedArr[i] = Long.parseLong(strArr[i]);
        }
        return convertedArr;
    }

    public static long[] returnAddedNumersArr(long[] numArr1, long numberToAdd) {
        long[] numbersAfterAddition = new long[numArr1.length];
        for (int i = 0; i < numArr1.length; i++) {
            numbersAfterAddition[i] = numArr1[i] + numberToAdd;
        }
        return numbersAfterAddition;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        long[] numArr1 = returnIntArr(reader.readLine().split(" "));
        long[] numsToAdd = returnIntArr(reader.readLine().split(" "));
        for (int i = 0; i < numsToAdd.length; i++) {
            printGCD(returnAddedNumersArr(numArr1, numsToAdd[i]));
        }
    }
}
