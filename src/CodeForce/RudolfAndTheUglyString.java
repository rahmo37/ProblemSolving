package CodeForce;

import java.util.Scanner;

public class RudolfAndTheUglyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        String tempSubStr = "";
        for (int i = 0; i < testCases; i++) {
            int counter = 0;
            int len = Integer.parseInt(sc.nextLine());
            String str = sc.nextLine();
            for (int j = 0; j < len; j++) {
                if (str.charAt(j) == 'm' && j < len - 2) {
                    tempSubStr = str.substring(j, j + 3);
                    if (tempSubStr.equals("map")) {
                        counter++;
                        j = j + 2;
                        tempSubStr = "";
                    }
                } else if (str.charAt(j) == 'p' && j < len - 2) {
                    tempSubStr = str.substring(j, j + 3);
                    if (tempSubStr.equals("pie")) {
                        counter++;
                        j = j + 2;
                        tempSubStr = "";
                    }
                }
            }
            System.out.println(counter);
        }
    }

}
