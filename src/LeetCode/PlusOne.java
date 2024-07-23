package LeetCode;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        BigInteger one = new BigInteger("1");
        BigInteger number = integerJoin(",", digits);
        number = number.add(BigInteger.ONE);
        System.out.println(number);
        // Convert each digit of the number to an int array using Streams
        digits = String.valueOf(number)    // Convert number to String
                .chars()             // Get an IntStream over the chars
                .map(c -> c - '0')   // Convert each char to an int
                .toArray();         // Collect results to an array

        return digits;
    }

    private static BigInteger integerJoin(String delimeter, int[] nums) {
        String num = "";
        for (int i = 0; i < nums.length; i++) {
            num += nums[i];
        }
        return new BigInteger(num);
    }

//    Another Solution
//    public int[] plusOne(int[] digits) {
//
//        for (int i=digits.length-1;i>=0;i--){
//
//            if(digits[i]<9){
//                digits[i]++;
//                return digits;
//            }
//            digits[i]=0;
//        }
//        int[] arr = new int[digits.length+1];
//        arr[0] = 1;
//        return arr;
//    }
}
