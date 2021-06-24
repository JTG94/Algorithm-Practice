package leetcode;

/**
 * Date : 2021.06.24
 * Title : Length of Last Word (https://leetcode.com/problems/length-of-last-word/)
 * Difficulty : Easy
 */
 public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String[] split_s = s.split(" ");
        
        if (split_s.length == 0) {
            return 0;
        }
        return split_s[split_s.length - 1].length();
    }
 }