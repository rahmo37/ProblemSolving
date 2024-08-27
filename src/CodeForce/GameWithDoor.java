package CodeForce;

import java.util.Scanner;

public class GameWithDoor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] alice = sc.nextLine().split(" ");
            String[] bob = sc.nextLine().split(" ");

            int alice0 = Integer.parseInt(alice[0]);
            int alice1 = Integer.parseInt(alice[1]);
            int bob0 = Integer.parseInt(bob[0]);
            int bob1 = Integer.parseInt(bob[1]);

            int L, R, l, r;

            if (alice0 <= bob0) {
                L = alice0;
                R = alice1;
                l = bob0;
                r = bob1;
            } else {
                L = bob0;
                R = bob1;
                l = alice0;
                r = alice1;
            }

            int result = Math.min(R - l, r - l) + 2;
            if (L == l) {
                result = result - 1;
            }
            if (R == r) {
                result = result - 1;
            }
            System.out.println(result <= 0 ? 1 : result);
        }
    }
}
