package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FollowingDirection1791B {

    public static String followDirection(String[] directionArr) {
        int[] positionArr = {0, 0};
        for (int i = 0; i < directionArr.length; i++) {
            if (directionArr[i].equals("L")) {
                positionArr[0] = positionArr[0] - 1;
            } else if (directionArr[i].equals("R")) {
                positionArr[0] = positionArr[0] + 1;
            } else if (directionArr[i].equals("U")) {
                positionArr[1] = positionArr[1] + 1;
            } else if (directionArr[i].equals("D")) {
                positionArr[1] = positionArr[1] - 1;
            }
            if (positionArr[0] == 1 && positionArr[1] == 1) {
                return "YES";
            }
        }
        return "NO";
    }

    public static boolean isNumber(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numOfInput = Integer.parseInt(reader.readLine()) * 2;
        String[] directionArr = new String[numOfInput];
        int i = 0;
        while(i < numOfInput) {
            directionArr[i] = reader.readLine();
            i++;
        }
        System.out.println(Arrays.toString(directionArr));
        for(int j = 0; j < directionArr.length; j++) {
            if(!isNumber(directionArr[j])) {
                System.out.println(followDirection(directionArr[j].split("")));
            }
        }
    }
}
