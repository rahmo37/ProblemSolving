package LeetCode;

public class RotateList {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(2);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);


        ListNode result = rotateRight(head, 3);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }


    public static ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy, third = null;
        int len = 0;
        while (first.next != null) {
            first = first.next;
            len++;
        }
        k = k % len;
        if (k == 0) {
            return head;
        }
        int traverseReq = len - k;
        for (int i = 0; i < traverseReq; i++) {
            second = second.next;
        }
        third = second.next;
        second.next = null;
        first.next = dummy.next;
        dummy.next = third;
        return dummy.next;
    }
}


// Another Solution,
//public ListNode rotateRight(ListNode head, int k) {
//
//    if(head == null || k == 0) {
//        return head;
//    }
//
//    ListNode result = new ListNode();
//    ListNode placeholder = result;
//    Stack<Integer> stack = new Stack<>();
//    Queue<Integer> rotator = new LinkedList<>();
//
//    while(head != null) {
//        stack.push(head.val);
//        head = head.next;
//    }
//
//    k = k % stack.size();
//
//    while(!stack.isEmpty()) {
//        rotator.add(stack.pop());
//    }
//
//    while(k > 0) {
//        int value = rotator.remove();
//        rotator.add(value);
//        k--;
//    }
//
//    Stack<Integer> newStack = new Stack<>();
//    while(!rotator.isEmpty()) {
//        newStack.push(rotator.remove());
//    }
//
//    while(!newStack.isEmpty()) {
//        ListNode newNode = new ListNode(newStack.pop());
//        placeholder.next = newNode;
//        placeholder = placeholder.next;
//    }
//    return result.next;
//}