package CodeForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Advantages {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numOfTestCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < numOfTestCase; i++) {
            int arrLength = Integer.parseInt(br.readLine());
            String[] tokens = br.readLine().split(" ");


            int maxNum = Integer.MIN_VALUE;
            int secondMaxNum = Integer.MIN_VALUE;
            boolean maxNumRepeated = false;
            int[] numArr = new int[arrLength];

            for (int j = 0; j < arrLength; j++) {
                numArr[j] = Integer.parseInt(tokens[j]);
                if (numArr[j] > maxNum) {
                //  This if block's purpose is to change the secondMaxNum to maxNum if current number is
                //  greater than the maxNum

                //  Then the maxNum is changed to current larger number

                //  And maxNumRepeated is changed to false, because currently there isn't repeated maxNum
                    secondMaxNum = maxNum;
                    maxNum = numArr[j];
                    maxNumRepeated = false;
                } else if (numArr[j] == maxNum) {
                //  If there are more than one repeated maxNum, we change the maxNumRepeated to true
                    maxNumRepeated = true;
                } else if (numArr[j] > secondMaxNum) {
                //  Now, if the current number is less than maxNum but greater than secondMaxNum, we change
                //  the secondMaxNum to current number
                    secondMaxNum = numArr[j];
                }
            }

                //  after all iteration if we find the maxNumRepeated is true, meaning there are multiple maxNum we change
                //  the secondMaxNum to maxNum
            if (maxNumRepeated) {
                secondMaxNum = maxNum;
            }

            for (int num : numArr) {
                if (num == maxNum) {
                    bw.write((num - secondMaxNum) + " ");
                } else {
                    bw.write((num - maxNum) + " ");
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
