import java.util.ArrayList;

public class BSTMergeBST {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            right = left = null;
        }
    }

    public void getInOrder(Node root, ArrayList<Integer> in) {
        if (root == null) return;
        getInOrder(root.left, in);
        in.add(root.data); // we get our seq
        getInOrder(root.right, in);
    }

    public Node createBST(ArrayList<Integer> in, int start, int end){
        if (start > end) return null;

        int mid = start + (end - start) / 2;
        Node root = new Node(in.get(mid));

        root.left = createBST(in, start, mid-1);
        root.right = createBST(in, mid+1, end);

        return root;
    }
    public Node merge(Node root, Node root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        getInOrder(root, list1);
        getInOrder(root2, list2);

        int i = 0;
        int j = 0;
        ArrayList<Integer> finalList = new ArrayList<>();

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)){
                finalList.add(list1.get(i));
                i++;
            } else{
                finalList.add(list2.get(j));
                j++;
            }
        }

        while(i < list1.size()){
            finalList.add(list1.get(i));
            i++;
        }
        while(j < list2.size()) {
            finalList.add(list2.get(j));
            j++;
        }
        return createBST(finalList, 0, finalList.size()-1);
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);

        Node root2 = new Node(50);
        root2.left = new Node(40);
        root2.right = new Node(60);

        BSTMergeBST bst = new BSTMergeBST();
        System.out.println(bst.merge(root, root2).data);
    }
}
