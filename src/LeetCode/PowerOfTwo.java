package LeetCode;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-2147483648));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n != 0 && n != Integer.MIN_VALUE) {
            if ((n & (n - 1)) == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
