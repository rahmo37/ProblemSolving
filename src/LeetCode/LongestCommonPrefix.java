package LeetCode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flght"};
        System.out.println(longestCommonPrefix(strs));
    }


//    public static String longestCommonPrefix(String[] strs) {
//        String lcPrefix = strs[0];
//        String temp = "";
//        for (int i = 1; i < strs.length; i++) {
//            if (lcPrefix.equals("")) {
//                return lcPrefix;
//            }
//            temp = lcPrefix;
//            lcPrefix = "";
//            int smallestLength = temp.length() <= strs[i].length() ? temp.length() : strs[i].length();
//            for (int j = 0; j < smallestLength; j++) {
//                if (temp.charAt(j) == strs[i].charAt(j)) {
//                    lcPrefix += temp.charAt(j);
//                } else {
//                    break;
//                }
//            }
//        }
//        return lcPrefix;
//    }

    // Another Solution Please analyze
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        String start = strs[0];
        String end = strs[strs.length - 1];
        int prefixLen = 0;
        while (prefixLen < start.length() && prefixLen < end.length()) {
            if (start.charAt(prefixLen) == end.charAt(prefixLen)) {
                prefixLen++;
            } else {
                break;
            }
        }
        return start.substring(0, prefixLen);
    }


}
