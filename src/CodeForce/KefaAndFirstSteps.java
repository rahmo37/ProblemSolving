package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] profit = sc.nextLine().split(" ");
        int maxProfit = 1;
        int count = 1;
        for (int i = 0; i < profit.length - 1; i++) {
            if (Integer.parseInt(profit[i]) > Integer.parseInt(profit[i + 1])) {
                count = 1;
            } else {
                count++;
            }
            if (count > maxProfit) {
                maxProfit = count;
            }
        }
        System.out.println(maxProfit);
    }
}
