package CodeForce;

import java.util.*;

public class SellingHamburgers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < testCase; i++) {
            int numOfCustomer = Integer.parseInt(sc.nextLine());
            String[] numOfCoins = sc.nextLine().split(" ");
            coinsCanBeEarned(numOfCoins);
        }
    }

    public static void coinsCanBeEarned(String[] numOfCoins) {
        ArrayList<Long> possibleEarning = new ArrayList<>();
        Arrays.sort(numOfCoins, new Comparator<String>() {
            //          Needs understanding....
            @Override
            public int compare(String s1, String s2) {
                return Long.compare(Long.parseLong(s1), Long.parseLong(s2));
            }
        });
        for (int i = 0; i < numOfCoins.length; i++) {
            possibleEarning.add(Long.parseLong(numOfCoins[i]) * (numOfCoins.length - i));
        }
        System.out.println(Collections.max(possibleEarning));
    }
}
