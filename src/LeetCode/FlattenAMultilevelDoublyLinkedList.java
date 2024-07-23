package LeetCode;

public class FlattenAMultilevelDoublyLinkedList {
    public static Node flatten(Node head) {
        if (head == null) {
            return head;
        }
        Node first = head, second = null;
        while (first != null) {
            if (first.child != null) {
                second = first.child;
                if (second.child != null) {
                    flatten(second);
                }
                while (second.next != null) {
                    if (second.next != null) {
                        second = second.next;
                    }
                    if (second.child != null) {
                        flatten(second);
                    }
                }
                second.next = first.next;
                if (first.next != null) {
                    first.next.prev = second;
                }
                first.next = first.child;
                first.child.prev = first;
                first.child = null;
                first = second;
            }
            first = first.next;
        }


        return head;


//        if (head == null) {
//            return head;
//        }
//
//        Node current = head;
//        while (current != null) {
//            // If current node has a child
//            if (current.child != null) {
//                // Store the next node
//                Node next = current.next;
//
//                // Flatten the child list
//                Node child = flatten(current.child);
//
//                // Connect current node to child
//                current.next = child;
//                child.prev = current;
//                current.child = null;
//
//                // Find the tail of the flattened child
//                while (current.next != null) {
//                    current = current.next;
//                }
//
//                // Connect tail to next node
//                if (next != null) {
//                    current.next = next;
//                    next.prev = current;
//                }
//            }
//            current = current.next;
//        }
//        return head;
    }

    public static void main(String[] args) {
        // Create nodes
//        Node n1 = new Node(1);
//        Node n2 = new Node(2);
//        Node n3 = new Node(3);
//        Node n4 = new Node(4);
//        Node n5 = new Node(5);
//        Node n6 = new Node(6);
//        Node n7 = new Node(7);
//        Node n8 = new Node(8);
//        Node n9 = new Node(9);
//        Node n10 = new Node(10);
//        Node n11 = new Node(11);
//        Node n12 = new Node(12);
//
//        // Main list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
//        n1.next = n2;
//        n2.prev = n1;
//        n2.next = n3;
//        n3.prev = n2;
//        n3.next = n4;
//        n4.prev = n3;
//        n4.next = n5;
//        n5.prev = n4;
//        n5.next = n6;
//        n6.prev = n5;
//
//        // Child of 3: 7 -> 8 -> 9 -> 10
//        n3.child = n7;
//        n7.next = n8;
//        n8.prev = n7;
//        n8.next = n9;
//        n9.prev = n8;
//        n9.next = n10;
//        n10.prev = n9;
//
//        // Child of 8: 11 -> 12
//        n8.child = n11;
//        n11.next = n12;
//        n12.prev = n11;


        // Create nodes
//        Node n1 = new Node(1);
//        Node n2 = new Node(2);
//        Node n3 = new Node(3);
//        Node n4 = new Node(4);
//        Node n5 = new Node(5);
//        Node n6 = new Node(6);
//        Node n7 = new Node(7);
//        Node n8 = new Node(8);
//
//        // Main list: 1 -> 2 -> 3 -> 4
//        n1.next = n2;
//        n2.prev = n1;
//        n2.next = n3;
//        n3.prev = n2;
//        n3.next = n4;
//        n4.prev = n3;
//
//        // Child of 2: 5 -> 6
//        n2.child = n5;
//        n5.next = n6;
//        n6.prev = n5;
//
//        // Child of 5: 7 -> 8
//        n5.child = n7;
//        n7.next = n8;
//        n8.prev = n7;


        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        // Main list: 1 -> 2 -> 3
        n1.child = n2;
        n2.child = n3;


        // Flatten the list
        Node flattenedHead = flatten(n1);

        // Print the flattened list
        printList(flattenedHead);
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        Node() {

        }

        Node(int val) {
            this.val = val;
        }
    }
}

//    Another Solution
//    public Node flatten(Node head) {
//        Node curr=head;
//
//        while(curr != null){
//            if(curr.child != null){
//                Node tail = findTail(curr.child);
//
//                if(curr.next != null){
//                    curr.next.prev=tail;
//                }
//                tail.next=curr.next;
//                curr.next=curr.child;
//                curr.child.prev=curr;
//                curr.child=null;
//            }
//
//            curr = curr.next;
//
//        }
//
//        return head;
//
//    }
//
//    public Node findTail(Node child){
//
//        while(child.next != null){
//            child=child.next;
//        }
//        return child;
//    }