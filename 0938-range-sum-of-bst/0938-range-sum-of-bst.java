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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        
        int sum = 0;
        int lowIdx = -1;
        for(int i = 0; i<list.size(); i++){
            int curr = list.get(i);
            if(curr>=low){
                lowIdx = i;
                break;
            }
        }

        if(lowIdx == -1) return 0;
        while(lowIdx<list.size() && list.get(lowIdx)<=high){
            sum+=list.get(lowIdx);
            lowIdx++;
        }
        return sum;
    }

    public void inorder(TreeNode root, List<Integer> list){
        if(root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}