public class LLSwap {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;

    public void swap(int x, int y) {
        Node currX = head;
        Node prevX = null;

        while (currX.next != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node currY = head;
        Node prevY = null;
        while (currY.next != prevX && currY.data == y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currY == null || currX == null) return;

        if (prevX != null) prevX.next = currY; else head = currY;
        if (prevY != null) prevY.next = currX; else head = currX;

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
}
