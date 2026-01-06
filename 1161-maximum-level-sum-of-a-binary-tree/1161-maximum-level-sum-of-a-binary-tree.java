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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int MaxSum = Integer.MIN_VALUE;
        int level = 0;
        int ansLevel = 0;
        while(!queue.isEmpty()){
            int sum = 0;
            int size = queue.size();
            level++;

            for(int i = 0; i<size; i++){
                TreeNode curr = queue.remove();
                sum+=curr.val;
                
                if(curr.left != null){
                    queue.offer(curr.left);
                }
                if(curr.right != null){
                    queue.offer(curr.right);
                }
            }

            if(sum>MaxSum){
                MaxSum = sum;
                ansLevel = level;
            }
        }

        return ansLevel;
    }
}