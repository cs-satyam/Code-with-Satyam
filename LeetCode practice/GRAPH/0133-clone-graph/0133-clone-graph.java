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
import java.util.*;
// Definition for a Node.
class Node{
    
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
// main code of class 
class Solution {
    public Node cloneGraph(Node node) {
        if (node == null)
            return null;

        HashMap<Node, Node> map = new HashMap<>();
        return dfs(node, map);
    }

    private Node dfs(Node node, HashMap<Node, Node> map) {

        Node newNode = new Node(node.val);
        map.put(node, newNode);

        for (Node neighbor : node.neighbors) {
            if (!map.containsKey(neighbor)) {
                newNode.neighbors.add(dfs(neighbor, map));
            } else {
                newNode.neighbors.add(map.get(neighbor));
            }
        }

        return newNode;
    }
}