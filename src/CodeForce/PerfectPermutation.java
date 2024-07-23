package CodeForce;

import java.util.Scanner;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        if(n % 2 != 0) {
            System.out.println(-1);
        } else {
            String str = "";
            int j = 1;
            for(int i = 0; i < n / 2; i++) {
                int firstNum = j + 1;
                int secondNum = j;
                str += firstNum + " " + secondNum + " ";
                j += 2;
            }
            System.out.println(str.trim());
        }
    }
}
