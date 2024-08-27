package DataStructureAndAlgorithms.Stack; // Declare the package

public class StackWithArray {
    private int top; // Variable to keep track of the top index of the stack
    private int[] arr; // Array to store stack elements

    // Constructor to initialize the stack with a given capacity
    public StackWithArray(int capacity) {
        this.top = -1; // Initialize top to -1 indicating an empty stack
        this.arr = new int[capacity]; // Initialize the array with the given capacity
    }

    // Default constructor with a default capacity of 10
    public StackWithArray() {
        this(10); // Call the other constructor with capacity 10
    }

    public static void main(String[] args) {
        StackWithArray stack = new StackWithArray(3); // Create a stack with capacity 3
        stack.push(5); // Push 5 onto the stack
        stack.push(50); // Push 50 onto the stack
        stack.push(500); // Push 500 onto the stack
        stack.printStack(); // Print the current stack
        stack.pop(); // Pop the top element from the stack
        stack.push(10); // Push 10 onto the stack
        stack.printStack(); // Print the current stack
        System.out.println(stack.peek()); // Print the top element of the stack
    }

    // Method to check if the stack is full
    private boolean isFull() {
        return this.arr.length == size(); // Return true if the array length is equal to the stack size
    }

    // Method to check if the stack is empty
    private boolean isEmpty() {
        return this.top < 0; // Return true if top is less than 0
    }

    // Method to get the current size of the stack
    private int size() {
        return this.top + 1; // Return the number of elements in the stack
    }

    // Method to push an element onto the stack
    public void push(int data) {
        if (isFull()) { // Check if the stack is full
            throw new RuntimeException(); // Throw an exception if the stack is full
        }
        this.top++; // Increment the top index
        arr[this.top] = data; // Assign the data to the top position of the stack
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) { // Check if the stack is empty
            throw new RuntimeException("No element to pop"); // Throw an exception if the stack is empty
        }
        int val = arr[top]; // Get the top element
        arr[this.top] = 0; // Optional: Clear the top element (not necessary for stack functionality)
        this.top--; // Decrement the top index
        return val; // Return the popped element
    }

    // Method to peek the top element of the stack
    public int peek() {
        if (isEmpty()) { // Check if the stack is empty
            throw new RuntimeException("Nothing to peek at"); // Throw an exception if the stack is empty
        }
        return arr[this.top]; // Return the top element
    }

    // Method to print the stack elements
    public void printStack() {
        for (int i = this.top; i >= 0; i--) { // Loop from top to bottom
            System.out.print(arr[i] + " --> "); // Print each element followed by an arrow
        }
        System.out.println(); // Print a newline at the end
    }
}
