package CodeForce;

import java.util.Scanner;

public class NewYearAndHurry {
    static int[] cumulativeSummationArr = {5, 15, 30, 50, 75, 105, 140, 180, 225, 275};
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] input = sc.nextLine().split(" ");
        int numOfProbs = Integer.parseInt(input[0]);
        int timeToGotToTheParty = Integer.parseInt(input[1]);
        int remainingTime = 240 - timeToGotToTheParty;
        System.out.println(noOfProblemsCanBeSolved(remainingTime, numOfProbs));
    }

    public static int noOfProblemsCanBeSolved(int remainingTime, int numOfProbs) {
        for (int i = numOfProbs - 1; i >= 0; i--) {
            if (cumulativeSummationArr[i] <= remainingTime) {
                return i + 1;
            }
        }
        return 0;
    }
}
