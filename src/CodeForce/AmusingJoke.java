package CodeForce;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guestAndHost = sc.nextLine() + sc.nextLine();
        String scrambledLetters = sc.nextLine();
        String eachLetter = "";

        HashMap<String, Integer> guestAndHostMap = new HashMap<>();
        HashMap<String, Integer> scrambledLettersMap = new HashMap<>();

        for (int i = 0; i < guestAndHost.length(); i++) {
            eachLetter = Character.toString(guestAndHost.charAt(i));
            guestAndHostMap.put(eachLetter, guestAndHostMap.getOrDefault(eachLetter, 0) + 1);
        }
        for (int j = 0; j < scrambledLetters.length(); j++) {
            eachLetter = Character.toString(scrambledLetters.charAt(j));
            scrambledLettersMap.put(eachLetter, scrambledLettersMap.getOrDefault(eachLetter, 0) + 1);
        }
        String result = isAltered(guestAndHostMap, scrambledLettersMap) ? "YES" : "NO";
        System.out.println(result);

    }

    public static boolean isAltered(HashMap<String, Integer> h1, HashMap<String, Integer> h2) {
        if(h1.size() != h2.size()) {
            return false;
        }
        for (Map.Entry<String, Integer> entry : h1.entrySet()) {
            if (h1.get(entry.getKey()) != h2.get(entry.getKey())) {
                return false;
            }
        }
        return true;
    }
}
