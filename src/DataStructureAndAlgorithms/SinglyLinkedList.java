package DataStructureAndAlgorithms;

public class SinglyLinkedList {
    // Declaring the head of the list
    private ListNode head;

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        // Initializing and connecting nodes
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        ListNode fifth = new ListNode(11);

        sll.head.nextNode = second; // 10 --> 1
        second.nextNode = third;    // 10 --> 1 --> 8
        third.nextNode = fourth;    // 10 --> 1 --> 8 --> 11
        fourth.nextNode = fifth;    // 10 --> 1 --> 8 --> 11 --> 11

        // Adding new nodes at the beginning
        sll.addNodeAtTheStart(23);
        sll.addNodeAtTheStart(50);

        // Adding new nodes at the end
        sll.addNodeAtTheEnd(39);
        sll.addNodeAtTheEnd(99);

        // Adding a new node at a specific position
        sll.addANewNodeAtTheGivenPosition(100, 5);

//       creates a loop in the linked list
        sll.createLoopInLinkedList();
        ListNode temp = sll.detectALoopAndReturnStartingNode();
        if (temp != null) {
            System.out.println(temp.data);
        } else {
            System.out.println(temp);
        }

        sll.detectALoopAndRemoveIt();


//       detects if there is a loop
//       System.out.println(sll.detectALoopInLL());

//        sll.removeTheGivenKey(50);
        sll.printListData();


        // Uncomment to delete all nodes one by one
        /*
        ListNode curNode;
        do {
            curNode = sll.deleteFirstNode();
            if (curNode != null) {
                System.out.println("Current deleted node: " + curNode.data);
            }
        } while (curNode != null);
        */

        // Uncomment to delete the last node and print the deleted value
        // System.out.println("Last Deleted Node " + sll.deleteTheLastNode().data);

        // Uncomment to search for a value
        // System.out.println(sll.searchForAValue(10));

        // Uncomment to print all values in the list
        // sll.printListData();

        // Uncomment to delete a node at a given position and print the deleted value
        // System.out.println("The Deleted Node is " + sll.deleteANodeInTheGivenPosition(4).data);

        // Reverse the linked list
//        sll.reverseTwoNodes();

        // Remove duplicates from the linked list
//        sll.removeDuplicates();

        // Print all values in the list
//        sll.printListData();

        // Uncomment to print the length of the list
        // System.out.println("Length is: " + sll.printListLength());

