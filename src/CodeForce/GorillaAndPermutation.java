package CodeForce;

import java.util.Scanner;

public class GorillaAndPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());
        for (int t = 0; t < testCase; t++) {
            String[] vars = sc.nextLine().split(" ");
            int n = Integer.parseInt(vars[0]);
            int m = Integer.parseInt(vars[1]);
            int k = Integer.parseInt(vars[2]);
            for (int i = n; i > m; i--) {
                System.out.print(i + " ");
            }
            for (int i = 1; i <= m; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
