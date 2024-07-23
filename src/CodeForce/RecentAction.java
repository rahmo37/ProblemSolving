package CodeForce;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecentAction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < testCases; i++) {
            String[] nAndm = sc.nextLine().split(" ");
            int n = Integer.parseInt(nAndm[0]);
            int m = Integer.parseInt(nAndm[1]);
            String[] mArr = sc.nextLine().split(" ");
            int[] ansArr = returnAnswer(n, m, mArr);
            for (int elem : ansArr) {
                if (elem == 0) {
                    System.out.print("-1 ");
                } else {
                    System.out.print(elem + " ");
                }
            }
            System.out.println();
        }
    }

    public static int[] returnAnswer(int n, int m, String[] mArr) {
        Map<Integer, Integer> initialRA = new HashMap<>();
        int[] ansArr = new int[n];
//        for (int i = 0; i < n; i++) {
//            initialRA.put(i + 1, 1);
//        }
        for (int i = 0; i < m; i++) {
            if (n == 0) {
                return ansArr;
            }
            if (initialRA.get(Integer.parseInt(mArr[i])) == null) {
                initialRA.put(Integer.parseInt(mArr[i]), 1);
                ansArr[n - 1] = i + 1;
                n--;
            }
        }
        return ansArr;
    }
}
