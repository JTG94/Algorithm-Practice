package leetcode;

/**
 * Date : 2021.06.26
 * Title : Climbing Stairs (https://leetcode.com/problems/climbing-stairs/)
 * Difficulty : Easy
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for (int i = 2; i < n+1; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n];
    }
}