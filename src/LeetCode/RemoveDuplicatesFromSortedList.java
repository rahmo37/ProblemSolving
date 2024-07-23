package LeetCode;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        Node1 linkedList = new Node1(1, new Node1(2, new Node1(2)));
        Node1 linkedList1 = new Node1(1, new Node1(1, new Node1(2, new Node1(3, new Node1(3)))));

        linkedList = deleteDuplicates(linkedList);
        linkedList1 = deleteDuplicates(linkedList1);

        printList(linkedList);  // Expected Output: 1 2
        System.out.println();
        printList(linkedList1); // Expected Output: 1 2 3
    }

    public static Node1 deleteDuplicates(Node1 head) {
        if (head == null) return null;

        Node1 current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip the duplicate
                current.next = current.next.next;
            } else {
                // Move to the next distinct element
                current = current.next;
            }
        }

        return head;
    }

    private static void printList(Node1 head) {
        Node1 current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

class Node1 {
    int val;
    Node1 next;

    Node1() {}

    Node1(int val) {
        this.val = val;
    }

    Node1(int val, Node1 next) {
        this.val = val;
        this.next = next;
    }
}
