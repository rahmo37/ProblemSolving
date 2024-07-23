package LeetCode;

public class ReverseALinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = reverseTwoNodes(head);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }


    public static ListNode reverseTwoNodes(ListNode head) {
        ListNode first = head;
        ListNode current = null;
        if (head != null) {
            current = head.next;
        }
        while (current != null) {
            first.next = current.next;
            current.next = head;
            head = current;
            current = first.next;
        }
        return head;
    }
}

