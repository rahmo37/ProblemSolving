package CodeForce;

import java.util.Scanner;

public class ClockAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCase = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < noOfTestCase; i++) {
            String[] abcd = sc.nextLine().split(" ");
            System.out.println(doesIntersect(abcd));
        }
    }

    public static String doesIntersect(String[] abcd) {
        int a = Integer.parseInt(abcd[0]) < Integer.parseInt(abcd[1]) ? Integer.parseInt(abcd[0]) : Integer.parseInt(abcd[1]);
        int b = Integer.parseInt(abcd[0]) > Integer.parseInt(abcd[1]) ? Integer.parseInt(abcd[0]) : Integer.parseInt(abcd[1]);
        int c = Integer.parseInt(abcd[2]);
        int d = Integer.parseInt(abcd[3]);
        for (int j = a + 1; j < b; j++) {
            if (c == j) {
                for (int h = c + 1; h < b; h++) {
                    if (h == d) {
                        return "NO";
                    }
                }
                return "YES";
            } else if (d == j) {
                for (int h = d + 1; h < b; h++) {
                    if (h == c) {
                        return "NO";
                    }
                }
                return "YES";
            }
        }
        return "NO";
    }
}
