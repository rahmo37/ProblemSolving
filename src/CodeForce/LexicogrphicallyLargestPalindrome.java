package CodeForce;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LexicogrphicallyLargestPalindrome {
    //    Internet answer
    //    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        int len = a.length();
//        int[] al = new int[27];
//
//        // Count the occurrences of each character
//        for (int i = 0; i < len; i++) {
//            al[a.charAt(i) - 'a' + 1]++;
//        }
//
//        // Find the lexicographically largest character and print it as many times as it appears
//        for (int i = 26; i >= 1; i--) {
//            if (al[i] > 0) {
//                for (int j = 0; j < al[i]; j++) {
//                    System.out.print((char) ('a' + i - 1));
//                }
//                break; // Exit after printing the largest character
//            }
//        }
//
//    }
//    My answer
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] letterArr = sc.nextLine().split("");
        Map<Character, Integer> letterFrequency = new HashMap<>();
        char largestLetter = '\u0000'; //unicode null
        for (int i = 0; i < letterArr.length; i++) {
            if (largestLetter < letterArr[i].charAt(0)) {
                largestLetter = letterArr[i].charAt(0);
            }
            letterFrequency.put(letterArr[i].charAt(0), letterFrequency.getOrDefault(letterArr[i].charAt(0), 0) + 1);
        }
        for(int i = 0; i < letterFrequency.get(largestLetter); i++) {
            System.out.print(largestLetter);
        }
        System.out.println();
    }
}
