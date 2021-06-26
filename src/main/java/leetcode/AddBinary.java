package leetcode;

/**
 * Date : 2021.06.26
 * Title : Add Binary (https://leetcode.com/problems/add-binary/)
 * Difficulty : Easy
 */
 public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        String long_str = "";
        String short_str = "";
        
        int a_len = a.length();
        int b_len = b.length();
        
        if (a_len >= b_len) {
            long_str = a;
            short_str = b;
        } else {
            long_str = b;
            short_str = a;
        }
        
        boolean round_up = false;
        int short_len = short_str.length() - 1;
        for (int i = long_str.length() - 1; i >= 0; i--) {
            int s_val = 0;
            int l_val = Integer.parseInt(long_str.substring(i, i+1));
            
            if (short_len >= 0) {
                    s_val = Integer.parseInt(short_str.substring(short_len, short_len + 1));
                    short_len--;
            }
            
            int sum = s_val + l_val;
            if (round_up) {
                sum += 1;
                round_up = false;
            }
            
            sb.append(Integer.toString(sum%2));
            if (sum/2 >= 1) {
                round_up = true;
            }
        }
        
        if (round_up) sb.append("1");
        
        return sb.reverse().toString();
    }
 }