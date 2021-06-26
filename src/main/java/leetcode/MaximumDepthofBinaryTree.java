package leetcode;

/**
 * Date : 2021.06.26
 * Title : Maximum Depth of Binary Tree (https://leetcode.com/problems/maximum-depth-of-binary-tree/)
 * Difficulty : Easy
 */
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
public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        return checkDepth(root, 0);
    }
    
    public int checkDepth(TreeNode node, int depth) {
        if (node == null) return depth;
        
        return Math.max(checkDepth(node.left, depth + 1), checkDepth(node.right, depth + 1));
    }
}