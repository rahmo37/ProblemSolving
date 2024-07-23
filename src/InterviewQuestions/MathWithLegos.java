//
//        To make learning more interactive and fun for
//        students, a math teacher decides to teach a concept to students by using Lego blocks. There are 2 rows of legos, rowA (of length n) and rowB (of length m).
//        Both rows hold legos with positive integer values printed on them. However, some values (possibly, none) are missing. The missing values are denoted by 0.
//        Students need to incorporate the missing values. The task is to replace each O with a positive integer such that the sums of both arrays are equal.
//        Return the minimum sum possible. If it is not possible to make the sums equal, return -1.
//        Example
//        1 0 2
//        1 3 0 0
//        Consider n = 3, m = 4 and,
//        • rowA= [1, 0, 2]
//        • rowB = [1, 3, 0, 0]
//        After replacing the Os in the rows:
//        ⚫ rowA= [1, 3, 2]
//        • rowB = [1, 3, 1, 1]
//        1 3 2
//        1 3 1 1

package InterviewQuestions;

import java.util.Arrays;

public class MathWithLegos {

    public static int returnLowestSumPossible(int[] rowA, int[] rowB) {
//        if rows sum are equal then return the sum immidiately
        int rowASum = returnSum(rowA);
        int rowBSum = returnSum(rowB);
        if (rowASum == rowBSum) {
            return rowASum;
        }

//        Grabbing the last index of the 0s for each row, if no 0 exists -1 will be returned
        int lastZeroOfRowA = returnLastIndex(rowA, 0);
        int lastZeroOfRowB = returnLastIndex(rowB, 0);


//        filling all the 0s with 1s
        for (int i = 0; i < rowA.length; i++) {
            if (rowA[i] == 0) {
                rowA[i] = 1;

            }
        }

//        filling all the 0s with 1s
        for (int i = 0; i < rowB.length; i++) {
            if (rowB[i] == 0) {
                rowB[i] = 1;

            }
        }

//        Sum after converting all the 0s with 1s
        rowASum = returnSum(rowA);
        rowBSum = returnSum(rowB);

//        Here i am not grabbing a specific bigger array anymore, which ever array needs to have extra value add, will be added dynamically with the last zero index
//        if an Array need to have extra value added but the last zero index is -1 (meaning there was no zeros in the array to start with) then an exception will be thrown and the function
//        will return -1
        try {
            if (rowASum > rowBSum) {
                rowB[lastZeroOfRowB] += rowASum - rowBSum;

            } else {
                rowA[lastZeroOfRowA] += rowBSum - rowASum;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
        System.out.println(Arrays.toString(rowA));
        System.out.println(Arrays.toString(rowB));

        rowBSum = returnSum(rowB);
        rowASum = returnSum(rowA);
        if (rowASum == rowBSum) {
            return rowASum;
        }
        return -1;
    }

    public static int returnNumOfZeros(int[] numArr) {
        int counter = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int returnLastIndex(int[] numArr, int num) {
        int lastIndex = -1;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == num) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static int returnSum(int[] numArr) {
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {

            sum += numArr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] rowA = {0, 0, 0};
        int[] rowB = {1, 1};
        System.out.println(returnLowestSumPossible(rowA, rowB));
    }
}
