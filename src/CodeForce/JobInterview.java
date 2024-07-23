package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class JobInterview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int a = 0; a < testCases; a++) {
            String[] nm = sc.nextLine().split(" ");
            String[] pSkill = sc.nextLine().split(" ");
            int len = pSkill.length;
            String[] tSkill = sc.nextLine().split(" ");
            int[] result = new int[len];
            String[][] assocPositions = new String[len][2];
            for (int b = 0; b < len; b++) {
                assocPositions[b] = Arrays.copyOf(nm, nm.length);
            }

            for (int i = 1; i < len; i++) {
                for (int j = 0; j < i; j++) {
                    int pPosition = 0;
                    int tPosition = 0;
                    if (Integer.parseInt(pSkill[i]) > Integer.parseInt(tSkill[i])) {
                        pPosition = Integer.parseInt(assocPositions[j][0]);
                        tPosition = Integer.parseInt(assocPositions[j][1]);
                        if (pPosition > 0) {
                            result[j] += Integer.parseInt(pSkill[i]);
                            assocPositions[j][0] = String.valueOf(Integer.parseInt(assocPositions[j][0]) - 1);
                        } else {
                            result[j] += Integer.parseInt(tSkill[i]);
                            assocPositions[j][1] = String.valueOf(Integer.parseInt(assocPositions[j][1]) - 1);
                        }
                    } else {
                        pPosition = Integer.parseInt(assocPositions[j][0]);
                        tPosition = Integer.parseInt(assocPositions[j][1]);
                        if (tPosition > 0) {
                            result[j] += Integer.parseInt(tSkill[i]);
                            assocPositions[j][1] = String.valueOf(Integer.parseInt(assocPositions[j][1]) - 1);
                        } else {
                            result[j] += Integer.parseInt(pSkill[i]);
                            assocPositions[j][0] = String.valueOf(Integer.parseInt(assocPositions[j][0]) - 1);
                        }
                    }


                    if (Integer.parseInt(pSkill[j]) > Integer.parseInt(tSkill[j])) {
                        pPosition = Integer.parseInt(assocPositions[i][0]);
                        tPosition = Integer.parseInt(assocPositions[i][1]);
                        if (pPosition > 0) {
                            result[i] += Integer.parseInt(pSkill[j]);
                            assocPositions[i][0] = String.valueOf(Integer.parseInt(assocPositions[i][0]) - 1);
                        } else {
                            result[i] += Integer.parseInt(tSkill[j]);
                            assocPositions[i][1] = String.valueOf(Integer.parseInt(assocPositions[i][1]) - 1);
                        }
                    } else {
                        pPosition = Integer.parseInt(assocPositions[i][0]);
                        tPosition = Integer.parseInt(assocPositions[i][1]);
                        if (tPosition > 0) {
                            result[i] += Integer.parseInt(tSkill[j]);
                            assocPositions[i][1] = String.valueOf(Integer.parseInt(assocPositions[i][1]) - 1);
                        } else {
                            result[i] += Integer.parseInt(pSkill[j]);
                            assocPositions[i][0] = String.valueOf(Integer.parseInt(assocPositions[i][0]) - 1);
                        }
                    }
                }
            }
            for(int each : result) {
                System.out.print(each + " ");
            }
            System.out.println();
        }
    }
}
