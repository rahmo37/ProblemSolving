package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {


    public static void main(String[] args) {
        ImplementStackUsingQueue stack = new ImplementStackUsingQueue();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.q);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }


    Queue<Integer> q;

    public ImplementStackUsingQueue() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        this.q.offer(x);
    }

    public int pop() {
        if (empty()) {
            return -1;
        } else {
            int counter = q.size();
            while (counter > 1) {
                int temp = q.poll();
                q.offer(temp);
                counter--;
            }
            return q.poll();
        }
    }

    public int top() {
        if (empty()) {
            return -1;
        } else {
            int counter = q.size();
            int temp = 0;
            while (counter >= 1) {
                temp = q.poll();
                q.offer(temp);
                counter--;
            }
            return temp;
        }
    }

    public boolean empty() {
        return this.q.isEmpty();
    }
}
