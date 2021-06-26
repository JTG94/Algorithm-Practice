package leetcode;

import java.util.*;
/**
 * Date : 2021.06.26
 * Title : Single Number (https://leetcode.com/problems/single-number/)
 * Difficulty : Easy
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if(flag) {
                flag = false;
                continue;
            }
            
            if (nums[i] == nums[i+1]) {
                flag = true;
                continue;
            } else {
                return nums[i];
            }
        }
    
        return nums[nums.length-1];
    }
}
