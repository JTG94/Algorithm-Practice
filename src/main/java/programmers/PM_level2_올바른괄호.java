package programmers;
import java.util.*;

/**
 * Date : 2020.10.09
 * Title : 올바른 괄호 (https://programmers.co.kr/learn/courses/30/lessons/12909)
 * Difficulty : Level 2
 */
public class PM_level2_올바른괄호 {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> st = new Stack<Character>();

        for(int i = 0; i < s.length(); i++) {
            if(!st.isEmpty() && (st.peek() == '(' && s.charAt(i) == ')')) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        if(st.isEmpty()) {
            answer = true;
        }

        return answer;
    }
}
