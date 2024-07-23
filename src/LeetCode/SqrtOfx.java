package LeetCode;

public class SqrtOfx {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(returnSqrt(x));
    }

    private static int returnSqrt(int x) {
        if (x < 2) {
            return x;
        }

        long low = 0, high = x;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long squared = mid * mid;
            if (squared == x) {
                return (int) mid;
            } else if (squared < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) high;
    }
}
