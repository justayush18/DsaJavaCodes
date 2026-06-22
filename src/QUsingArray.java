public class QUsingArray {
    static class Queue {
        int[] arr;
        int rear;
        int size;
        int front = 0;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
            rear = -1;
        }

        boolean isEmpty() {
            return rear == -1;
        }

        void add(int data) {
            if (rear == size - 1) { // apply when queue is full
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        int remove() {
            if (isEmpty()) {
                System.out.print("Queue is Empty : ");
                return -1;
            }
            int val = arr[front];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;

            return val;
        }

        int peek(){
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
