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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHt = height(root.left);
        int rightHt = height(root.right);

        diameter = Math.max(diameter, leftHt + rightHt);

        return 1 + Math.max(leftHt, rightHt);
    }
}