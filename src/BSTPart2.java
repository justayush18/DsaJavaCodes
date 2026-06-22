import java.util.ArrayList;

public class BSTPart2 {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            right = left = null;
        }
    }

    public Node createBst(int[] arr, int start, int end) {
        if (start < end) return null;
        int mid = start + (end - start) / 2;
        Node root = new Node(arr[mid]);
        root.left = createBst(arr, start, mid - 1);
        root.right = createBst(arr, mid + 1, end);
        return root;
    }

    public void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void getInOrder(Node root, ArrayList<Integer> in) {
        if (root == null) return;
        getInOrder(root.left, in);
        in.add(root.data); // we get our seq
        getInOrder(root.right, in);
    }

    public Node createBstH(ArrayList<Integer> inH, int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        Node root = new Node(inH.get(mid));
        root.left = createBstH(inH, start, mid-1);
        root.right = createBstH(inH, mid+1, end);
        return root;
    }

    public Node convert(Node root) {
        ArrayList<Integer> ino = new ArrayList<>();
        getInOrder(root, ino);
        root = createBstH(ino, 0, ino.size()-1);
        return root;
    }

    public static void main(String[] args) {
        //int[] arr = {3, 5, 6, 8, 10, 11, 12};
        BSTPart2 bst = new BSTPart2();


        // sorted array to balanced bst
        //System.out.println(bst.createBst(arr, 0, arr.length-1).data);
        //Node root = bst.createBst(arr, 0, arr.length-1);
        //bst.preOrder(root);

        Node root = new Node(50);
        root. left = new Node(30);
        root. left. left = new Node(5);
        root. left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right. left = new Node(65);
        root.right.right.right = new Node( 80);

          // convert bst to B Bst
//        System.out.println(bst.convert(root).data);
    }
}
