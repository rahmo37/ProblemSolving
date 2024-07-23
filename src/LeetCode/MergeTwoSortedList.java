package LeetCode;

public class MergeTwoSortedList {
    // This is the entry point of the program.
    public static void main(String[] args) {
        // Create an instance of the MergeTwoSortedList class to use its methods.
        MergeTwoSortedList solution = new MergeTwoSortedList();

        // Create the first sorted linked list for example 1.
        ListNode list1Example1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        // Create the second sorted linked list for example 1.
        ListNode list2Example1 = new ListNode(1, new ListNode(3, new ListNode(4)));

        // Merge the two sorted linked lists for example 1.
        ListNode mergedExample1 = solution.mergeTwoLists(list1Example1, list2Example1);
        // Print the merged linked list for example 1.
        solution.printList(mergedExample1); // Output: 1 1 2 3 4 4




        // Create two empty linked lists for example 2.
        ListNode list1Example2 = null; // Empty list
        ListNode list2Example2 = null; // Empty list
        // Merge the two empty linked lists for example 2.
        ListNode mergedExample2 = solution.mergeTwoLists(list1Example2, list2Example2);
        // Print the merged linked list for example 2, which will be empty.
        solution.printList(mergedExample2); // Output: (nothing)

        // Create an empty linked list and a single-node linked list for example 3.
        ListNode list1Example3 = null; // Empty list
        ListNode list2Example3 = new ListNode(0); // Single-node list with value 0
        // Merge the empty list and the single-node list for example 3.
        ListNode mergedExample3 = solution.mergeTwoLists(list1Example3, list2Example3);
        // Print the merged linked list for example 3, which will have a single node with value 0.
        solution.printList(mergedExample3); // Output: 0
    }

    // This method merges two sorted linked lists into one sorted linked list.
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node as a starting point for the new merged list.
        ListNode dummy = new ListNode(0);
        // This will be used to add nodes to the merged list.
        ListNode current = dummy;

        // Iterate over both lists as long as neither is empty.
        while (list1 != null && list2 != null) {
            // Compare the current nodes of both lists.

            if (list1.val < list2.val) {
                // Attach the smaller node to the merged list.
                current.next = list1;
                // Move to the next node in list1.
                list1 = list1.next;
            } else {
                // Attach the smaller (or equal) node to the merged list.
                current.next = list2;
                // Move to the next node in list2.
                list2 = list2.next;
            }
            // Move to the next position in the merged list.
            current = current.next;
        }

        // If one of the lists is not empty, attach the remaining elements to the end of the merged list.
        // We were able to od this because the elements are in a sorted order
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Skip the dummy node and return the head of the merged list.
        return dummy.next;


//        Explanation of how the whole logic is working (d53 or aca are just imaginary object space in memory)
//        Initial State:
//
//dummy points to an object at address d53.
//current also points to the same object at d53.
//First Merge:
//
//You set current.next = aca. This means you are setting the next property of the object at d53 to point to another object at address aca. In other words, d53.next = aca.
//At this moment, dummy.next also points to aca because dummy and current are still referencing the same object (d53).
//Move current:
//
//Now, you do current = current.next, which means current now points to aca.
//Continuing the Process:
//
//You continue this process, setting current.next to point to the next appropriate node (c15, fb5, etc.), and then moving current to current.next.
//Linked Chain:
//
//Throughout this process, each node's next property is set to point to the subsequent node, creating a chain of linked nodes.
//Access Through dummy:
//
//Since dummy.next was set to aca in the first merge step and dummy itself has not been moved or changed, it retains its reference to the beginning of this chain.
//Therefore, by accessing dummy.next, you can traverse the entire chain of linked nodes (aca, c15, fb5, etc.) because each node is linked to the next via its next property.
//In summary, dummy acts as a fixed entry point to the merged list. Even though current moves along the list to link the nodes, dummy.next always points to the first node of the merged list, providing access to the entire sequence of linked nodes.
    }

    // This method prints the elements of the linked list.
    public void printList(ListNode node) {
        // Iterate over the linked list until the end is reached.
        while (node != null) {
            // Print the current node's value.
            System.out.print(node.val + " ");
            // Move to the next node.
            node = node.next;
        }
        // Print a newline at the end of the list.
        System.out.println();
    }
}

// This class defines the nodes used in the linked list.
class ListNode {
    // Value stored in the node.
    int val;
    // Reference to the next node in the list.
    ListNode next;

    // Default constructor.
    ListNode() {
    }

    // This constructor initializes a node with a given value and the next node as null.
    ListNode(int val) {
        this.val = val;
    }

    // Constructor with node value and reference to the next node.
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
