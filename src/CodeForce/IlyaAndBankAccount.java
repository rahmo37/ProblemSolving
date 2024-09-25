package CodeForce;

import java.util.Scanner;

public class IlyaAndBankAccount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        if (Integer.parseInt(num) >= 0) {
            System.out.println(num);
            return;
        }
        String[] lastTwoDigit = num.substring(num.length() - 2).split("");
        String result = num.substring(0, num.length() - 2) +
                Math.min(Integer.parseInt(lastTwoDigit[0]), Integer.parseInt(lastTwoDigit[1]));
        if (result.equals("-0")) {
            System.out.println("0");
        } else {
            System.out.println(result);
        }
    }

}
