package LeetCode;

import java.util.Stack;

public class ImplementQueWithStack {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public ImplementQueWithStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public static void main(String[] args) {
        ImplementQueWithStack myQueue = new ImplementQueWithStack();

        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2]
        System.out.println(myQueue.peek()); // returns 1
        System.out.println(myQueue.pop()); // returns 1, queue is now [2]
        System.out.println(myQueue.empty()); // returns false
    }

    // Pushes element x to the back of the queue
    public void push(int x) {
        stack1.push(x);
    }

    // Removes the element from the front of the queue and returns it
    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    // Returns the element at the front of the queue
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Returns true if the queue is empty, false otherwise
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

}
