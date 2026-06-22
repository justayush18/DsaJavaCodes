import java.util.Deque;
import java.util.LinkedList;

public class QDequeStack {
    static class Stack {
        Deque<Integer> dq = new LinkedList<>();

        int pop() {
            if (dq.isEmpty()) return -1;
            return dq.removeLast();
        }

        int peek() {
            if (dq.isEmpty()) return -1;

            return dq.getLast();
        }

        void push(int data) {
            dq.addLast(data);
        }

        boolean isEmpty() {
            return dq.isEmpty();
        }
    }

    static class Queue {
        Deque<Integer> dq = new LinkedList<>();

        boolean isEmpty() {
            return dq.isEmpty();
        }

        void add(int data) {
            dq.addLast(data);
        }

        int remove() {
            if (dq.isEmpty()) return -1;
            return dq.removeFirst();
        }

        int peek() {
            if (dq.isEmpty()) return -1;
            return dq.getFirst();
        }

    }

    public static void main(String[] args) {
//        Stack s = new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//
//        while (!s.isEmpty()) {
//            System.out.println(s.pop());
//        }

//        Queue q = new Queue();
//
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        while (!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
    }
}
