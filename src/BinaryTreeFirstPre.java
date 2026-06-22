import java.util.*;

public class BinaryTreeFirstPre {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binary {
        static int idx = -1;

        public Node buildTree(int[] node) {
            idx++; // 0
            if (node[idx] == -1) {
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;
        }

        public void preOrder(Node root) {
            int count = 0;
            if (root == null) {
                return;
            }
            // root->left->right
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public void inOrder(Node root) {
            if (root == null) {
                return;
            }
            // left->root->right
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public void postOrder(Node root) {
            if (root == null) {
                return;
            }
            // left->right->root
            inOrder(root.left);
            inOrder(root.right);
            System.out.print(root.data + " ");
        }

        public void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curr = q.remove();
                if (curr == null) { // Have we reached the end of a level?
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curr.data);
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
        }

        public int height(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return 1 + Math.max(lh, rh);
        }

        public int countOfNode(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = countOfNode(root.left);
            int rh = countOfNode(root.right);
            return 1 + lh + rh;
        }

        public int sumOfNode(Node root) {
            if (root == null) {
                return 0;
            }
            int left = sumOfNode(root.left);
            int right = sumOfNode(root.right);
            return left + right + root.data;
        }

        public int diameter(Node root) {
            if (root == null) {
                return 0;
            }
            int ld = diameter(root.left);
            int lh = height(root.left);
            int rd = diameter(root.right);
            int rh = height(root.right);

            return Math.max(Math.max(ld, rd), rh + lh + 1);
        }

        static class InfoD {
            int d, h;

            InfoD(int d, int h) {
                this.d = d;
                this.h = h;
            }
        }

        public InfoD diameter_two(Node root) {
            if (root == null) {
                return new InfoD(0, 0);
            }
            InfoD leftInfo = diameter_two(root.left);
            InfoD rightInfo = diameter_two(root.right);

            int diam = Math.max(Math.max(leftInfo.d, rightInfo.d), leftInfo.h + rightInfo.h + 1);
            int ht = Math.max(leftInfo.h, rightInfo.h) + 1;

            return new InfoD(diam, ht);
        }

        static class InfoT {
            Node node;
            int hd;

            InfoT(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public void view(Node root) {
            if (root == null) return;
            Queue<InfoT> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();
            int min = 0, max = 0;

            q.add(new InfoT(root, 0));
            q.add(null);

            while (!q.isEmpty()) {
                InfoT curr = q.remove();
                if (curr == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    if (!map.containsKey(curr.hd)) {
                        map.put(curr.hd, curr.node);
                    }
                    if (curr.node.left != null) {
                        q.add(new InfoT(curr.node.left, curr.hd - 1));
                        min = Math.min(min, curr.hd - 1);
                    }
                    if (curr.node.right != null) {
                        q.add(new InfoT(curr.node.right, curr.hd + 1));
                        max = Math.max(max, curr.hd + 1);
                    }
                }
            }

            for (int i = min; i <= max; i++) {
                System.out.println(map.get(i).data);
            }
        }

        //Verify that the entire subtree matches exactly.
        public boolean isIdentical(Node node, Node subRoot) {
            // both has null at same position OR Did both trees end at the same time?
            if (node == null && subRoot == null) {
                return true;
            } else if (node == null || subRoot == null || node.data != subRoot.data) {
                return false;
            }
            // check for both left and right subtree
            if (!isIdentical(node.left, subRoot.left)) {
                return false;
            }
            if (!isIdentical(node.right, subRoot.right)) {
                return false;
            }
            return true;
        }

        // subRoot is present in the main tree
        public boolean isSubTree(Node root, Node subRoot) {
            if (root == null) {
                return false;
            }
            if (root.data == subRoot.data) {
                if (isIdentical(root, subRoot)) {
                    return true;
                }
            }
            return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
        }

        public void kLevel(Node root, int level, int k) {
            if (root == null) {
                return;
            }
            if (level == k) {
                System.out.print(root.data + " ");
                return;
            }
            kLevel(root.left, level + 1, k);
            kLevel(root.right, level + 1, k);
        }

        public boolean getPath(Node root, Node n, ArrayList<Node> path) {
            if (root == null) {
                return false;
            }
            path.add(root);

            if (root == n) {
                return true;
            }

            boolean leftlca = getPath(root.left, n, path);
            boolean rightlca = getPath(root.right, n, path);

            if (leftlca || rightlca) {
                return true;
            }

            path.removeLast();
            return false;
        }

        public Node lca(Node root, Node n1, Node n2) {
            ArrayList<Node> left = new ArrayList<>();
            ArrayList<Node> right = new ArrayList<>();

            getPath(root, n1, left);
            getPath(root, n2, right);

            int i = 0;
            for (; i < left.size() && i < right.size(); i++) {
                if (left.get(i) != right.get(i)) {
                    break;
                }
            }

            return left.get(i - 1);
        }

        //approach 2 for lca
        public Node lca2(Node root, Node n1, Node n2) {
            if (root == n1 || root == n2 || root == null) return root;

            Node left = lca2(root.left, n1, n2);
            Node right = lca2(root.right, n1, n2);

            //left == valid so return right as null and vice versa
            if (left == null) {
                return right;
            }
            if (right == null) {
                return left;
            }

            return root;
        }

        public int countDist(Node root, Node target) {
            if (root == null) {
                return -1;
            }
            if (target == root) {
                return 0;
            }

            int leftVal = countDist(root.left, target);
            int rightVal = countDist(root.right, target);

            if (leftVal == -1 && rightVal == -1) {
                return -1;
            } else if (leftVal != -1) {
                return leftVal + 1;
            } else {
                return rightVal + 1;
            }
        }

        public int minDistance(Node root, Node n1, Node n2) {
            Node lca = lca2(root, n1, n2);
            int leftDist = countDist(lca, n1);
            int rightDist = countDist(lca, n2);

            return leftDist + rightDist;
        }

        public int kThAncestor(Node root, Node n, int k) {
            if (root == null) {
                return -1;
            }
            if (root == n) {
                return 0;
            }

            int leftside = kThAncestor(root.left, n, k);
            int rightside = kThAncestor(root.right, n, k);

            if (leftside == -1 && rightside == -1) {
                return -1;
            }
            int max = Math.max(leftside, rightside);

            if (max + 1 == k) {
                System.out.println(root.data);
            }

            return max + 1;
        }
        public int transform(Node root){
            if (root == null){
                return 0;
            }
            int lefttrans = transform(root.left);
            int righttrans = transform(root.right);

            int data = root.data;
            int newleft = root.left == null ? 0 : root.left.data;
            int newright = root.right == null ? 0 : root.right.data;

            root.data = newleft + lefttrans + newright+ righttrans;

            return data;
        }

    }

    public static void main(String[] args) {
        //int[] node = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // root
        Node root = new Node(1);

        // whole left subtree
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // whole right subtree
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

//                   1
//                 /   \
//                2     3
//               / \   / \
//              4   5 6   7

        Binary bt = new Binary();
//        Node root = bt.buildTree(node);

//        System.out.println(root.data);

        //bt.preOrder(root);
//        System.out.println();
//        bt.inOrder(root);
//        System.out.println();
        //bt.levelOrder(root);

        //height
        //System.out.println(bt.height(root)); // 3

        //count
        //System.out.println(bt.countOfNode(root)); // 6
        // sum
        //System.out.println(bt.sumOfNode(root)); // 21

        // diameter approach 1 with o(n^2)
        // System.out.println(bt.diameter(root));
        // diameter approach 2 with o(n)
        //System.out.println(bt.diameter_two(root).d);

        // top of view of Binary Tree
        //bt.view(root);

        // kth level data of node
        //bt.kLevel(root, 1, 2);

        // lca approach 1
        //System.out.println(bt.lca(root,  root.left.left,  root.right.left).data);

        //lca 2
        //System.out.println(bt.lca2(root,  root.left.left,  root.right.left).data);

        // min dist between two nodes
        //System.out.println(bt.minDistance(root,  root.left.left,  root.left.right));

        // kth ancestor of node
        //bt.kThAncestor(root, root.left.left, 2);
        // we can not do System.out.println here because we want inside value not the return value
        //and for better understanding look at the function

        // sum tree transformation
        bt.transform(root);
        bt.preOrder(root);
    }
}
