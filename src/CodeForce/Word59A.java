package CodeForce;

import java.util.Scanner;

public class Word59A {

    public static String wordConverter(String word) {
        int scale = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                scale++;
            } else {
                scale--;
            }
        }
        if (scale < 0) {
            return word.toUpperCase();
        } else if (scale > 0) {
            return word.toLowerCase();
        }
        return word.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(wordConverter(word));
    }
}
