package LeetCode;

import java.util.Arrays;

class TextEditor {
    private char[] before = new char[80];
    private char[] after = new char[80];
    private int sz_before = 0;
    private int sz_after = 0;

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addText("hello");
        System.out.println(editor.cursorLeft(2)); // Expected: "hel"
        editor.addText("world");
        System.out.println(editor.cursorRight(3)); // Expected: "helworldlo"
        editor.deleteText(5);
        System.out.println(editor.cursorLeft(3)); // Expected: "he"

    }

    public void addText(String text) {
        for (char c : text.toCharArray()) {
            before[sz_before++] = c;
        }

    }

    public int deleteText(int k) {
        k = Math.min(k, sz_before);
        sz_before -= k;
        System.out.println(Arrays.toString(before));
        System.out.println(Arrays.toString(after));

        System.out.println(sz_before);
        System.out.println(sz_after);
        return k;
    }

    public String cursorLeft(int k) {
        k = Math.min(k, sz_before);
        while (k > 0) {
//            hello
            after[sz_after++] = before[--sz_before];
            k--;
        }
        return new String(before, Math.max(0, sz_before - 10), Math.min(sz_before, 10));
    }

    public String cursorRight(int k) {
        k = Math.min(k, sz_after);
        while (k > 0) {
            before[sz_before++] = after[--sz_after];
            k--;
        }
        return new String(before, Math.max(0, sz_before - 10), Math.min(sz_before, 10));
    }
}


// Another Solution with doubly linked list
//public class TextEditor {
//    private Node head, tail, cursor;
//    private int size;


//    class Node {
//        char val;
//        Node prev, next;
//
//        Node(char val) {
//            this.val = val;
//            this.prev = null;
//            this.next = null;
//        }
//    }
//
//    public TextEditor() {
//        head = new Node('\0'); // dummy head
//        tail = new Node('\0'); // dummy tail
//        head.next = tail;
//        tail.prev = head;
//        cursor = tail;
//        size = 0;
//    }
//
//    public void addText(String textToAdd) {
//        for (char ch : textToAdd.toCharArray()) {
//            Node newNode = new Node(ch);
//            Node prev = cursor.prev;
//            newNode.next = cursor;
//            newNode.prev = prev;
//            prev.next = newNode;
//            cursor.prev = newNode;
//        }
//        size += textToAdd.length();
//    }
//
//    public int deleteText(int k) {
//        int charsToDelete = Math.min(k, cursorDistanceFromHead());
//        for (int i = 0; i < charsToDelete; i++) {
//            Node prev = cursor.prev;
//            prev.prev.next = cursor;
//            cursor.prev = prev.prev;
//        }
//        size -= charsToDelete;
//        return charsToDelete;
//    }
//
//    public String cursorLeft(int k) {
//        for (int i = 0; i < k && cursor.prev != head; i++) {
//            cursor = cursor.prev;
//        }
//        return getLeftString();
//    }
//
//    public String cursorRight(int k) {
//        for (int i = 0; i < k && cursor != tail; i++) {
//            cursor = cursor.next;
//        }
//        return getLeftString();
//    }
//
//    private int cursorDistanceFromHead() {
//        int distance = 0;
//        Node temp = cursor;
//        while (temp != head) {
//            distance++;
//            temp = temp.prev;
//        }
//        return distance - 1; // -1 to exclude the dummy head
//    }
//
//    private String getLeftString() {
//        StringBuilder sb = new StringBuilder();
//        Node temp = cursor;
//        for (int i = 0; i < 10 && temp.prev != head; i++) {
//            temp = temp.prev;
//            sb.append(temp.val);
//        }
//        return sb.reverse().toString();
//    }
//
//    public static void main(String[] args) {
//        TextEditor editor = new TextEditor();
//
//        editor.addText("hello");
//        System.out.println(editor.cursorLeft(2)); // Output: "hel"
//
//        editor.addText("world");
//        System.out.println(editor.cursorRight(3)); // Output: "helloworld"
//
//        System.out.println(editor.deleteText(5)); // Output: 5
//        System.out.println(editor.cursorLeft(1)); // Output: "hell"
//    }
//}
