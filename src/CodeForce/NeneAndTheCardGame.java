package CodeForce;

import java.util.HashMap;
import java.util.Scanner;

public class NeneAndTheCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCase; i++) {
            sc.nextLine();
            String[] cards = sc.nextLine().split(" ");
            HashMap<String, Integer> frequency = new HashMap<>();
            int point = 0;
            for (int j = 0; j < cards.length; j++) {
                frequency.put(cards[j], frequency.getOrDefault(cards[j], 0) + 1);
                if (frequency.get(cards[j]) > 1) {
                    point++;
                }
            }
            System.out.println(point);
        }
    }
}
