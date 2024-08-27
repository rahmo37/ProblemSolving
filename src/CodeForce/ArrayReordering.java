package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReordering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int t = 0; t < testCases; t++) {
            int len = Integer.parseInt(sc.nextLine());
            String[] arr = sc.nextLine().split(" ");
            int result = 0;
            int[] arr2 = new int[len];
            int i = 0;
            int j = len - 1;
            for (String each : arr) {
                int cur = Integer.parseInt(each);
                if (cur % 2 == 0) {
                    arr2[i] = cur;
                    i++;
                } else {
                    arr2[j] = cur;
                    j--;
                }
            }

            for (i = 0; i < arr2.length; i++) {
                int cur = arr2[i];
                if (cur % 2 == 0) {
                    result += len - (i + 1);
                } else {
//                    System.out.println(result);
                    for (j = i + 1; j < arr2.length; j++) {
                        int next = 2 * arr2[j];
                        if (cur != 1 && isValidGCD(Math.max(cur,next), Math.min(cur,next))) {
                            result++;
                        }
                    }
                }
            }
            System.out.println(result);
        }


    }


    public static boolean isValidGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a != 1;
    }
}
