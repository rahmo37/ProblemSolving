package CodeForce;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charArr1 = sc.nextLine().toLowerCase().toCharArray();
        char[] charArr2 = sc.nextLine().toLowerCase().toCharArray();
        printAnswer(charArr1, charArr2);
    }

    private static void printAnswer(char[] charArr1, char[] charArr2) {
        int result = 0;
        for (int i = 0; i < charArr1.length; i++) {
            int a = charArr1[i];
            int b = charArr2[i];
            if (a != b) {
                result = a - b;
                break;
            }
        }
        if (result < 0) {
            System.out.println(-1);
        } else if (result > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
