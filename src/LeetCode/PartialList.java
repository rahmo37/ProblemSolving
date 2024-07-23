package LeetCode;

public class PartialList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        ListNode result = partition(head, 3);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
//      Necessary pointer and node variables
        ListNode current = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode firstPtr = dummy, secondPtr = dummy;

//      Necessary value variables
        int curMinIndex = 0, curMaxIndex = 0;
        int index = 1;

        if (current.val < x) {
            curMinIndex = index;
            firstPtr = current;
        } else {
            curMaxIndex = index;
            secondPtr = current;
        }

        while (current.next != null) {
            current = current.next;
            index++;
            if (current.val < x) {
                curMinIndex = index;
                if (curMaxIndex == 0) {
                    firstPtr = current;
                }
            } else {
                curMaxIndex = index;
                secondPtr = current;
            }

            if (curMaxIndex != 0 && curMinIndex > curMaxIndex) {
                secondPtr.next = current.next;
                current.next = firstPtr.next;
                firstPtr.next = current;
                firstPtr = current;
                current = secondPtr;
            }
        }

        return dummy.next;
    }
}


// Another Solution
//        ListNode smallerHead = new ListNode(0), biggerHead = new ListNode(0);
//        ListNode smaller = smallerHead, bigger = biggerHead;
//
//        while (head != null)
//        {
//            if(head.val < x)
//                smaller = smaller.next = head; // smaller = head , smaller.next = head
//            else
//                bigger = bigger.next = head;
//
//            head = head.next;
//        }
//
//        smaller.next = biggerHead.next; // join bigger after smaller
//        bigger.next = null; // cut off anything after bigger
//        return smallerHead.next;