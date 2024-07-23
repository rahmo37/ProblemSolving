package CodeForce;

import java.util.Scanner;

public class FireWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < testCases; i++) {
            String[] abm = sc.nextLine().split(" ");
            long a = Long.parseLong(abm[0]);
            long b = Long.parseLong(abm[1]);
            long m = Long.parseLong(abm[2]);
            a = a > m ? 1 : (m / a) + 1;
            b = b > m ? 1 : (m / b) + 1;
            System.out.println(a + b);
        }

    }

}
