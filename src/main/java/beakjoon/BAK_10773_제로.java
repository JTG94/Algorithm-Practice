package beakjoon;

import java.util.*;

/**
 * Date : 2021.07.17
 * Title : 제로 (https://www.acmicpc.net/problem/10773)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    Stack<Integer> stack = new Stack<>();
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            
            if (number == 0) {
                stack.pop();
            } else {
                stack.push(number);
            }
        }
        
        int result = 0;
        if (!stack.isEmpty()) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                result += stack.pop();
            }
        }
        
        System.out.println(result);
    }
}