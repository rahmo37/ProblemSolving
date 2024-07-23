package CodeForce;

import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.' && counter == 0) {
                result += '0';
            } else if (str.charAt(i) == '.' && counter == 1) {
                result += '1';
                counter = 0;
            } else if (str.charAt(i) == '-' && counter == 1) {
                result += '2';
                counter = 0;
            } else {
                counter++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
