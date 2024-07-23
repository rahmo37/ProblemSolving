package CodeForce;

import java.util.Scanner;


public class WeGotEverythingCovered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] numArr = sc.nextLine().split(" ");
            for (int j = 0; j < Integer.parseInt(numArr[0]); j++) {
                System.out.print(alpha.substring(0, Integer.parseInt(numArr[1])));
            }
            System.out.println();
        }
    }
}
