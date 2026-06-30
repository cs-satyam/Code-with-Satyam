/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null)
            return null;
        Node copy = new Node(node.val);
        Node[] v = new Node[101];
        Arrays.fill(v, null);
        dfs(node, copy, v);
        return copy;
    }

    void dfs(Node currNode, Node copy, Node[] v) {
        v[copy.val] = copy;
        for (Node n : currNode.neighbors) {
            if (v[n.val] == null) {
                Node newNode = new Node(n.val);
                copy.neighbors.add(newNode);
                dfs(n, newNode, v);
            } else {
                copy.neighbors.add(v[n.val]);
            }
        }

    }
}