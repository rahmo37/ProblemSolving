package MISCTools;

public class GCDTwoNums {

    public static int returnGCD(long a, long b) {
        long remainder = a % b;
        if (remainder == 0) {
            return (int)b;
        }
        a = b;
        b = remainder;
        return returnGCD(a, b);
    }

    public static void main(String[] args) {
        long num1 = 606414287301075871l;
        long num2 = 12;
        System.out.println(returnGCD(num1, num2));
    }
}
