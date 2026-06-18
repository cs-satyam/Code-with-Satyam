package TREE;

public class BSTConstruct {

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};

        Node root = null;

        for (int x : a) {
            root = insert(root, x);
        }

        inorder(root);
    }
}