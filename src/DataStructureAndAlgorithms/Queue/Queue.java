package DataStructureAndAlgorithms.Queue;

import java.util.NoSuchElementException;

public class Queue {
    ListNode front; // The front of the queue, where elements are dequeued from
    ListNode rear; // The rear of the queue, where elements are enqueued
    int length; // The current size of the queue

    public Queue() {
        this.front = null; // Initialize the front to null (empty queue)
        this.rear = null; // Initialize the rear to null (empty queue)
        this.length = 0; // Initialize the length to 0 (empty queue)
    }

    public static void main(String[] args) {
        Queue queue = new Queue(); // Create a new Queue instance
        queue.enqueue(12); // Enqueue the value 12 into the queue
        queue.enqueue(22); // Enqueue the value 22 into the queue
        queue.enqueue(32); // Enqueue the value 32 into the queue
        queue.enqueue(42); // Enqueue the value 42 into the queue
        queue.dequeue(); // Dequeue an element from the queue (removes 12)
        queue.dequeue(); // Dequeue an element from the queue (removes 22)
        System.out.println(queue.returnFirstElement());
        System.out.println(queue.returnLastElement());
        queue.printQueue(); // Print the current state of the queue
    }

    public int size() {
        return this.length; // Return the current size of the queue
    }

    public boolean isEmpty() {
        return this.size() == 0; // Check if the queue is empty (length is 0)
    }

    public void enqueue(int data) {
        ListNode newNode = new ListNode(data); // Create a new node with the given data
        if (this.isEmpty()) { // If the queue is empty
            this.front = newNode; // Set the front to the new node
        } else {
            this.rear.next = newNode; // Link the current rear node to the new node
        }
        this.rear = newNode; // Update the rear to the new node
        this.length++; // Increment the length of the queue
    }

    public int dequeue() {
        if (this.isEmpty()) { // If the queue is empty
            throw new NoSuchElementException("No more elements left"); // Throw an exception (cannot dequeue from an empty queue)
        }
        int result = this.front.data; // Get the data from the front node
        this.front = this.front.next; // Move the front to the next node
        if (this.front == null) { // If the queue is now empty after dequeuing
            this.rear = null; // Set the rear to null as well
        }
        this.length--; // Decrement the length of the queue
        return result; // Return the data from the dequeued node
    }

    public int returnFirstElement() {
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        }
        return this.front.data;
    }

    public int returnLastElement() {
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        }
        return this.rear.data;
    }

    public void printQueue() {
        ListNode temp = this.front; // Start from the front of the queue
        while (temp != null) { // Traverse the queue until the end
            System.out.print(temp.data + " --> "); // Print the data of the current node
            temp = temp.next; // Move to the next node
        }
        System.out.println("null"); // Print null to indicate the end of the queue
    }

}
