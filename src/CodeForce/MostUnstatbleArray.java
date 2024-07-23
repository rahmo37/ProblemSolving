package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MostUnstatbleArray {

    public static long dontEventNeedAnArray(String[] inputArr) {
        long n = Long.parseLong(inputArr[0]);
        long m = Long.parseLong(inputArr[1]);
        if (n == 2) {
            return m;
        } else if (n > 2) {
            return m + m;
        }
        return 0;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        2d array to reserve the input
        int numOfInput = Integer.parseInt(reader.readLine());
        String[][] numArrs = new String[numOfInput][];
        int i = 0;
        while (i < numOfInput) {
            numArrs[i] = reader.readLine().split(" ");
            i++;
        }
        for (int j = 0; j < numArrs.length; j++) {
            System.out.println(dontEventNeedAnArray(numArrs[j]));
        }
    }
}
