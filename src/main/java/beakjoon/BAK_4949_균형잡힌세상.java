package beakjoon;

import java.io.*;
import java.util.*;

/**
 * Date : 2021.07.23
 * Title : 균형잡힌 세상 (https://www.acmicpc.net/problem/4949)
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
            String input = br.readLine();
            
            if (input.equals(".")) {
                bw.flush();
                return;
            }
            
            bw.write(isBalanced(input));
        }
	}
    
    public static String isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        boolean result = true;
        
        for (char one : s.toCharArray()) {
            if (one == '(' || one == '[') {
                st.push(one);
            } else if (one == ')') {
                if (st.isEmpty() || st.pop() != '(') {
                    result = false;
                    break;
                }
            } else if (one == ']') {
                if (st.isEmpty() || st.pop() != '[') {
                    result = false;
                    break;
                }
            }
        }
        
        if (!st.isEmpty()) {
            result = false;
        }
        
        return result ? "yes\n" : "no\n";
    }
}