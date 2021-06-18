package programmers;
import java.util.*;

/**
 * Date : 2021.06.18
 * Title : 짝지어 제거하기 (https://programmers.co.kr/learn/courses/30/lessons/12973)
 * Difficulty : Level 2
 */
public class PM_level2_짝지어제거하기 {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> st = new Stack<>();
        char[] char_arr = s.toCharArray();
        
        for (int i = 0; i < char_arr.length; i++) {
            if (!st.empty()) {
                if (st.peek() == char_arr[i]) {
                    st.pop();
                } else {
                    st.push(char_arr[i]);
                }
            } else {
                st.push(char_arr[i]);
            }
        }
        
        if (st.empty()) {
            answer = 1;
        }
        
        return answer;
    }
}