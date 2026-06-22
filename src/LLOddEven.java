public class LLOddEven {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;

    Node oddEven() {
        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;
        Node temp = head;

        while (temp != null){
            if (temp.data % 2 == 0){
                if (evenHead == null){
                    evenHead = evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = temp;
                }
            } else {
                if (oddHead == null){
                    oddHead = oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = temp;
                }
            }
            temp = temp.next;
        }
        if (evenTail != null) evenTail.next = null;
        if (oddTail != null) oddTail.next = null;
        if (evenHead == null) return oddHead;
        if (oddHead == null) return evenHead;

        evenTail.next = oddHead;

        return head;
    }
}
