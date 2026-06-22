public class BSTSizeOfLargestBSTInBT {
    public static class Node {
        int data;
        Node right, left;

        public Node(int data) {
            this.data = data;
            right = left = null;
        }
    }

    public static class Info {
        int size;
        int min, max;
        boolean is;

        Info(boolean is, int size, int min, int max) {
            this.is = is;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBst = 0;
    public Info largestBstSize(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info left = largestBstSize(root.left);
        Info right = largestBstSize(root.right);

        int size = 1 + left.size + right.size;
        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));

        if (root.data <= left.max || root.data >= right.min){
            return new Info(false, size, min, max);
        }

        if (left.is && right.is) {
            maxBst = Math.max(maxBst, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        BSTSizeOfLargestBSTInBT bst = new BSTSizeOfLargestBSTInBT();
        Info node = bst.largestBstSize(root);
        System.out.println(maxBst);
    }
}
