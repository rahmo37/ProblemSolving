package LeetCode;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {
        ListNode rabbit = head;
        ListNode turtle = head;
        while(rabbit != null && rabbit.next != null) {
            rabbit = rabbit.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
}
