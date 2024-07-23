package CodeForce;

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] stones = sc.nextLine().split("");
        System.out.println(printStonesToTakeout(stones));
    }

    private static int printStonesToTakeout(String[] stones) {
        int count = 0;
        String cur = stones[0];
        String next = "";
        for (int i = 1; i < stones.length; i++) {
            next = stones[i];
            if(cur.equals(next)) {
                count++;
            } else {
                cur = next;
            }
        }
        return count;
    }
}
