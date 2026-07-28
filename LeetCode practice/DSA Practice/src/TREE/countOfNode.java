package TREE;

public class countOfNode {
    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(2);

        root.left.left = new Node(3);
        root.left.right = new Node(4);

        root.right.left = new Node(4);
        root.right.right = new Node(3);


        System.out.println(countNodes(root));

    }
    static int countNodes(Node root) {
        if (root == null) return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
