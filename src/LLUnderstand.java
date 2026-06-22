public class LLUnderstand {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    void addAtFirst(int data) {
        // create new node
        Node nn = new Node(data);
        size++;
        // if LL is null
        if (head == null) {
            head = tail = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }

    void addAtLast(int data) {
        // create new node
        Node nn = new Node(data);
        size++;
        // if LL is null
        if (head == null) {
            head = tail = nn;
            return;
        }
        tail.next = nn;
        tail = nn;
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    void addAt(int index, int data) {
        if (index == 0) {
            addAtFirst(data);
        }
        Node nn = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        // setting the element inside list
        nn.next = temp.next;
        temp.next = nn;

    }

    // remove at first
//    int removeAtFirst(){
//        if (head == null){
//            System.out.println("LL is Empty");
//            return Integer.MIN_VALUE;
//        }
//        if (head.next == null){
//            head = null;
//            size--;
//            return 0;
//        }
//        int val;
//        val = head.data;
//        head = head.next;
//        size--;
//        return val;
//    }

    void removeAtFirst() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        int deletedValue = head.data;
        head = head.next;
        size--;
        System.out.println(deletedValue + " :is deleted from LL successfully ");
    }

    void removeAtLast() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node prev = head;
        int i = 0;
        while (i < size - 2) {
            prev = prev.next;
            i++;
        }
        int deletedValue = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        System.out.println(deletedValue + " :is deleted from LL successfully ");
    }

    int linearSearch(int key) {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (key == temp.data) {
                return i; // answer
            } else {
                temp = temp.next;
                i++;
            }

        }
        return -1; // failure
    }

    // recursive search
    int helperOfRS(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.next == null) {
            return 0;
        }
        if (head.data == key) {
            return 0;
        }
        int index = helperOfRS(head.next, key);
        if (index == -1) {
            return -1;
        }
        return index + 1;
    }

    int recursiveSearch(int key) {
        return helperOfRS(head, key);
    }

    void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node nxt;
        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        head = prev;
        print();
    }

    //find and remove from end
    void deleteNthFromEnd(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (sz == n) {
            head = head.next;
            return;
        }
        int i = 1;
        int pelano = sz - n;
        Node prev = head;
        while (i < pelano) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
    }

    Node helperMidNode() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next; // 2step
            slow = slow.next; // 1 step
        }
        return slow;
    }

    boolean isItPalindrome() {
        if (head == null) {
            System.out.println("LL is Empty");
            return false;
        }
        if (head.next == null) {
            System.out.println("LL has only single node, so it's palindrome by default");
            return true;
        }
        Node mid = helperMidNode();

        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 3rd step for check where left == right
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    void removeData(int data) {
        // list is empty or not
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        // check data/element is in list or not
        if (!helperDataIsThereOrNot(data)) {
            System.out.println("there is no such data/element available, please check list first in next line");
            print();
            return;
        }
        // for single node
        if (head.next == null) {
            head = null;
            System.out.println("LL become empty due to only single node");
            return;
        }

        if (data == head.data) {
            removeAtFirst();
            return;
        }
        if (data == tail.data) {
            removeAtLast();
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == data) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    boolean helperDataIsThereOrNot(int data) {
        Node temp = head;
        while (temp != null) {
            if (data == temp.data) {
                return true; // answer
            } else {
                temp = temp.next;
            }

        }
        return false; // failure
    }

    boolean detectingCycleLoop() {
        // Floyd's CycleFindingAlgorithm
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    void zigZagOrAlternativeMerging() {
        //mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next; //1
            fast = fast.next.next; // 2
        }
        Node mid = slow;
        // reverse
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // alternate ZigZag
        Node lh = head;
        Node rh = prev;
        Node nl, nr;

        while (lh != null && rh != null) {
            nl = lh.next;
            lh.next = rh;

            nr = rh.next;
            rh.next = nl;

            lh = nl;
            rh = nr;
        }
    }

    public static void main(String[] args) {
        LLUnderstand ll = new LLUnderstand();
//        ll.addAtFirst(2);
//        ll.addAtFirst(1);
//        ll.addAtLast(4);
//        ll.addAtLast(5);
//        ll.addAt(2, 3);

        //ll.print();
        //System.out.println(size);
        //System.out.println(ll.linearSearch(3));
        //System.out.println(ll.linearSearch(30));
        //ll.reverse();
        //ll.deleteNthFromEnd(1);
        //System.out.println(ll.recursiveSearch(1));
        //ll.removeAtFirst();
        //ll.removeAtLast();
        //ll.print();
        //System.out.println(ll.isItPalindrome());
        //System.out.println(ll.dataAtGivenIndex(2));
        //ll.removeData(1);

        // 2nd part
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        head = n1;

        //System.out.println(ll.detectingCycleLoop());
        ll.zigZagOrAlternativeMerging();
        ll.print();
        //ll.print();
    }
}

