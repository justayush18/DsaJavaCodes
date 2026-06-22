public class QueueUsingLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;

    static class Queue {

        boolean isEmpty(){
            return head == null && tail == null;
        }

        void add(int data) {
            Node nn = new Node(data);
            if (head == null) {
                head = tail = nn;
                return;
            }

            tail.next = nn;
            tail = nn;
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("LL is empty");
                return -1;
            }
            int front = head.data;
            if (head == tail){
                head = tail = null;
            } else{
                head = head.next;
            }
            return front;
        }

        int peek(){
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
