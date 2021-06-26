package leetcode;

/**
 * Date : 2021.06.26
 * Title : Convert Sorted Array to Binary Search Tree (https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)
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
 public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return settingBST(nums, 0, nums.length - 1);
    }
    
    public TreeNode settingBST(int[] nums, int start, int end) {
        if (start > end) return null;
        
        int mid = start + (end - start)/2;
        return new TreeNode(
            nums[mid],
            settingBST(nums, start, mid-1),
            settingBST(nums, mid+1, end)
        );
    } 
 }