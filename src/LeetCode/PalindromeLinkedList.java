package LeetCode;

import java.util.ArrayList;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        Node linkedList = new Node(1, new Node(2, new Node(2, new Node(1))));
        Node linkedList1 = new Node(1, new Node(2, new Node(5, new Node(2, new Node(1)))));
        Node linkedList2 = new Node(1, new Node(2));
        System.out.println(isPalindrome(linkedList1));
    }

    public static boolean isPalindrome(Node head) {
        ArrayList<Integer> linkedListVal = new ArrayList<>();
        while (head.next != null) {
            linkedListVal.add(head.val);
            head = head.next;
            if (head.next == null) {
                linkedListVal.add(head.val);
            }
        }
        int left = 0;
        int right = linkedListVal.size() - 1;
        while (left < right) {
            if (linkedListVal.get(left) != linkedListVal.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

//Another solution from Leet Code
//class Solution {
//    private static final int[] array = new int[100_000];
//    public boolean isPalindrome(ListNode head) {
//        if(head==null || head.next==null){
//            return true;
//        }
//       ListNode h= head;
//       final int[] array1 = array;
//       int size =0;
//
//       while(h!=null){
//           array1[size++] = h.val;
//           h=h.next;
//       }
//
//       int m = size/2;
//       for(int i=0;i<m;i++){
//           if(array[i] != array1[--size]){
//               return false;
//           }
//       }
//       return true;
//    }
//}