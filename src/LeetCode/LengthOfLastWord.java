package LeetCode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String st = "luffy is still joyboy";
        System.out.println(returnLastWord(st));
    }

    private static int returnLastWord(String st) {
        String[] lastWord = st.trim().split(" ");
        return lastWord[lastWord.length - 1].length();
    }

// Another Solution
//    public int lengthOfLastWord(String s) {
//
//        s = s.trim();
//
//        // if s has only 1 character then return 1
//        if (s.length() == 1) {
//            return 1;
//        }
//
//        int result = 0;
//        int i = s.length() - 1;
//
//        // traverse from right to left and increment result until we reach an empty character
//        while (i >= 0 && s.charAt(i) != ' ') {
//            result++;
//            i--;
//        }
//
//        return result;
//
//    }

}
