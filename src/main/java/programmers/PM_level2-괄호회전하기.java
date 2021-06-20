package programmers;
import java.util.*;

/**
 * Date : 2021.06.20
 * Title : 괄호 회전하기 (https://programmers.co.kr/learn/courses/30/lessons/76502)
 * Difficulty : Level 2
 */
 public class PM_level2_괄호회전하기 {
     public int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1, s.length()) + s.substring(0, 1);
            
            boolean result = isValidString(s.toCharArray());
            
            if (result) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public boolean isValidString(char[] c) {
        boolean isValid = false;

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < c.length; i++) {
            if (st.empty()) {
                if (c[i] == ')' || c[i] == ']' || c[i] == '}') {
                    return false;
                }
                st.push(c[i]);
            } else {
                if (st.peek() == '(' && c[i] == ')') {
                    st.pop();
                } else if (st.peek() == '[' && c[i] == ']') {
                    st.pop();
                } else if (st.peek() == '{' && c[i] == '}') {
                    st.pop();
                } else {
                    st.push(c[i]);
                }
            }
        }
        
        if (st.empty()) {
            isValid = true;
        }
        
        return isValid;
    }
 }