package DataStructureAndAlgorithms;

import java.util.PriorityQueue;

public class PriorityQueueDs {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(600);
        pq.add(100);
        pq.add(500);
        pq.add(750);

//      removing the smallest element first
        System.out.println(pq.poll());

//        Even if you add a smaller element later. it would still remove the smallest
//        Element first
        pq.add(1);
        System.out.println(pq.poll());
    }
}
