package CodeForce;

import java.util.Scanner;

public class KSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int t = 0; t < testCases; t++) {
            sc.nextLine();
            String[] arr = sc.nextLine().split(" ");
            long coins = 0;
            int ln = Integer.parseInt(arr[0]);
            long k = 0;
            for (int i = 1; i < arr.length; i++) {
                int curr = Integer.parseInt(arr[i]);
                if (ln > curr) {
                    int diff = ln - curr;
                    coins += diff;
                    if (diff > k) {
                        k = diff;
                    }
                } else {
                    ln = curr;
                }
            }
            System.out.println(coins + k);
        }
    }
}
