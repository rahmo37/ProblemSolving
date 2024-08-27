package LeetCode;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        FirstUniqueCharacterInAString solution = new FirstUniqueCharacterInAString();
        System.out.println(solution.firstUniqChar("leetcode"));      // Output: 0
        System.out.println(solution.firstUniqChar("loveleetcode"));  // Output: 2
        System.out.println(solution.firstUniqChar("aabb"));          // Output: -1
    }

    public int firstUniqChar(String s) {
//        My Solution
        int[] frequency = new int[26];
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        int counter = 0;
        for (char each : s.toCharArray()) {
            int index = each - 'a';
            frequency[index]++;
            if (frequency[index] == 1) {
                indexMap.put(index, counter);
            }
            counter++;
        }

        for (char each : s.toCharArray()) {
            if (frequency[each - 'a'] == 1) {

                return indexMap.get(each - 'a');
            }
        }
        return -1;




//        ChatGPT Solution
//        // Queue to store characters and their indices
//        Queue<int[]> queue = new LinkedList<>();
//        // Frequency array to count occurrences of each character
//        int[] frequency = new int[26];
//
//        // Step 1: Count frequency and add characters to the queue
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            frequency[c - 'a']++;  // Increment the frequency of the character
//            queue.offer(new int[]{c, i});  // Add character and its index to the queue
//        }
//
//        // Step 2: Process the queue to find the first non-repeating character
//        while (!queue.isEmpty()) {
//            int[] front = queue.peek();  // Get the character and index from the front of the queue
//            char character = (char) front[0];
//            int index = front[1];
//
//            if (frequency[character - 'a'] == 1) {
//                return index;  // Return the index if the character is non-repeating
//            } else {
//                queue.poll();  // Remove it from the queue if it's repeating
//            }
//        }
//
//        return -1;  // If no non-repeating character is found



//        Another solution
//        public int firstUniqChar(String s) {
//            char[] array = s.toCharArray();
//            int[] count = new int[256];
//
//            for (char c : array) {
//                count[c]++;
//            }
//            for (int i = 0; i < array.length; i++) {
//                if (count[array[i]] == 1) {
//                    return i;
//                }
//            }
//            return -1;
//        }
    }
}
