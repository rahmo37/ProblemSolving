package CodeForce;

import java.util.Scanner;


public class NesesGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
            sc.nextLine();
            int sequenceFirstNumber = Integer.parseInt(sc.nextLine().split(" ")[0]);
            String[] initialNumOfPeople = sc.nextLine().split(" ");
            for (int j = 0; j < initialNumOfPeople.length; j++) {
                if (sequenceFirstNumber > Integer.parseInt(initialNumOfPeople[j])) {
                    System.out.print(Integer.parseInt(initialNumOfPeople[j]) + " ");
                } else {
                    System.out.print((sequenceFirstNumber - 1) + " ");
                }
            }
            System.out.println();
        }
    }
}
