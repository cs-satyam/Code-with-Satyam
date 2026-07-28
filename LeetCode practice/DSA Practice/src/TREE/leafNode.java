package TREE;


public class leafNode {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        printleafnode(root);
    }
    static void printleafnode(Node root){
        if(root==null){
            return;
        }
        if(root.left==null&& root.right==null){
            System.out.println(root.data);
        }
        printleafnode(root.left);
        printleafnode((root.right));
    }
}
