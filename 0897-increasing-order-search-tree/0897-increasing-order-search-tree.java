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
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return root;
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return createBST(list);
    }

    private void inorder(TreeNode root, List<Integer> list){
        if(root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    private TreeNode createBST(List<Integer> list){
        if(list.isEmpty()) return null;
        TreeNode root = new TreeNode(list.remove(0));
        TreeNode temp = root;

        while(!list.isEmpty()){
            temp.right = new TreeNode(list.remove(0));
            temp = temp.right;
        }

        return root;
    }
}