package DataStructureAndAlgorithms;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {

    private ListNode last; // Reference to the last node in the list
    private int length; // The number of nodes in the list

    // Constructor to initialize an empty list
    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList(); // Create a new circular singly linked list
        csll.createCircularLinkedList(); // Create and initialize the list with some nodes
        csll.addANodeToTheBeginning(20); // Add a node with data 20 at the beginning of the list
        csll.addANodeToTheEnd(120); // Add a node with data 120 at the end of the list
        csll.removeFirstNode(); // Remove the first node from the list
        csll.printTheList(); // Print all nodes in the list
        System.out.println(csll.length);
    }

    // Return the number of nodes in the list
    public int getLength() {
        return length;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return length == 0;
    }

    // Create and initialize the circular singly linked list with four nodes
    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(15);
        ListNode third = new ListNode(16);
        ListNode fourth = new ListNode(19);

        // Link the nodes together to form a circular structure
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth; // Update the last node reference
        length = 4; // Update the length of the list
    }

    // Add a new node with the given data at the beginning of the list
    public void addANodeToTheBeginning(int data) {
        ListNode newNode = new ListNode(data); // Create a new node
        ListNode temp = newNode; // Temporary reference to the new node
        if (last == null) { // If the list is empty
            last = temp; // Set last to the new node
        } else {
            temp.next = last.next; // Link the new node to the first node
        }
        last.next = temp; // Update the last node to point to the new first node
        length++; // Increase the length of the list
    }

    // Remove the first node from the list and return it
    public ListNode removeFirstNode() {
        if (isEmpty()) { // If the list is empty, throw an exception
            throw new NoSuchElementException();
        }
        ListNode temp = last.next; // Reference to the first node
        if (last.next == last) { // If there's only one node in the list
            last = null; // Set last to null
        } else {
            last.next = temp.next; // Update the last node to point to the second node
        }
        temp.next = null; // Remove the reference from the first node
        length--; // Reduces the length by 1
        return temp; // Return the removed node
    }

    // Add a new node with the given data at the end of the list
    public void addANodeToTheEnd(int data) {
        ListNode newNode = new ListNode(data); // Create a new node
        ListNode temp = newNode; // Temporary reference to the new node
        if (last == null) { // If the list is empty
            last = temp; // Set last to the new node
            last.next = last; // Point the new node to itself
        } else {
            temp.next = last.next; // Link the new node to the first node
            last.next = temp; // Update the last node to point to the new node
            last = temp; // Update last to the new node
        }
        length++; // Increase the length of the list
    }

    // Print all nodes in the list
    public void printTheList() {
        if (last == null) { // If the list is empty, return
            return;
        }
        ListNode first = last.next; // Reference to the first node
        while (first != last) { // Loop until we reach the last node
            System.out.print(first.data + " "); // Print the data of each node
            first = first.next; // Move to the next node
        }
        System.out.println(first.data + " "); // Print the data of the last node
    }

    // Inner class to represent a node in the list
    private class ListNode {
        private ListNode next; // Reference to the next node
        private int data; // Data stored in the node

        // Constructor to create a node with the given data
        public ListNode(int data) {
            this.data = data;
        }
    }
}
