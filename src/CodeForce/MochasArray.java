package CodeForce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MochasArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int index = 0; index < testCases; index++) {
            int n = Integer.parseInt(sc.nextLine());
            String[] a = sc.nextLine().split(" ");
            Arrays.sort(a, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return Integer.compare(Integer.parseInt(s1), Integer.parseInt(s2));
                }
            });

            int minVal = Integer.parseInt(a[0]);
//            System.out.println(minVal);
            if (minVal == 1) {
                System.out.println("YES");
            } else {
                int i = 1;
                while (i < n && Integer.parseInt(a[i]) % minVal == 0) {
                    i++;
                }
                if (i == n) {
                    System.out.println("YES");
                } else {
                    int secondMinVal = Integer.parseInt(a[i]);
                    int j = 0;
                    for (j = i + 1; j < n; j++) {
                        if (Integer.parseInt(a[j]) % minVal != 0) {
                            if (Integer.parseInt(a[j]) % secondMinVal != 0) {
                                System.out.println("NO");
                                break;
                            }
                        }
                    }
                    if (j == n) {
                        System.out.println("YES");
                    }
                }
            }
        }
    }
}
