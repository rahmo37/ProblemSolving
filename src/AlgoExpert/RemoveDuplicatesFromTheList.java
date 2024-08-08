package AlgoExpert;

public class RemoveDuplicatesFromTheList {
    public static void main(String[] args) {

    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList current = linkedList;
        LinkedList previous = linkedList;
        while (current.next != null) {
            current = current.next;
            if (previous.value == current.value) {
                previous.next = current.next;
            } else {
                previous = current;
            }
        }
        return linkedList;
    }

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
