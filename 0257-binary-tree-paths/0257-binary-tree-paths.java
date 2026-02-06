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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root == null) return list;
        paths(root,"", list);
        return list;
    }

    private void paths(TreeNode root, String currPath, List<String> list){
        if(root == null) return;
        if(currPath.isEmpty()){
            currPath = String.valueOf(root.val);
        }else{
            currPath += "->" + root.val;
        }
        
        if(root.left == null && root.right == null){
            list.add(currPath);
            return;
        }

        paths(root.left, currPath, list);
        paths(root.right, currPath, list);
    }
}