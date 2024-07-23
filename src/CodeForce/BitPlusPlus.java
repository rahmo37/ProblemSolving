package CodeForce;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfStatement = Integer.parseInt(sc.nextLine());
        int x = 0;
        for (int i = 0; i < noOfStatement; i++) {
            String statement = sc.nextLine();
            if(statement.equals("X++") || statement.equals("++X")) {
                x++;
            } else {
                x--;
            }
        }
    }
}
