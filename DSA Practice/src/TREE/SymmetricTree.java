package TREE;

public class SymmetricTree {
    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(2);


        root.left.right = new Node(4);


        root.right.right = new Node(3);

        System.out.println(isSymmetric(root));
    }

    public static boolean isSymmetric(Node root) {
        if (root == null) return true;

        return check(root.left, root.right);
    }

    public static boolean check(Node left, Node right) {
        if (left == null && right == null) return true;

        if (left == null || right == null|| left.data != right.data) return false;



        return check(left.left, right.right)
                && check(left.right, right.left);
    }
}