public class QCircularUsingArray {

    static class Queue {
        int[] arr;
        int rear;
        int size;
        int front;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
            front = -1;
            rear = -1;
        }

        boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        boolean isFull() {
            return (rear + 1) % size == front;
        }

        void add(int data) {
            if (isFull()) { // apply when queue is full
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        int remove() {
            if (isEmpty()) {
                System.out.print("Queue is Empty : ");
                return -1;
            }
            int val = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return val;
        }

        int peek() {
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        System.out.println(q.remove());

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
