package DataStructureAndAlgorithms;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQuePrimitiveValuesWithCustomComparator {
    public static void main(String[] args) {
        Comparator<Integer> comNums = new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                if (n1 < n2) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        PriorityQueue<Integer> pq = new PriorityQueue<>(comNums);
        pq.add(23);
        pq.add(34);
        pq.add(12);
        pq.add(45);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
