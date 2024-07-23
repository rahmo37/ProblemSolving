package CodeForce;

import java.util.Scanner;

public class DieRoll {

    public static String dieRoll(int yakkoNum, int wakkoNum) {
        int largestNum = yakkoNum >= wakkoNum ? yakkoNum : wakkoNum;
        final int allPossibleEvents = 6;
        int probableEvents = 0;
        for(int i = largestNum; i <= allPossibleEvents; i++) {
            probableEvents++;
        }

        String probability = "";

        switch (probableEvents) {
            case 1:
                probability = "1/6";
                break;
            case 2:
                probability = "1/3";
                break;
            case 3:
                probability = "1/2";
                break;
            case 4:
                probability = "2/3";
                break;
            case 5:
                probability = "5/6";
                break;
            case 6:
                probability = "1/1";
                break;
            default:
                probability = "Invalid Input";
                break;
        }
        return probability;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArr = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(inputArr[0]);
        int num2 = Integer.parseInt(inputArr[1]);
        System.out.println(dieRoll(num1, num2));
    }
}
