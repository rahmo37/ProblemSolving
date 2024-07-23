package CodeForce;

import java.util.Scanner;

public class OneDEraser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] nAndk = sc.nextLine().split(" ");
            int n = Integer.parseInt(nAndk[0]);
            int k = Integer.parseInt(nAndk[1]);
            String[] nArr = sc.nextLine().split("");
            System.out.println(returnAnswer(n, k, nArr));
        }
    }

    public static int returnAnswer(int n, int k, String[] nArr) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nArr[i].equals("B")) {
                count++;
                i += k - 1;
            }
        }
        return count;
    }
}
