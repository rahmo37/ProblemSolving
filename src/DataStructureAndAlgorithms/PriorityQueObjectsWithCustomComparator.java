package DataStructureAndAlgorithms;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueObjectsWithCustomComparator {

    public static void main(String[] args) {
//        Comparator<Element> elemComp = new Comparator<>() {
//            @Override
//            public int compare(Element e1, Element e2) {
//                if (e1.value < e2.value) {
//                    return 1;
//                } else {
//                    return -1;
//                }
//            }
//        };

//        e2.value - e1.value means that if e2.value is greater than e1.value, the result will be positive, indicating that e2 should come before e1 in the queue.
//        If e2.value is less than e1.value, the result will be negative, indicating that e1 should come before e2.
//        If e2.value is equal to e1.value, the result will be zero, indicating that their order is the same.
        PriorityQueue<Element> elemQue = new PriorityQueue<>((e1, e2) -> e1.value - e2.value);
        elemQue.add(new Element(10, 1, 1));
        elemQue.add(new Element(1, 0, 0));
        elemQue.add(new Element(5, 0, 1));
        elemQue.add(new Element(9, 0, 2));

        System.out.println(elemQue.poll());
        System.out.println(elemQue.poll());
        System.out.println(elemQue.poll());
        System.out.println(elemQue.poll());
    }

    public static class Element {
        int value;
        int row;
        int column;

        public Element(int value, int row, int column) {
            this.value = value;
            this.row = row;
            this.column = column;
        }

        @Override
        public String toString() {
            return "Element [Value=" + value + ", Row=" + row + ", Column=" + column +"]";
        }
    }
}
