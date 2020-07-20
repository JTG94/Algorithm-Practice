package codility;
import java.util.*;
/**
 * Date : 2020.07.20
 * Title : Binary Gap
 * Difficulty : Lesson 1
 */
public class BinaryGap {
    public int solution(int N) {
        // write your code in Java SE 8
        String binaryString = Integer.toBinaryString(N);

        char[] binaryChar = binaryString.toCharArray();
        int longestGap = 0;
        int tempGap = 0;

        for(int i=0;i<binaryChar.length;++i) {
            if (binaryChar[i] == '1') {
                if (tempGap > longestGap) longestGap = tempGap;
                tempGap = 0;
            } else {
                ++tempGap;
            }
        }
        return longestGap;
    }
}
