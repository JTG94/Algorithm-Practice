package programmers;
import java.util.*;

/**
 * Date : 2020.10.14
 * Title : 문자열 압축 (https://programmers.co.kr/learn/courses/30/lessons/60057)
 * Difficulty : Level 2
 */
public class PM_level2_문자열압축 {
    public int solution(String s) {
        int split_range = s.length()/2;
        int[] answer = new int[split_range];
        if(s.length() == 1) {
            return 1;
        }
        for(int i = 1; i <= split_range; i++) {
            answer[i-1] = getCompressedStringLength(s, i);
        }

        Arrays.sort(answer);
        return answer[0];
    }

    public static int getCompressedStringLength(String s, int range) {
        StringBuilder sb = new StringBuilder();

        int repetCnt = 1;
        String temp = s.substring(0, range);
        int index = s.length()/range;

        for(int i = 2; i <= index; i++) {
            if(temp.equals(s.substring(i*range-range, i*range))) {
                ++repetCnt;
            } else {
                if(repetCnt != 1) {
                    sb.append(String.valueOf(repetCnt));
                    repetCnt = 1;
                }
                sb.append(temp);
            }
            temp = s.substring(i*range-range, i*range);
        }

        if(repetCnt != 1) {
            sb.append(String.valueOf(repetCnt));
        }
        sb.append(temp);
        int last_index = range*index;

        if(last_index < s.length()) {
            sb.append(s.substring(last_index, s.length()));
        }
        return sb.length();
    }
}
