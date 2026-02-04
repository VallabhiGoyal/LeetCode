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
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        int balance = Math.abs(height(root.left) - height(root.right));
        if(balance<=1) return true;
        else return false;
        
    }

    private int height(TreeNode root){
        if(root == null) return 0;
        int high = Math.max(height(root.left), height(root.right)) + 1;
        return high;
    }

}