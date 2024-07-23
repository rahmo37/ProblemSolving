package MISCTools;

public class GCDOfMultipleNumbers {

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

    public static void main(String[] args) {
        long[] numsArr = {8, 4, 14, 28, 96, 127};

        long GCD = returnGCDOfTwo(numsArr[0], numsArr[1]);
        if (GCD == 1) {
            System.out.println(1);
            return;
        }
        for (int i = 2; i < numsArr.length; i++) {
            GCD = returnGCDOfTwo(GCD, numsArr[i]);
        }
        System.out.println(GCD);
    }
}
