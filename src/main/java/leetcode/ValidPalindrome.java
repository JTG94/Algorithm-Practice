package leetcode;

/**
 * Date : 2021.06.26
 * Title : Valid Palindrome (https://leetcode.com/problems/valid-palindrome/)
 * Difficulty : Easy
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i+1).matches("^[a-zA-Z0-9]*$")) {
                sb.append(s.substring(i, i+1));
            }
        }
        
        String str = sb.toString().toLowerCase();
        boolean result = true;
 
        for (int i = 0; i <= str.length()/2 - 1; i++) {
            System.out.println(str.charAt(str.length()-1-i));
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }   
        }
        
        return result;
    }
}