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
        return checkHt(root) != -1;
    }
    private int checkHt(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftHt = checkHt(root.left);
        if(leftHt == -1){
            return -1;
        }

        int rightHt = checkHt(root.right);
        if(rightHt == -1){
            return -1;
        }

        if(Math.abs(leftHt - rightHt) > 1) {
            return -1;
        }
        
        return 1+ Math.max(leftHt, rightHt);
    }
}