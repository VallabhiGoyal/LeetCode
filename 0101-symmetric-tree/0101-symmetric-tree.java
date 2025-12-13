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
    public boolean isSymmetric(TreeNode root) {

        if(root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currLevel = new ArrayList<>(levelSize);

            for(int i = 0; i<levelSize; i++){
                TreeNode node = queue.poll();
                
                if(node == null){
                    currLevel.add(null);
                }else{
                    currLevel.add(node.val);
                    queue.offer(node.left);
                    queue.offer(node.right);             
                }
            }
            System.out.println(currLevel);
            int l = 0;
            int r = currLevel.size() -1;
            while(l<r){
                if(!Objects.equals(currLevel.get(l), currLevel.get(r))) return false;
                l++;
                r--;
            }
        }

        return true;
    }
}