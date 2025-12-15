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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;

        if(n == 0) return null;

        int i = 0;
        TreeNode root = new TreeNode(preorder[i]);

        int j = 0;
        for(j = 0; j<n; j++){
            if(inorder[j] == root.val){
                break;
            }
        }

        root.left = buildTree(subArray(preorder, 1, j), subArray(inorder, 0, j-1));

        root.right = buildTree(subArray(preorder, j+1, n-1), subArray(inorder, j+1, n-1));
        
        return root;
    }

    public int[] subArray(int[] nums, int start, int end){
        if(start>end) return new int[0];
        int[] sub = new int[end-start+1];
        int j = 0;
        for(int i = start; i<=end; i++){
            sub[j++] = nums[i];
        }

        return sub;
    }
}