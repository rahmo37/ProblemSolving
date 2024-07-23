package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks {
    public static void main(String[] args) {
        int[] scores = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(findRelativeRanks(scores)));
    }

    public static String[] findRelativeRanks(int[] score) {
        int length = score.length;
        int[] sortedScores = Arrays.copyOf(score, length);
        String[] answer = new String[length];
        Arrays.sort(sortedScores);
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            indexMap.put(score[i], i);
        }
        for (int j = 0; j < length; j++) {
            if (j == length - 1) {
                answer[indexMap.get(sortedScores[j])] = "Gold Medal";
            } else if (j == length - 2) {
                answer[indexMap.get(sortedScores[j])] = "Silver Medal";
            } else if (j == length - 3) {
                answer[indexMap.get(sortedScores[j])] = "Bronze Medal";
            } else {
                answer[indexMap.get(sortedScores[j])] = Integer.toString(length - j);
            }
        }
        return answer;
    }

//    Another Algorithm
//    int n = score.length;
//    int max = 0;
//        for (int x : score) {
//        if (x > max) {
//            max = x;
//        }
//    }
//    int score_idx[] = new int[max + 1];
//        for (int i = 0; i < n; i++) {
//        score_idx[score[i]] = i + 1;
//    }
//
//    String rank[] = new String[n];
//    int c = 1;
//    String medals[] = { "Gold Medal", "Silver Medal", "Bronze Medal" };
//
//        for (int i = max; i >= 0; i--) {
//        if (score_idx[i] != 0) {
//            int org_idx = score_idx[i] - 1;
//            if (c < 4) {
//                rank[org_idx] = medals[c - 1];
//            } else {
//                rank[org_idx] = Integer.toString(c);
//            }
//            c++;
//        }
//    }
//        return rank;
}
