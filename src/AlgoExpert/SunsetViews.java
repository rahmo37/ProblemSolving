package AlgoExpert;

import java.util.ArrayList;
import java.util.Stack;

public class SunsetViews {
    public static void main(String[] args) {
        System.out.println(sunsetViews(new int[]{}, "WEST"));
    }


    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        if (buildings.length == 0) {
            return result;
        }
        if (direction.equals("EAST")) {
            stack.push(0);
            for (int i = 1; i < buildings.length; i++) {
                if (buildings[i] < buildings[stack.peek()]) {
                    stack.push(i);
                } else {
                    while (buildings[i] >= buildings[stack.peek()]) {
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(i);
                            break;
                        }
                    }
                }
                if (stack.peek() != i) {
                    stack.push(i);
                }
            }
            return new ArrayList<Integer>(stack);
        } else {

            stack.push(buildings.length - 1);
            for (int i = buildings.length - 2; i >= 0; i--) {
                if (buildings[i] < buildings[stack.peek()]) {
                    stack.push(i);
                } else {
                    while (buildings[i] >= buildings[stack.peek()]) {
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(i);
                            break;
                        }
                    }
                }
                if (stack.peek() != i) {
                    stack.push(i);
                }
            }
            while (!stack.isEmpty()) {
                result.add(stack.pop());
            }
            return result;
        }


    }


}
