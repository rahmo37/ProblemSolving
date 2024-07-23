package CodeForce;

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] weight = sc.nextLine().split(" ");
        System.out.println(printNumberOfYear(Integer.parseInt(weight[0]), Integer.parseInt(weight[1])));
    }

    private static int printNumberOfYear(int a, int b) {
        int year = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            year++;
        }
        return year;
    }
}
