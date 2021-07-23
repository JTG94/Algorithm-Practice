package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Date : 2021.07.23
 * Title : 분해합 (https://www.acmicpc.net/problem/2231)
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    String N = br.readLine();
        
        int start = Integer.parseInt(N) - (N.length() * 9);
        
        if (start < 0) {
            start = 0;
        }
        int result = 0;
        for (int i = start; i < Integer.parseInt(N); i++) {
            int sum = 0;
            for (int j = 0; j < Integer.toString(i).length(); j++) {
                sum += Integer.toString(i).charAt(j) - '0';
            }
            
            if (Integer.parseInt(N) == i + sum) {
                result = i;
                break;
            }
        }
        
        System.out.println(result);
	}
}
