package LeetCode;

public class ReverseLinkedListII {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        int left = 1;
        int right = 1;

        ListNode result = reverseBetween(head, left, right);

        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode previous = dummy;
        int counter = 0;
        if (left == right) {
            return head;
        }
        while (counter < left - 1) {
            previous = previous.next;
            counter++;
        }
        ListNode first = previous.next;
        ListNode current = null;
        while(left < right) {
            current = first.next;
            first.next = current.next;
            current.next = previous.next;
            previous.next = current;
            left++;
        }
        return dummy.next;
    }
}
