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
    public int sumRootToLeaf(TreeNode root) {
        if(root == null) return 0;
        List<String> list = new ArrayList<>();
        preOrder(root,"", list);
        int sum = 0;
        for(int i = 0; i<list.size(); i++){
            int num = Integer.parseInt(list.get(i), 2);
            sum+=num;
        }

        return sum;
    }

    private void preOrder(TreeNode root, String str, List<String> list){
        if(root == null) return;
        str += root.val;
        if(root.left == null && root.right == null){
            list.add(str);
            str = "";
        }
        preOrder(root.left, str, list);
        preOrder(root.right, str, list);
    }
}