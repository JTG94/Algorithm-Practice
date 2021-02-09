package codility;
import java.util.*;
/**
 * Date : 2021.02.09
 * Title : Brackets
 * Difficulty : Lesson 6 - Stacks and Queues
 * Detected time complexity : O(N)
 */
public class Brackets {
    public int solution(String S) {
        // write your code in Java SE 11
        Stack<Character> st = new Stack<>();

        for(char c : S.toCharArray()) {
            if (c == '(' || c == '[' || c =='{') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return 0;
                }

                if (c == ')' && st.peek() != '(') {
                    return 0;
                } else if (c == '}' && st.peek() != '{') {
                    return 0;
                } else if (c == ']' && st.peek() != '[') {
                    return 0;
                }
                st.pop();
            }
        }

        return st.isEmpty() ? 1 : 0;
    }
}
