package CodeForce;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(Character.toString(word.charAt(0)).toUpperCase() + word.substring(1, word.length()));
    }
}
