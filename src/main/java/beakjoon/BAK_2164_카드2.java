package beaksjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Date : 2021.07.23
 * Title : 카드2 (https://www.acmicpc.net/problem/2164)
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
        Deque<Integer> dq = new ArrayDeque<>();
        
        for (int i = 1; i <= N; i++) {
            dq.offerLast(i);
        }
        
        while(true) {
            if (dq.size() == 1) {
                break;
            }
            dq.remove();
           
            int num = dq.pollFirst();
            dq.addLast(num);
        }
        
        System.out.println(dq.peek());
	}
}