package LeetCode;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null && strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> listContainer = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] wordToLetters = strs[i].toCharArray();
            Arrays.sort(wordToLetters);
//            System.out.println(Arrays.toString(wordToLetters));
            String sortedStr = String.valueOf(wordToLetters);
//            System.out.println(sortedStr);
            if (!listContainer.containsKey(sortedStr)) {
                listContainer.put(sortedStr, new ArrayList<>());
            }
            listContainer.get(sortedStr).add(strs[i]);
        }

        return new ArrayList<>(listContainer.values());
    }
}


// Another Solution

//import java.util.*;
//class Solution {
//    // public List<List<String>> groupAnagrams(String[] strs) {
//    //     Map<String, List<String>> anagramGroups = new HashMap<>();
//
//    //     for(String word : strs) {
//    //         char[] chArray = word.toCharArray();
//    //         Arrays.sort(chArray);
//    //         String sortedWord = String.valueOf(chArray);
//    //         List<String> group = anagramGroups.getOrDefault(sortedWord, new ArrayList<>());
//    //         group.add(word);
//    //         anagramGroups.put(sortedWord, group);
//    //     }
//
//    //       return new ArrayList<>(anagramGroups.values());
//    // }
//    public List<List<String>> groupAnagrams(String[] strs) {
//        return new AbstractList<List<String>>() {
//
//            private List<List<String>> ans;
//
//            @Override
//            public List<String> get(int index) {
//                if (ans == null) {
//                    init();
//                }
//                return ans.get(index);
//            }
//
//            @Override
//            public int size() {
//                if (ans == null) {
//                    init();
//                }
//                return ans.size();
//            }
//
//            private void init() {
//                Map<String, List<String>> group = new HashMap<>();
//
//                for(String word : strs) {
//                    int[] count = new int[26];
//                    char[] chArray = word.toCharArray();
//                    for (char ch : chArray) {
//                        count[ch - 'a']++;
//                    }
//                    StringBuilder sb = new StringBuilder();
//                    for(int i=0; i< 26; i++) {
//                        if (count[i]!=0){
//                            sb.append(i + 'a').append(count[i]);
//                        }
//                    }
//                    group.computeIfAbsent(sb.toString(), val -> new ArrayList<>()).add(word);
//                }
//                ans = new ArrayList(group.values());
//            }
//
//        };
//    }
//}
