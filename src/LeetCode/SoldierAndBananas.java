package LeetCode;

import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");
        int k = Integer.parseInt(numbers[0]);
        int n = Integer.parseInt(numbers[1]);
        int w = Integer.parseInt(numbers[2]);
        int totalPrice = 0;
        for (int i = 1; i <= w; i++) {
            totalPrice += (k * i);
        }
        int borrowedMoney = (totalPrice - n);
        System.out.println(borrowedMoney < 0 ? 0 : borrowedMoney);
    }
}
