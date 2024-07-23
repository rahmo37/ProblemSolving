package CodeForce;

//                    System.out.println("left" + left);
//                    System.out.println("mid" +mid);
//                    System.out.println("right" +right);

import java.util.Scanner;

public class RudlofAnd121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
            int len = Integer.parseInt(sc.nextLine());
            String[] a = sc.nextLine().split(" ");
            if (len <= 2) {
                System.out.println("NO");
            } else {
                int j = 0;
                for (j = 1; j < len - 1; j++) {
                    int temp = 0;
                    int left = Integer.parseInt(a[j - 1]);
                    int mid = Integer.parseInt(a[j]);
                    int right = Integer.parseInt(a[j + 1]);
                    temp = left;
                    left = left - (temp * 1);
                    mid = mid - (temp * 2);
                    right = right - (temp * 1);

                    if (mid >= 0 && right >= 0 && mid <= right) {
                        a[j - 1] = Integer.toString(left);
                        a[j] = Integer.toString(mid);
                        a[j + 1] = Integer.toString(right);
                    } else {
                        System.out.println("NO");
                        break;
                    }
                }
                if (Integer.parseInt(a[len - 1]) == 0 && j == len - 1) {
                    System.out.println("YES");
                } else if (Integer.parseInt(a[len - 1]) != 0 && j == len - 1) {
                    System.out.println("NO");
                }
            }
        }
    }
}


//                    System.out.println(a[j - 1]);
//                            System.out.println(a[j]);
//                            System.out.println(a[j + 1]);


//import java.util.Scanner;
//
//public class RudlofAnd121 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//
//        for (int tc = 0; tc < t; tc++) {
//            int n = scanner.nextInt();
//            int[] a = new int[n];
//            for (int i = 0; i < n; i++) {
//                a[i] = scanner.nextInt();
//            }
//            System.out.println(canMakeAllZero(a) ? "YES" : "NO");
//        }
//        scanner.close();
//    }
//
//    private static boolean canMakeAllZero(int[] a) {
//        int n = a.length;
//
//        // Check if it's possible to make all elements zero
//        for (int i = 1; i < n - 1; i++) {
//            while (a[i] > 0 && a[i-1] > 0 && a[i+1] > 0) {
//                a[i] -= 2;
//                a[i-1]--;
//                a[i+1]--;
//            }
//        }
//
//        // Check if all elements are zero
//        for (int i = 0; i < n; i++) {
//            if (a[i] != 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}