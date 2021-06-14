package leetcode;

/**
 * Date : 2021.06.14
 * Title : Palindrome Number (https://leetcode.com/problems/palindrome-number/)
 * Difficulty : Easy
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        String xStr = String.valueOf(x);
        
        for (int i = 0; i <xStr.length()/2; i++) {
            if(!(xStr.charAt(i) == xStr.charAt(xStr.length() - 1 - i))) return false;
        }
        
        return true;
    }
}
