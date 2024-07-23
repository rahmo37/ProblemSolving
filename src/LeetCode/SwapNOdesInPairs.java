package LeetCode;

public class SwapNOdesInPairs {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(2);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);


//        ListNode result = rotateRight(head, 3);
//
//        while (result != null) {
//            System.out.println(result.val);
//            result = result.next;
//        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy, second = dummy, temp = null;
        head = head.next;

        while (first.next != null) {
            temp = first;
            first = first.next;
            second = first.next;
            if (second != null) {
                first.next = second.next;
                second.next = first;
                temp.next = second;
            }
        }

        return dummy.next;
    }
}
