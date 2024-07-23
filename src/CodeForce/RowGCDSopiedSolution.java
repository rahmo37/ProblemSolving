package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class RowGCDSopiedSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long[] ar = new long[(int) n];
            for (int i = 0; i < n; ++i) {
                ar[i] = sc.nextLong();
            }
            Arrays.sort(ar);
            long gcd = 0;
            for (int i = 1; i < n; ++i) {
                gcd = GCD(gcd, ar[i] - ar[0]);
            }
            for (int i = 0; i < m; ++i) {
                long x = sc.nextLong();
                System.out.print(GCD(x + ar[0], gcd) + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    private static long GCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

    private static long power(long x, long y, long MOD) {
        final long INF = (long) 1e18;
        if (y == 0) {
            return 1;
        }
        if (y % 2 == 0) {
            return power((x * x) % MOD, (y / 2) % MOD, MOD);
        } else {
            return (x * power((x * x) % MOD, (((y - 1) / 2) % MOD) % MOD, MOD));
        }
    }
}
