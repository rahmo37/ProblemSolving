package LeetCode;

public class AddTwoNumbers {
    public static void main(String[] args) {
//        ListNode linkedList1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        int[] array1 = {9, 9, 9, 9, 9, 9, 9};
        ListNode head1 = new ListNode(array1[0]);
        ListNode current1 = head1;

        for (int i = 1; i < array1.length; i++) {
            current1.next = new ListNode(array1[i]);
            current1 = current1.next;
        }
        ListNode linkedList2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode result = addTwoNumbers(head1, linkedList2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String n1 = "";
        String n2 = "";
        int carry = 0;
        int eachAddition = 0;
        ListNode head = new ListNode();
        ListNode current = head;

        while (l1 != null) {
            n1 = n1 + l1.val;
            l1 = l1.next;
        }

        while (l2 != null) {
            n2 = n2 + l2.val;
            l2 = l2.next;
        }

        int maxLength = n1.length() > n2.length() ? n1.length() : n2.length();

        for (int i = 0; i < maxLength; i++) {
            if (i < n1.length() && i < n2.length()) {
                eachAddition = Integer.parseInt("" + n1.charAt(i)) + Integer.parseInt("" + n2.charAt(i)) + carry;
                carry = eachAddition / 10;
                current.next = new ListNode(eachAddition % 10);
                current = current.next;
            } else {
                if (n1.length() > n2.length()) {
                    eachAddition = Integer.parseInt("" + n1.charAt(i)) + carry;
                    carry = eachAddition / 10;
                    current.next = new ListNode(eachAddition % 10);
                    current = current.next;
                } else {
                    eachAddition = Integer.parseInt("" + n2.charAt(i)) + carry;
                    carry = eachAddition / 10;
                    current.next = new ListNode(eachAddition % 10);
                    current = current.next;
                }
            }
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
            current = current.next;
        }
        return head.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


// Another Solution
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode dummy = new ListNode();
//        ListNode res = dummy;
//        int total = 0, carry = 0;
//
//        while (l1 != null || l2 != null || carry != 0) {
//            total = carry;
//
//            if (l1 != null) {
//                total += l1.val;
//                l1 = l1.next;
//            }
//            if (l2 != null) {
//                total += l2.val;
//                l2 = l2.next;
//            }
//
//            int num = total % 10;
//            carry = total / 10;
//            dummy.next = new ListNode(num);
//            dummy = dummy.next;
//        }
//
//        return res.next;
//    }
//}



//        Another Solution
//        ListNode dummy = new ListNode(0);
//        ListNode tail = dummy;
//        int x;
//        int y;
//        int carry = 0;
//        int result = 0;
//        while (l1 != null || l2 != null) {
//            x = (l1 != null) ? l1.val : 0;
//            y = (l2 != null) ? l2.val : 0;
//            result = x + y + carry;
//            carry = result / 10;
//            tail.next = new ListNode(result % 10);
//            tail = tail.next;
//            if (l1 != null) {
//                l1 = l1.next;
//            }
//            if (l2 != null) {
//                l2 = l2.next;
//            }
//        }
//
//        if (carry > 0) {
//            tail.next = new ListNode(carry);
//        }
//
//        return dummy.next;