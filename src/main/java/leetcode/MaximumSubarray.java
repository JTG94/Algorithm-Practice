package leetcode;

/**
 * Date : 2021.06.23
 * Title : Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)
 * Difficulty : Easy
 */
 public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i]+currentSum, nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        
        return maxSum;
    }
 }