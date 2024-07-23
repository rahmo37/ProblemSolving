package CodeForce;

import java.util.Scanner;

public class CodeForce231A {

    // ChatGPT
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int s = 0;

            for (int i = 0; i < n; i++) {
                int ans = 0;
                for (int j = 0; j < 3; j++) {
                    int a = scanner.nextInt();
                    if (a == 1) {
                        ans++;
                    }
                }
                if (ans >= 2) {
                    s++;
                }
            }
            System.out.println(s);
        }
        scanner.close();
    }
}
