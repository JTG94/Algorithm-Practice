package leetcode;

/**
 * Date : 2021.06.24
 * Title : Plus One (https://leetcode.com/problems/plus-one/submissions/)
 * Difficulty : Easy
 */
 public class PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        
        for (int i = len-1; i >= 0; i--) {
            digits[i]++;
            
            if (digits[i] < 10) {
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int[] res = new int[len+1];
        res[0] = 1;
        
        return res;
    }
 }