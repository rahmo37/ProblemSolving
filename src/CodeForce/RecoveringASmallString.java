package CodeForce;

import java.util.Scanner;

public class RecoveringASmallString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCase; i++) {
            int num = Integer.parseInt(sc.nextLine());
            smallestThreeLetterWord(num);
        }
    }

    public static void smallestThreeLetterWord(int num) {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        int encode = num;
        int j = 2;
        int m = 0;
        String[] threeLetterWordArr = new String[3];
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                for (int k = 0; k < threeLetterWordArr.length; k++) {
                    if (threeLetterWordArr[k] == null) {
                        threeLetterWordArr[k] = Character.toString(alph.charAt(encode - 1));
                    }
                }
            } else if (encode > 27) {
                threeLetterWordArr[j] = "z";
                j--;
                encode -= 26;
            } else if (encode <= 27) {
                threeLetterWordArr[m] = "a";
                m++;
                encode -= 1;
            }
        }
        System.out.println(String.join("", threeLetterWordArr));
    }
}
