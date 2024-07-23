package CodeForce;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoodBuying {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCases = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numOfTestCases; i++) {
            System.out.println(maximumSpent(Integer.parseInt(reader.readLine())));

        }
    }

    public static int maximumSpent(int num) {
        int intialAmount = num;
        int spent;
        if (intialAmount < 10) {
            spent = intialAmount;
        } else {
            spent = (intialAmount / 10) * 10;
        }
        int left = intialAmount - spent;
        int leftPlusCashBack = (spent / 10) + left;
        if (leftPlusCashBack == 0) {
            return spent;
        } else {
            return spent + maximumSpent(leftPlusCashBack);
        }
    }
}
