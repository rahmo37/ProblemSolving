package LeetCode;

import java.util.*;

public class WordLadder {
    public static void main(String[] args) {
        WordLadder wl = new WordLadder();
        List<String> wordList1 = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        System.out.println(wl.ladderLength("hit", "cog", wordList1)); // Output: 5

        List<String> wordList2 = Arrays.asList("hot", "dot", "dog", "lot", "log");
        System.out.println(wl.ladderLength("hit", "cog", wordList2)); // Output: 0
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                char[] wordChars = currentWord.toCharArray();

                for (int j = 0; j < wordChars.length; j++) {
                    char originalChar = wordChars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == originalChar) continue;
                        wordChars[j] = c;
                        String newWord = String.valueOf(wordChars);

                        if (newWord.equals(endWord)) {
                            return level + 1;
                        }

                        if (wordSet.contains(newWord)) {
                            queue.add(newWord);
                            wordSet.remove(newWord);
                        }
                    }
                    wordChars[j] = originalChar;
                }
            }
            level++;
        }

        return 0;
    }
}
// Another Solution
//class Solution {
//    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
//        Set<String> begin = new HashSet<>();
//        Set<String> end = new HashSet<>();
//        Set<String> word = new HashSet<>(wordList);
//        if(!word.contains(endWord)) return 0;
//        begin.add(beginWord);
//        end.add(endWord);
//        return dfs(begin, end , word, 1);
//    }
//    public int dfs(Set<String> begin, Set<String> end, Set<String> word, int res){
//        if(begin.size() == 0) return 0;
//        if(begin.size() > end.size()) return dfs(end, begin, word, res);
//        for(String w : begin) word.remove(w);
//        Set<String> next = new HashSet<>();
//        for(String curr : begin){
//            char[] ch = curr.toCharArray();
//            for(int i = 0 ; i < ch.length; i++){
//                char c = ch[i];
//                for(char j = 'a'; j <= 'z'; j++){
//                    ch[i] = j;
//                    String neighbor = new String(ch);
//                    if(word.contains(neighbor)){
//                        if(end.contains(neighbor)) return res + 1;
//                        next.add(neighbor);
//                    }
//                    ch[i] = c;
//                }
//            }
//        }
//        return dfs(next, end, word, res + 1);
//    }
//}
