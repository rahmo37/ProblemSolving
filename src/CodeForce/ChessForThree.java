package CodeForce;

import java.util.Scanner;

public class ChessForThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < noOfTestCases; i++) {
            String[] scores = sc.nextLine().split(" ");
            int totalScore = 0;
            int p3Score = Integer.parseInt(scores[2]);
            for (String each : scores) {
                totalScore += Integer.parseInt(each);
            }
            int totalScoreOfP1P2 = totalScore - p3Score;

            if (totalScore == 0) {
                System.out.println(0);
            } else if (totalScore % 2 != 0) {
                System.out.println(-1);
            } else {
                if (totalScoreOfP1P2 > p3Score) {
                    System.out.println(totalScore / 2);
                } else {
                    System.out.println(totalScoreOfP1P2);
                }
            }
        }
    }
}
