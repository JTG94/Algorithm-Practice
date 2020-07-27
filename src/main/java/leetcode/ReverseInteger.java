package leetcode;
/**
 * Date : 2020.07.27
 * Title : Reverse Integer (https://leetcode.com/problems/reverse-integer/)
 * Difficulty : Easy
 */
public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int remainder = x % 10;
            x = x / 10;

            //In Java, the integer ranges from -2,147,483,648 to +2,147,483,647
            if (result > (Integer.MAX_VALUE / 10) || (result == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0;
            }

            if (result < (Integer.MIN_VALUE / 10) || (result == Integer.MIN_VALUE / 10 && remainder < -8)) {
                return 0;
            }

            result = result * 10 + remainder;
        }
        return result;
    }
}
