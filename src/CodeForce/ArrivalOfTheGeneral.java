package CodeForce;

import java.util.Scanner;


public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfSoliders = Integer.parseInt(sc.nextLine());
        String[] solidersHeigths = sc.nextLine().split(" ");
        int minimumHeightValue = Integer.MAX_VALUE;
        int maximumHeightValue = Integer.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < solidersHeigths.length; i++) {
            if (Integer.parseInt(solidersHeigths[i]) <= minimumHeightValue) {
                minimumHeightValue = Integer.parseInt(solidersHeigths[i]);
                minIndex = i;
            }
            if (Integer.parseInt(solidersHeigths[i]) > maximumHeightValue) {
                maximumHeightValue = Integer.parseInt(solidersHeigths[i]);
                maxIndex = i;
            }
        }
        if(maxIndex > minIndex) {
            System.out.println(((numOfSoliders - (minIndex + 1)) + maxIndex) - 1); // Because of the swap between max and min
        } else {
            System.out.println(((numOfSoliders - (minIndex + 1)) + maxIndex)); // No Swap between max and min is required
        }
    }
}