        // Uncomment to work with another sorted linked list

//        SinglyLinkedList sll2 = new SinglyLinkedList();
//        sll2.head = new ListNode(10);
//        sll2.head.nextNode = new ListNode(12);
//        sll2.head.nextNode.nextNode = new ListNode(18);
//        sll2.addANodeToASortedLinkedList(new ListNode(14));
//        sll2.printListData();


    }

    // Reverses the linked list
    public void reverseTwoNodes() {
        ListNode first = head;
        ListNode current = head.nextNode;
        while (current != null) {
            first.nextNode = current.nextNode;
            current.nextNode = head;
            head = current;
            current = first.nextNode;
        }
    }

    // Deletes the last node
    public ListNode deleteTheLastNode() {
        if (head == null) return null;
        if (head.nextNode == null) {
            ListNode current = head;
            head = null;
            return current;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.nextNode != null) {
            previous = current;
            current = current.nextNode;
        }
        previous.nextNode = null;
        return current;
    }

    // Prints the length of the list
    public int printListLength() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.nextNode;
        }
        return count;
    }

    // Prints all values in the linked list
    public void printListData() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.nextNode;
        }
        System.out.println("null");
    }

    // Adds a new node at the beginning
    public void addNodeAtTheStart(int value) {
        ListNode newNode = new ListNode(value);
        newNode.nextNode = head;
        head = newNode;
    }

    // Adds a new node at the end
    public void addNodeAtTheEnd(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.nextNode != null) {
            current = current.nextNode;
        }
        current.nextNode = newNode;
    }

    // Adds a new node at a given position
    public void addANewNodeAtTheGivenPosition(int value, int position) {
        ListNode newNode = new ListNode(value);
        if (position == 1) {
            newNode.nextNode = head;
            head = newNode;
        } else {
            ListNode previousNode = head;
            int count = 1;
            while (count < position - 1) {
                previousNode = previousNode.nextNode;
                count++;
            }
            ListNode currentNode = previousNode.nextNode;
            newNode.nextNode = currentNode;
            previousNode.nextNode = newNode;
        }
    }

    // Deletes the first node
    public ListNode deleteFirstNode() {
        if (head == null) return null;
        ListNode temp = head;
        head = head.nextNode;
        temp.nextNode = null;
        return temp;
    }

    // Deletes the node at a given position
    public ListNode deleteANodeInTheGivenPosition(int position) {
        if (position == 1) {
            ListNode current = head;
            head = head.nextNode;
            return current;
        } else {
            ListNode previous = head;
            int counter = 1;
            while (counter < position - 1) {
                previous = previous.nextNode;
                counter++;
            }
            ListNode current = previous.nextNode;
            previous.nextNode = current.nextNode;
            return current;
        }
    }

    // Searches for a value in the list
    public boolean searchForAValue(int searchKey) {
        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }
            current = current.nextNode;
        }
        return false;
    }

    // Removes duplicates from the list
    public void removeDuplicates() {
        ListNode current = head;
        while (current != null && current.nextNode != null) {
            if (current.data == current.nextNode.data) {
                current.nextNode = current.nextNode.nextNode;
            } else {
                current = current.nextNode;
            }
        }
    }

    // Adds a node to a sorted linked list
    public ListNode addANodeToASortedLinkedList(ListNode newNode) {
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.nextNode;
        }
        newNode.nextNode = current;
        if (temp != null) {
            temp.nextNode = newNode;
        } else {
            head = newNode;
        }
        return head;
    }

    // Remove the node with the given key
    public void removeTheGivenKey(int key) {
        ListNode current = head;
        ListNode temp = null;
        if (current.data == key) {
            head = current.nextNode;
            return;
        }
        while (current != null && current.data != key) {
            temp = current;
            current = current.nextNode;
        }
        if (current == null) {
            return;
        } else {
            temp.nextNode = current.nextNode;
        }
    }

    // Creates a loop in the list
    public void createLoopInLinkedList() {
        ListNode current = head;
        while (current.nextNode != null) {
            current = current.nextNode;
        }
        current.nextNode = head.nextNode.nextNode.nextNode.nextNode;
    }

    public Boolean detectALoopInLL() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.nextNode != null) {
            fastPtr = fastPtr.nextNode.nextNode;
            slowPtr = slowPtr.nextNode;
            if (fastPtr == slowPtr) {
                return true;
            }
        }
        return false;
    }

    //    Method that detects a loop and returns the starting of the loop
    public ListNode detectALoopAndReturnStartingNode() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.nextNode != null) {
            fastPtr = fastPtr.nextNode.nextNode;
            slowPtr = slowPtr.nextNode;
            if (fastPtr == slowPtr) {
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }

    //   Returns the starting node
    public ListNode getStartingNode(ListNode slowPtr) {
        ListNode temp = head;
        while (temp != slowPtr) {
            temp = temp.nextNode;
            slowPtr = slowPtr.nextNode;
        }
        return temp;
    }

    // Detects a loop and removes by passing the slowPtr to the next method
    public void detectALoopAndRemoveIt() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.nextNode != null) {
            fastPtr = fastPtr.nextNode.nextNode;
            slowPtr = slowPtr.nextNode;
            if (slowPtr == fastPtr) {
                removeTheLoop(slowPtr);
                return;
            }
        }
    }

    // This method removes the loop
    private void removeTheLoop(ListNode slowPtr) {
        ListNode temp = head;
        while (slowPtr.nextNode != temp.nextNode) {
            slowPtr = slowPtr.nextNode;
            temp = temp.nextNode;
        }
        slowPtr.nextNode = null;
    }


    // Inner class to define nodes
    private static class ListNode {
        private int data;
        private ListNode nextNode;

        public ListNode(int data) {
            this.data = data;
            this.nextNode = null;
        }
    }
}
