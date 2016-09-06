/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        
        if (root.left == null && root.right == null){
            return 1;
        }
        
        int leftDepth = 0, rightDepth = 0;
        
        if (root.left != null){
            leftDepth = maxDepth(root.left) + 1;
        }
        
        if (root.right != null){
            rightDepth = maxDepth(root.right) + 1;
        }
        
        if ((leftDepth >= rightDepth && leftDepth != 0) || rightDepth == 0){
            return leftDepth;
        }
        return rightDepth;
    }
}
