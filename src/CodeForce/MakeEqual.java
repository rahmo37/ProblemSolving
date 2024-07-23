package CodeForce;

import java.util.Scanner;

public class MakeEqual {

    // My Approach...Did not work!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < noOfTest; i++) {
            sc.nextLine();
            String[] arr = sc.nextLine().split(" ");
            if (arr.length == 1) {
                System.out.println("YES");
            } else {
                printAnswer(arr);
            }
        }
    }

    public static void printAnswer(String[] arr) {
        int carry = 0;
        int sum = 0;
        int equalNum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        if (sum == 0) {
            System.out.println("YES");
            return;
        } else {
            equalNum = sum / arr.length;
            for (int i = 0; i < arr.length; i++) {
                carry += Integer.parseInt(arr[i]) - equalNum;
                if(carry < 0) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }

//    Please understand this before proceeding...!
    // Chat GPT solution
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt(); // Number of test cases
//
//        while (t-- > 0) {
//            int n = scanner.nextInt(); // Number of containers
//            int[] a = new int[n];
//            long sum = 0; // Use long to avoid integer overflow
//
//            for (int i = 0; i < n; i++) {
//                a[i] = scanner.nextInt();
//                sum += a[i];
//            }
//
//            long target = sum / n; // Target amount of water in each container
//            boolean possible = true;
//            long excess = 0;
//
//            for (int i = 0; i < n; i++) {
//                if (a[i] > target) {
//                    excess += a[i] - target; // Calculate excess water
//                } else if (a[i] < target) {
//                    if (excess < target - a[i]) {
//                        // If there's not enough excess to fill the current container to target
//                        possible = false;
//                        break;
//                    } else {
//                        excess -= target - a[i]; // Use excess to fill to target
//                    }
//                }
//                // If a[i] == target, it's already balanced for that container
//            }
//
//            System.out.println(possible ? "YES" : "NO");
//        }
//        scanner.close();
//    }
}
