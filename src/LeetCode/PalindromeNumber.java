package LeetCode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }

    private static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int p1 = 0;
        int p2 = s.length() - 1;
        while (p1 <= p2) {
            if (s.charAt(p1) != s.charAt(p2)) {
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }

//    Another Solution
//    public boolean isPalindrome(int x) {
//        int building = 0;
//        int start = x;
//        while (start > 0) {
//            building = (building * 10) + (start % 10);
//            start = start / 10;
//        }
//        return building == x;
//    }
}
