package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BlockTowers {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCase = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numOfTestCase; i++) {
            reader.readLine();
            String[] numArrStr = reader.readLine().split(" ");
            printFirstTower(numArrStr);
        }
    }


    public static void printFirstTower(String[] numArr) {
        long num = Long.parseLong(numArr[0]);
        numArr[0] = "0";
        Arrays.sort(numArr, new Comparator<String>() {
            //          Needs understanding....
            @Override
            public int compare(String s1, String s2) {
                return Long.compare(Long.parseLong(s1), Long.parseLong(s2));
            }
        });
        for (int i = 1; i < numArr.length; i++) {
            long anotherNumber = Long.parseLong(numArr[i]);
            if (num < anotherNumber) {
                long sum = num + anotherNumber;
                if (sum % 2 == 0) {
                    num = (sum / 2);
                } else {
                    num = (int) Math.ceil(sum / 2.0);
                }
            }
        }
        System.out.println(num);
    }
}
