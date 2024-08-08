package AlgoExpert;

class Program {
    // Feel free to add new properties and methods to the class.

    public static void main(String[] args) {
        MinMaxStack mms = new MinMaxStack();
        mms.push(2);
        mms.push(3);
        mms.push(1);
//        mms.pop();
//        mms.peek();
        System.out.println(mms.getMax());


//        ListNode node = mms.top2;
//        while (node != null) {
//            System.out.print(node.val1 + "|");
//            System.out.print(node.val2);
//            System.out.print(" ");
//
//            node = node.next;
//        }


//        ListNode node = mms.top1;
//        while (node != null) {
//            System.out.print(node.val1 + " ");
//            node = node.next;
//        }
    }


    static class ListNode {
        ListNode next;
        int val1;
        int val2;

        ListNode(int val1) {
            this.val1 = val1;
        }

        ListNode(int val1, int val2) {
            this.val1 = val1;
            this.val2 = val2;
        }
    }

    static class MinMaxStack {
        ListNode top1;
        ListNode top2;


        public int peek() {
            if (this.top1 == null) {
                return -1;
            }
            return top1.val1;
        }

        public int pop() {
            if (this.top1 == null) {
                return -1;
            }
            int val = top1.val1;
            top1 = top1.next;
            top2 = top2.next;
            return val;
        }

        public void push(Integer number) {
//          Regular stack
            ListNode temp1 = new ListNode(number);
            temp1.next = this.top1;
            this.top1 = temp1;

//          MinMax Stack;
            int min = 0;
            int max = 0;
            if (top2 == null) {
                min = number;
                max = number;
            } else {
                min = top2.val1;
                max = top2.val2;
                min = number <= min ? number : min;
                max = number >= max ? number : max;
            }
            ListNode temp2 = new ListNode(min, max);
            temp2.next = this.top2;
            this.top2 = temp2;
        }

        public int getMin() {
            if (this.top1 == null) {
                return -1;
            }
            return top2.val1;
        }

        public int getMax() {
            if (this.top1 == null) {
                return -1;
            }
            return top2.val2;
        }
    }
}
