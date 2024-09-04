package CodeForce;

import java.util.Scanner;

public class cAPSLOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String firstChar = Character.toString(word.charAt(0));
        String resultStr = firstChar.equals(firstChar.toLowerCase()) ? firstChar.toUpperCase() : firstChar.toLowerCase();
        if (word.length() == 1) {
            System.out.println(resultStr);
            return;
        } else {
            for (int i = 1; i < word.length(); i++) {
                String str = Character.toString(word.charAt(i));
                if(str.equals(str.toLowerCase())) {
                    System.out.println(word);
                    return;
                }
                resultStr += str.toLowerCase();
            }
        }
        System.out.println(resultStr);
    }
}
