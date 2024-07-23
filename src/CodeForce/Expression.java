package CodeForce;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        if (a == 1) {
            a = a + b;
            if (c == 1) {
                a += c;
            } else {
                a *= c;
            }
            System.out.println(a);
        } else if (c == 1) {
            System.out.println((c + b) * a);
        } else if (b == 1) {
            System.out.println((b + Math.min(a, c)) * Math.max(a, c));
        } else {
            System.out.println(a * b * c);
        }
    }
}