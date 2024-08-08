package DataStructureAndAlgorithms;

import java.util.EmptyStackException;

public class Stack {

    private ListNode top;
    private int length;

    Stack() {
        this.top = null;
        this.length = 0;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(15);
        System.out.println(stack.peek());
        stack.push(10);
        stack.push(25);
        stack.push(20);
        stack.pop();
        System.out.println(stack.getLength());
        System.out.println(stack.isEmpty());
        stack.printStack();
    }

    public int getLength() {
        return this.length;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = this.top;
        this.top = temp;
        this.length++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }


    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public void printStack() {
        if (this.top == null) {
            System.out.println("No elements exists");
            return;
        }
        ListNode temp = this.top;
        boolean isFirst = true;
        while (temp != null) {
            if (isFirst) {
                System.out.print(" (Top --> " + this.top.data + ") --> ");
                isFirst = false;
            } else {
                System.out.print(temp.data + " --> ");
            }
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
