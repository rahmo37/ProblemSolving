package CodeForce;

import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nNdk = sc.nextLine().split(" ");
        long n = Long.parseLong(nNdk[0]);
        long k = Long.parseLong(nNdk[1]);
        long oddLen = (long) Math.ceil(n / 2.0);
        if (k > oddLen) {
            k = k - oddLen;
            System.out.println(k * 2);
        } else {
            System.out.println((k * 2) - 1);
        }
    }
}
