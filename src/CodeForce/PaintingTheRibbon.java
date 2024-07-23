package CodeForce;

import java.util.Scanner;

public class PaintingTheRibbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] variables = sc.nextLine().split(" ");
            int n = Integer.parseInt(variables[0]);
           double m = Double.parseDouble(variables[1]);
            int k = Integer.parseInt(variables[2]);
            if ((int) Math.ceil(n / m) < n - k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
