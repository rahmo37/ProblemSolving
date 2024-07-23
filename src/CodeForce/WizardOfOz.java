package CodeForce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WizardOfOz {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int noOfTestCases = Integer.parseInt(reader.readLine());
        for(int i = 0; i < noOfTestCases; i++) {
            printLargestNum(Integer.parseInt(reader.readLine()));
        }
    }

    //    The largest number will always start with 989
    public static void printLargestNum(int noOfPanels) {
        String numSet = "0123456789";
        String num = "";
        if (noOfPanels == 1) {
            num += "9";
        } else if (noOfPanels == 2) {
            num += "98";
        } else if (noOfPanels == 3) {
            num += "989";
        } else {
            int remainingPanels = noOfPanels - 3;
            int numOfLoops = remainingPanels / 10;
            int numOfFragments = remainingPanels % 10;
            num += "989";
            for(int i = 0; i < numOfLoops; i++) {
                num += numSet;
            }
            for(int i = 0; i < numOfFragments; i++) {
                num += numSet.charAt(i);
            }
        }
        System.out.println(num);
   }
}
