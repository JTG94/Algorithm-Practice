package leetcode;

import java.util.*;

/**
 * Date : 2021.06.26
 * Title : Binary Tree Inorder Traversal (https://leetcode.com/problems/binary-tree-inorder-traversal/)
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
 public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traverse(res, root);
        return res;
    }
    
    public void traverse(List<Integer> res, TreeNode node) {
        if (node == null) return;
        
        traverse(res, node.left);
        res.add(node.val);
        traverse(res, node.right);
    }
 }
