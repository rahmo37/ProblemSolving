package DataStructureAndAlgorithms;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private ListNode head; // Reference to the head of the list
    private ListNode tail; // Reference to the tail of the list
    private int length; // Length of the list

    // Constructor to initialize an empty list
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(10);
        dll.insertLast(11);
        dll.deleteFirstNode();
        dll.deleteFirstNode();
        dll.printTheListBackward();
    }

    public ListNode deleteFirstNode() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if(head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return this.length == 0;
    }

    // Get the length of the list
    public int length() {
        return this.length;
    }

    // Insert a node at the beginning of a linked list
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            this.tail = newNode;
        } else {
            this.head.previous = newNode;
        }
        newNode.next = this.head;
        this.head = newNode;
        this.length++;
    }


    // Insert a node at the end of the list
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (this.isEmpty()) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }
        newNode.previous = this.tail;
        this.tail = newNode;
        this.length++;
    }

    // Print the list from head to tail
    public void printTheListForward() {
        if(head == null) {
            System.out.println("no nodes to print");
            return;
        }
        ListNode temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp); // Will print null at the end
    }

    // Print the list from tail to head
    public void printTheListBackward() {
        if(tail == null) {
            System.out.println("no nodes to print");
            return;
        }
        ListNode temp = this.tail;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.println(temp); // Will print null at the end
    }

    // Inner class to represent a node in the doubly linked list
    private class ListNode {
        private int data; // Data of the node
        private ListNode next; // Reference to the next node
        private ListNode previous; // Reference to the previous node

        // Constructor to initialize the node with data
        public ListNode(int data) {
            this.data = data;
        }
    }
}
