package LeetCode;

import java.math.BigInteger;

public class SumOfTwoIntegers {
//    My solution, but does not work for very, very big positive values and negative values
    public static void main(String[] args) {
        System.out.println(getSum(9, 9));

    }
//    public static int getSum(int a, int b) {
//        BigInteger two = BigInteger.valueOf(2);
//        BigInteger resultNum = two.pow(a).multiply(two.pow(b));
//        return (int)logBase(2, resultNum);
//    }
//    public static double logBase(double base, BigInteger value) {
//        double doubleValue = value.doubleValue();
//        return Math.log(doubleValue) / Math.log(base);
//    }
    public static int getSum(int a, int b) {
        while (b != 0) {
            // Carry now contains common set bits of a and b
            int carry = a & b;

            // Sum of bits of a and b where at least one of the bits is not set
            a = a ^ b;
            System.out.println(a);

            // Carry is shifted by one so that adding it to a gives the required sum
            b = carry << 1;
        }
        return a;
    }
}

