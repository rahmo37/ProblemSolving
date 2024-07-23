package CodeForce;
import java.util.Arrays;
import java.util.Scanner;

public class MahmoudAndATriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfDigits = Integer.parseInt(sc.nextLine());
        int[] numArray = new int[noOfDigits];
        for(int i = 0; i < noOfDigits; i++) {
            numArray[i] = sc.nextInt();
        }
        Arrays.sort(numArray);
        System.out.println(isNonDegenerateTriangle(numArray));
    }
    public static String isNonDegenerateTriangle(int[] numArray) {
        for(int i = 2; i < numArray.length; i++) {
            if(numArray[i - 2] + numArray[i - 1] > numArray[i]) {
                return "YES";
            }
        }
        return "NO";
    }

}
