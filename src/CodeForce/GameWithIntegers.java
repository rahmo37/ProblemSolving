package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameWithIntegers {

    public static void gameWithInt(int n) {
//        If n is divisible by 3 it means vova wins because, vanya had to add or substract 1
//        to the already divisible by 3 number, meaning she makes it not divisible by three either way
//        Thats why vova wins, if n is divisible by 3 to begin with
        if (n % 3 == 0) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numOfInput = Integer.parseInt(reader.readLine());
        int[] inputArr = new int[numOfInput];
        int i = 0;
        while (i < numOfInput) {
            inputArr[i] = Integer.parseInt(reader.readLine());
            i++;
        }
        for (int j = 0; j < inputArr.length; j++) {
            gameWithInt(inputArr[j]);
        }

    }
}
