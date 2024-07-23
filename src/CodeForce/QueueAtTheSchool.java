package CodeForce;

import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nAndt = sc.nextLine().split(" ");
        int n = Integer.parseInt(nAndt[0]);
        int t = Integer.parseInt(nAndt[1]);
        String line = sc.nextLine();
        printTheQueue(n, t, line);
    }

    //    private static String[] returnTheQueue(int n, int t, String line) {
//        StringBuilder newLine = new StringBuilder(line);
//        int j;
//        boolean timeRemaining = false;
//        String[] theQueue = new String[2];
//        for (int i = 0; i < n; i++) {
//            if (newLine.charAt(i) == 'B') {
//                for (j = i + 1; j <= i + t; j++) {
//                    if (j >= newLine.length()) {
//                        break;
//                    }
//                    if (newLine.charAt(j) == 'G') {
//                        char current = newLine.charAt(j);
//                        char previous = newLine.charAt(j - 1);
//                        newLine.setCharAt(j, previous);
//                        newLine.setCharAt(j - 1, current);
//                    } else if (newLine.charAt(j) == 'B') {
//                        if ((i + t) - (j - 1) != 0) {
//                            timeRemaining = true;
//                        }
//                        break;
//                    }
//                }
//                i += j - 1;
//            }
//        }
//        theQueue[0] = newLine.toString();
//        theQueue[1] = Boolean.toString(timeRemaining);
//        return theQueue;
//    }
    private static void printTheQueue(int n, int t, String line) {
        StringBuilder newLine = new StringBuilder(line);
        int seconds = t;

        for (int i = 0; i < seconds; i++) {
            // j < n - 1 because last student does need to swap
            for (int j = 0; j < n - 1; j++) {
                if (newLine.charAt(j) == 'B' && newLine.charAt(j + 1) == 'G') {
                    char current = newLine.charAt(j);
                    char next = newLine.charAt(j + 1);
                    newLine.setCharAt(j, next);
                    newLine.setCharAt(j + 1, current);
                    j++;
                }
            }
        }
        System.out.println(newLine.toString());
    }
}
