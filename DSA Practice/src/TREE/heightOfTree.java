package TREE;


import java.util.*;

public class heightOfTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(heightusingdfs(root));
        System.out.println(heightusingbfs(root));
    }

    static int heightusingdfs(Node root) {
         if (root == null) return 0;
         return 1+Math.max(heightusingdfs(root.left),heightusingdfs(root.right));

    }

    static int heightusingbfs(Node root) {
        if (root == null) return 0;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int height = 0;

        while (!q.isEmpty()) {
            int levelSize = q.size();

            // Process all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                Node current = q.poll();

                if (current.left != null)
                    q.offer(current.left);

                if (current.right != null)
                    q.offer(current.right);
            }

            height++;
        }

        return height;
    }
}
