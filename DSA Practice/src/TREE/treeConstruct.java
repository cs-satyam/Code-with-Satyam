package TREE;


import java.util.*;


public class treeConstruct {

    public static Node buildTree(int[] arr) {

        if (arr.length == 0) return null;

        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int i = 1;

        while (i < arr.length) {
            Node curr = q.poll();

            if (i < arr.length) {
                curr.left = new Node(arr[i++]);
                q.offer(curr.left);
            }

            if (i < arr.length) {
                curr.right = new Node(arr[i++]);
                q.offer(curr.right);
            }
        }

        return root;
    }

    public static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        Node root = buildTree(a);
        preorder(root);

    }
}
