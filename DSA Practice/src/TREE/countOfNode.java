package TREE;

public class countOfNode {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.left = new Node(4);
        root.left.left.left.left = new Node(5);
        root.left.left.left.left.left = new Node(6);
        root.left.left.left.left.left.left = new Node(7);

        System.out.println(coutNodes(root));

    }
    static int coutNodes(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return 1 + Math.max(coutNodes(root.left), coutNodes(root.right));
    }
}
