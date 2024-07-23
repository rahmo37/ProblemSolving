package CodeForce;

import java.util.Scanner;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
            long eachNum = Long.parseLong(sc.nextLine());

            if (eachNum % 2 != 0) {
                System.out.println("yes");
            } else if (eachNum % 5 == 0) {
                System.out.println("yes");
            } else if (eachNum % 3 == 0) {
                System.out.println("yes");
            } else {
                long divident = eachNum;
                while (divident > 1) {
                    divident = divident / 2;
                    if (divident % 2 != 0 && divident > 1) {
                        System.out.println("yes");
                        break;
                    }
                }
                if (divident == 1) {
                    System.out.println("no");
                }
            }

        }
    }
}


//Another Solution
//import java.util.Scanner;
//
//public class OddDivisor {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt(); // Read the number of test cases
//        for (int i = 0; i < t; i++) {
//            long n = sc.nextLong(); // Read each number
//            if (hasOddDivisor(n)) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }
//        sc.close();
//    }
//
//    // Function to check if the number has an odd divisor greater than 1
//    private static boolean hasOddDivisor(long n) {
//        // Check if n is a power of 2
//        return (n & (n - 1)) != 0;
//    }
//}
