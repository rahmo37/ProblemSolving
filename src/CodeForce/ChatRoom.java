package CodeForce;

import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        String hello = "hello";
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        int x = 0;
        int counter = 0;
        for (int i = 0; i < hello.length(); i++) {
            for (int j = x; j < s.length; j++) {
                if (hello.charAt(i) == s[j]) {
                    x = j + 1;
                    counter++;
                    break;
                }
            }
        }
        System.out.println(counter == 5 ? "YES" : "NO");
    }
}
