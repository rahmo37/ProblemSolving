package CodeForce;

import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        // Array of all possible lucky numbers up to 1000
        int[] luckyNumbers = {
                4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777
        };

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        boolean isAlmostLucky = false;

        while (temp != 0) {
            if (temp % 10 != 4 || temp % 10 != 7) {
                break;
            } else {
                temp = temp / 10;
            }
        }
        if (temp == 0) {
            System.out.println("YES");
        } else {
            for (int each : luckyNumbers) {
                if (num % each == 0) {
                    isAlmostLucky = true;
                    break;
                }
            }
            System.out.println(isAlmostLucky ? "YES" : "NO");
        }
    }
}
