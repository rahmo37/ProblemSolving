package CodeForce;

import java.util.Scanner;

public class NearlyLuckyNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] eachDigit = sc.nextLine().split("");
        int counter = 0;
        for (String i : eachDigit) {
            if (i.equals("7") || i.equals("4")) {
                counter++;
            }
        }
        if(counter == 7 || counter == 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
