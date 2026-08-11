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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;
        TreeNode lastVisited = null;

        while(current != null || !stack.isEmpty()) {

            while(current != null){
                stack.push(current);
                current = current.left;
            }

            TreeNode peek = stack.peek();

            if(peek.right != null && peek.right != lastVisited) {
                current = peek.right;
            } else {
                ans.add(peek.val);
                lastVisited = stack.pop();
            }
        }
        return ans;
    }
}