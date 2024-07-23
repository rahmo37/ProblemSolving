package LeetCode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "(){}}{";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        char firstChar = s.charAt(0);
        Stack<Character> stackOfParentheses = new Stack<>();
        if (firstChar == '}' || firstChar == ']' || firstChar == ')' || s.length() % 2 != 0) {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                    stackOfParentheses.push(s.charAt(i));
                } else {
                    if (stackOfParentheses.empty()) {
                        return false;
                    } else if (stackOfParentheses.peek() == '{') {
                        if (s.charAt(i) == '}') {
                            stackOfParentheses.pop();
                        } else {
                            return false;
                        }

                    } else if (stackOfParentheses.peek() == '[') {
                        if (s.charAt(i) == ']') {
                            stackOfParentheses.pop();
                        } else {
                            return false;
                        }
                    } else if (stackOfParentheses.peek() == '(') {
                        if (s.charAt(i) == ')') {
                            stackOfParentheses.pop();
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        if (stackOfParentheses.empty()) {
            return true;
        } else {
            return false;
        }
    }
}
