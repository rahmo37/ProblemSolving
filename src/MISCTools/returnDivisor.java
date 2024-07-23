package MISCTools;

import java.util.ArrayList;
import java.util.List;

public class returnDivisor {

    public static List<Long> returnDivisors(long num) {
        List<Long> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                divisors.add((long) i);
                // If both divisors are not the same, add the second one
//                Meaning if the both i and num / i are same, we are not adding it twice.
//                4 % 2 = 0, 2 * 2 = 4, so we include only one 2
                if (i != num / i) {
                    divisors.add(num / i);
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        returnDivisors(36);
    }
}
