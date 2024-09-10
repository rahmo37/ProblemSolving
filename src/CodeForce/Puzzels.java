package CodeForce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Puzzels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = Integer.parseInt(sc.nextLine().split(" ")[0]);
        String[] puzzles = sc.nextLine().split(" ");
        int result = Integer.MAX_VALUE;

        Arrays.sort(puzzles, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(Integer.parseInt(o1), Integer.parseInt(o2));
            }
        });

        for (int i = 0; i <= puzzles.length - students; i++) {
            int A = Integer.parseInt(puzzles[i + students - 1]);
            int B = Integer.parseInt(puzzles[i]);
            int val = A - B;
            if (val <= result) {
                result = val;
            }
        }
        System.out.println(result);
    }
}
