package Interview.tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class levelOrder
{
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue <TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n= q.size();
            List<Integer> level= new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node = q.poll();
                level.add(node.val);

                if(node.left!=null){
                    q.add(node.left);
                }

                if(node.right!=null){
                    q.add(node.right);
                }
                ans.add(level);
            }
        }
        return ans;

    }
}
