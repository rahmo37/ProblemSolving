package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(returnResult(s));
    }

    private static String returnResult(String s) {
        String result = "";
        String[] vowels = {"a", "e", "i", "o", "u", "y"};
        for (int i = 0; i < s.length(); i++) {
            String eachLetter = Character.toString(s.charAt(i)).toLowerCase();
//            Arrays.asList() is a method in Java that converts an array into a fixed-size list. This list is backed by the original array, which means changes to the list will also affect the array and vice versa. However, this list does not support adding or removing elements; you can only modify existing elements.
            if (!Arrays.asList(vowels).contains(eachLetter)) {
                result += "." + eachLetter;
            }
        }
        return result;
    }
}
