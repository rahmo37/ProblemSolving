package DataStructureAndAlgorithms;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDs {
    public static void main(String[] args) {
        // Queue is FIFO (first come first serve)
        // Element exiting/removing a queue is called dequeuin
        // offer() method adds new element
        // Element entering/adding a queue is called enqueuing
        // poll() method removes an element, The queue.poll() method removes and returns the head of the queue. The head of the queue is the first element that was added to the queue. The poll() method returns null if the queue is empty.

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Anaconda");
        queue.offer("Bull");
        queue.offer("Cat");
        queue.offer("Dog");
        queue.add("Egg");

        queue.poll();


        //to look at the top most element
        System.out.println(queue.peek());

        //returns if the queue is empty or not
        System.out.println(queue.isEmpty());

        //returns the size()
        System.out.println(queue.size());

        //Check to see if an Element remains in the queue or not
        System.out.println(queue.contains("Egg"));

        // keyboard buffer
        // Printer queue
        // Used in linked list, priority queue
    }

}

