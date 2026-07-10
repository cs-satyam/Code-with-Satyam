/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class viru{
    void print(){
        System.out.println("wooohooo!!!");
    }
 }
 class Solution {
    boolean solve(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        if (root.left == null && root.right == null)
            return targetSum == root.val;

        return solve(root.left, targetSum - root.val) ||
               solve(root.right, targetSum - root.val);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        viru v=new viru();
        v.print();
        return solve(root, targetSum);
    }
}