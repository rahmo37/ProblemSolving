package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class DominoPiling {

    public static int returnDominos(String[] dimension) {
        int dominoSize = 2;
        int m = Integer.parseInt(dimension[0]);
        int n = Integer.parseInt(dimension[1]);
        int numberOfDominos = (int) (m * n) / dominoSize;
        return numberOfDominos;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArr = sc.nextLine().split(" ");
        System.out.println(returnDominos(inputArr));
    }

}
