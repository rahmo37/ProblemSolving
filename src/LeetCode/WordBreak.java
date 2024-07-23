package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        String s = "aaaaaaa";
        String[] words = {"aaaa","aaa"};
        List<String> wordDict = new ArrayList<>(Arrays.asList(words));
        System.out.println(wordBreak(s, wordDict));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int end = 1; end <= s.length(); end++) {
            for (int start = 0; start < end; start++) {
                System.out.println(start);
                System.out.println(end);
                if (dp[start] && wordDict.contains(s.substring(start, end))) {
                    dp[end] = true;

                    break; // Found a valid break, no need to check further
                }
            }
        }

        return dp[s.length()];
    }
}

// Solution
// class Solution {
//    public boolean wordBreak(String s, List<String> wordDict) {
//        int[] memo = new int[s.length()];
////         1 = false
//        return backTrack(s, wordDict, 0, memo);
//    }
//
//    public boolean backTrack(String s, List<String> wordDict, int index, int[] memo) {
//        if (index == s.length()) {
//            return true;
//        }
//        if (memo[index] == 1) {
//            return false;
//        }
//        for(int i = 0; i < wordDict.size(); i++) {
//            if (s.startsWith(wordDict.get(i), index)) {
//                if (backTrack(s, wordDict, index+wordDict.get(i).length(), memo)) {
//                    return true;
//                }
//            }
//        }
//        memo[index] = 1;
//        return false;
//    }
//}