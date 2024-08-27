package DataStructureAndAlgorithms.Stack; // Declare the package

import java.util.EmptyStackException; // Import the EmptyStackException class

public class StackWithLinkedList {

    private ListNode top; // Node to keep track of the top of the stack
    private int length; // Variable to keep track of the size of the stack

    // Constructor to initialize the stack
    StackWithLinkedList() {
        this.top = null; // Initialize top to null indicating an empty stack
        this.length = 0; // Initialize length to 0
    }

    public static void main(String[] args) {
        StackWithLinkedList stack = new StackWithLinkedList(); // Create a new stack
        stack.push(15); // Push 15 onto the stack
        System.out.println(stack.peek()); // Print the top element of the stack
        stack.push(10); // Push 10 onto the stack
        stack.push(25); // Push 25 onto the stack
        stack.push(20); // Push 20 onto the stack
        stack.pop(); // Pop the top element from the stack
        System.out.println(stack.getLength()); // Print the current size of the stack
        System.out.println(stack.isEmpty()); // Print if the stack is empty
        stack.printStack(); // Print the current stack
    }

    // Method to get the current size of the stack
    public int getLength() {
        return this.length; // Return the length of the stack
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return this.length == 0; // Return true if the length is 0
    }

    // Method to push an element onto the stack
    public void push(int data) {
        ListNode temp = new ListNode(data); // Create a new node with the given data
        temp.next = this.top; // Set the next of the new node to the current top
        this.top = temp; // Update the top to the new node
        this.length++; // Increment the length of the stack
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) { // Check if the stack is empty
            throw new EmptyStackException(); // Throw an exception if the stack is empty
        }
        int result = top.data; // Get the data from the top node
        top = top.next; // Update the top to the next node
        length--; // Decrement the length of the stack
        return result; // Return the popped element
    }

    // Method to peek the top element of the stack
    public int peek() {
        if (isEmpty()) { // Check if the stack is empty
            throw new EmptyStackException(); // Throw an exception if the stack is empty
        }
        return top.data; // Return the data from the top node
    }

    // Method to print the stack elements
    public void printStack() {
        if (this.top == null) { // Check if the stack is empty
            System.out.println("No elements exist"); // Print message if stack is empty
            return;
        }
        ListNode temp = this.top; // Start from the top node
        boolean isFirst = true; // Flag to indicate the first element
        while (temp != null) { // Traverse through the stack
            if (isFirst) { // If it's the first element
                System.out.print(" (Top --> " + this.top.data + ") --> "); // Print the top element
                isFirst = false; // Set the flag to false
            } else {
                System.out.print(temp.data + " --> "); // Print the current element
            }
            temp = temp.next; // Move to the next node
        }
        System.out.println("null"); // Print null at the end
    }

    // Inner class to represent a node in the linked list
    private static class ListNode {
        private int data; // Data of the node
        private ListNode next; // Reference to the next node

        // Constructor to initialize the node
        public ListNode(int data) {
            this.data = data; // Set the data
            this.next = null; // Initialize next to null
        }
    }
}
