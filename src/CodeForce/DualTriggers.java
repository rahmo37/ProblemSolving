package CodeForce;

import java.util.Scanner;

public class DualTriggers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfTestCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numOfTestCases; i++) {
            sc.nextLine();
            String lampConfig = sc.nextLine();
            int numOfLitLights = 0;
            for (int j = 0; j < lampConfig.length(); j++) {
                if (lampConfig.charAt(j) == '1') {
                    numOfLitLights++;
                }
            }
            if (numOfLitLights == 0) {
                System.out.println("YES");
            } else if (numOfLitLights % 2 != 0) {
                System.out.println("NO");
            } else if (numOfLitLights == 2) {
                int indexOfFirstLight = lampConfig.indexOf("1");
                if (lampConfig.charAt(indexOfFirstLight + 1) == '1') {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {
                System.out.println("YES");
            }
        }
    }
}
