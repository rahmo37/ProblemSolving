package CodeForce;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] situation = sc.nextLine().split("");
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i < situation.length; i++) {
            if (Integer.parseInt(situation[i]) == 0) {
                zeros++;
            } else {
                zeros = 0;
            }
            if (Integer.parseInt(situation[i]) == 1) {
                ones++;
            } else {
                ones = 0;
            }
            if (zeros == 7 || ones == 7) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
