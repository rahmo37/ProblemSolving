package AlgoExpert;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String input = "{{{{{{}}}}}}";
        System.out.println(balancedBrackets(input));

    }


    public static boolean balancedBrackets(String str) {
        String openings = "({[";
        String closings = ")}]";
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String each = Character.toString(str.charAt(i));
            if (openings.contains(each)) {
                stack.push(each);
            } else if(closings.contains(each)){
                if (stack.isEmpty()) {
                    return false;
                }
                if (closings.indexOf(each) != openings.indexOf(stack.pop())) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
