package CodeForce;

import java.util.Scanner;

public class CoinGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
            int numOfUps = 0;
            int numOfCoins = Integer.parseInt(sc.nextLine());
            String[] eachCoin = sc.nextLine().split("");
            for (int j = 0; j < numOfCoins; j++) {
                if (eachCoin[j].equals("U")) {
                    numOfUps++;
                }
            }
            System.out.println(numOfUps % 2 != 0 ? "YES" : "NO");
        }
    }
}
