package CodeForce;

import java.util.*;

public class HQ9PLUS {
    public static void main(String[] args) {
        Set<Character> charArr = new HashSet<>(Arrays.asList('H', 'Q', '9'));
        Scanner sc = new Scanner(System.in);
        String testLine = sc.nextLine();
        for (int i = 0; i < testLine.length(); i++) {
            if (charArr.contains(testLine.charAt(i))) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
